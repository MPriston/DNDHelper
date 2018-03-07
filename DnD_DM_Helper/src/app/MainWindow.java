package app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MainWindow {

	private JFrame frmDmHelper;
	private JPanel iniPanel, formMPanel;
	private JLabel quote;
	
	
	private void falseall() {
		iniPanel.setVisible(false);
		formMPanel.setVisible(false);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmDmHelper.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		frmDmHelper = new JFrame();
		frmDmHelper.setResizable(false);
		ImageIcon icon = new ImageIcon("Resources\\&transparent.png");
		frmDmHelper.setIconImage(icon.getImage());
		frmDmHelper.setTitle("Dungeon Master Helper");
		frmDmHelper.setBounds(100, 100, 1280, 800);
		frmDmHelper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDmHelper.getContentPane().setLayout(new CardLayout(0, 0));
		
		iniPanel = new JPanel();
		iniPanel.setBackground(new Color(255, 228, 181));
		frmDmHelper.getContentPane().add(iniPanel, "name_950530880029850");
		iniPanel.setLayout(null);
		
		JLabel logoDnd = new JLabel("");
		logoDnd.setBounds(286, 129, 674, 320);
		ImageIcon logo = new ImageIcon("Resources\\DD-Transparent-Bege.png");
		logoDnd.setIcon(logo);
		iniPanel.add(logoDnd);
		
		quote = new JLabel(Quotes.quote());
		quote.setForeground(new Color(128, 0, 0));
		quote.setFont(new Font("Palatino Linotype", Font.BOLD, 29));
		quote.setHorizontalAlignment(SwingConstants.CENTER);
		quote.setBounds(12, 476, 1250, 84);
		iniPanel.add(quote);
		
		formMPanel = new JPanel();
		formMPanel.setBackground(new Color(255, 228, 181));
		frmDmHelper.getContentPane().add(formMPanel, "name_954097600786134");
		formMPanel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 228, 181));
		frmDmHelper.setJMenuBar(menuBar);
		
		JMenu mnMonsters = new JMenu("Monsters");
		mnMonsters.setForeground(new Color(0, 0, 0));
		mnMonsters.setHorizontalAlignment(SwingConstants.CENTER);
		mnMonsters.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		menuBar.add(mnMonsters);
		
		JMenuItem mntmCreateMonster = new JMenuItem("Create Monster");
		mntmCreateMonster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				falseall();
				formMPanel.setVisible(true);
			}
		});
		mntmCreateMonster.setForeground(new Color(0, 0, 0));
		mntmCreateMonster.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		mnMonsters.add(mntmCreateMonster);
		
		JMenuItem mntmSearchMonters = new JMenuItem("Search Monters");
		mntmSearchMonters.setForeground(new Color(0, 0, 0));
		mntmSearchMonters.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		mnMonsters.add(mntmSearchMonters);
	}
}
