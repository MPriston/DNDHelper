package app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class MainWindow {

	private JFrame frmDmHelper;
	private JPanel iniPanel, formMPanel;
	private JLabel quote, lblStrMod;
	private JTextField tfMonst;
	private JTextField tfHpF;
	private JTextField tfHpB;
	private JTextField tfSpeed;
	
	
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
		frmDmHelper.setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/logos/& Transparent.png")));
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
		logoDnd.setIcon(new ImageIcon(MainWindow.class.getResource("/logos/DD-Transparent-Bege.png")));
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
		
		JLabel lblMonster = new JLabel("Monster:");
		lblMonster.setForeground(new Color(128, 0, 0));
		lblMonster.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblMonster.setHorizontalAlignment(SwingConstants.LEFT);
		lblMonster.setBounds(12, 13, 98, 24);
		formMPanel.add(lblMonster);
		
		tfMonst = new JTextField();
		lblMonster.setLabelFor(tfMonst);
		tfMonst.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfMonst.setBounds(115, 13, 149, 24);
		formMPanel.add(tfMonst);
		tfMonst.setColumns(10);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setForeground(new Color(128, 0, 0));
		lblSize.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSize.setBounds(12, 50, 56, 24);
		formMPanel.add(lblSize);
		
		JComboBox cbSize = new JComboBox();
		cbSize.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbSize.setModel(new DefaultComboBoxModel(new String[] {"Tiny", "Small", "Medium", "Large", "Huge", "Gargantuan"}));
		cbSize.setBounds(69, 50, 184, 25);
		formMPanel.add(cbSize);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setForeground(new Color(128, 0, 0));
		lblType.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblType.setBounds(12, 86, 69, 24);
		formMPanel.add(lblType);
		
		JComboBox cbType = new JComboBox();
		cbType.setModel(new DefaultComboBoxModel(new String[] {"Aberration", "Beast", "Celestial", "Construct", "Dragon", "Elemental", "Fey", "Fiend", "Giant", "Humanoid", "Monstrosity", "Ooze", "Plant", "Undead"}));
		cbType.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbType.setBounds(80, 87, 184, 24);
		formMPanel.add(cbType);
		
		JLabel lblAl = new JLabel("Alignment:");
		lblAl.setForeground(new Color(128, 0, 0));
		lblAl.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblAl.setBackground(Color.WHITE);
		lblAl.setBounds(12, 123, 129, 25);
		formMPanel.add(lblAl);
		
		JComboBox cbAlig = new JComboBox();
		cbAlig.setForeground(new Color(0, 0, 0));
		cbAlig.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbAlig.setModel(new DefaultComboBoxModel(new String[] {"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chotic Evil", "Unaligned"}));
		cbAlig.setBounds(139, 125, 184, 25);
		formMPanel.add(cbAlig);
		
		JLabel lblArmorClass = new JLabel("Armor Class:");
		lblArmorClass.setForeground(new Color(128, 0, 0));
		lblArmorClass.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblArmorClass.setBounds(12, 161, 141, 24);
		formMPanel.add(lblArmorClass);
		
		JSpinner sAC = new JSpinner();
		sAC.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		sAC.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sAC.setBounds(160, 162, 45, 24);
		formMPanel.add(sAC);
		
		JLabel lblHp = new JLabel("Hp:");
		lblHp.setForeground(new Color(128, 0, 0));
		lblHp.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblHp.setBounds(12, 198, 45, 24);
		formMPanel.add(lblHp);
		
		JSpinner sHP = new JSpinner();
		sHP.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sHP.setBounds(56, 199, 56, 24);
		formMPanel.add(sHP);
		
		JLabel lblEx = new JLabel("Ex: 122");
		lblEx.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblEx.setForeground(new Color(128, 0, 0));
		lblEx.setBounds(124, 204, 56, 16);
		formMPanel.add(lblEx);
		
		JLabel lblHpFormula = new JLabel("Hp Formula:");
		lblHpFormula.setForeground(new Color(128, 0, 0));
		lblHpFormula.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblHpFormula.setBounds(12, 235, 141, 24);
		formMPanel.add(lblHpFormula);
		
		tfHpF = new JTextField();
		tfHpF.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfHpF.setBounds(151, 236, 69, 24);
		formMPanel.add(tfHpF);
		tfHpF.setColumns(10);
		
		JLabel lblex2 = new JLabel("Ex: 12d8");
		lblex2.setForeground(new Color(128, 0, 0));
		lblex2.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblex2.setBounds(230, 241, 69, 16);
		formMPanel.add(lblex2);
		
		JLabel lblHpBonus = new JLabel("Hp Bonus:");
		lblHpBonus.setForeground(new Color(128, 0, 0));
		lblHpBonus.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblHpBonus.setBounds(12, 272, 116, 24);
		formMPanel.add(lblHpBonus);
		
		tfHpB = new JTextField();
		tfHpB.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfHpB.setBounds(133, 273, 63, 24);
		formMPanel.add(tfHpB);
		tfHpB.setColumns(10);
		
		JLabel lblExOr = new JLabel("Ex: +36 or -34");
		lblExOr.setForeground(new Color(128, 0, 0));
		lblExOr.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblExOr.setBounds(208, 274, 98, 24);
		formMPanel.add(lblExOr);
		
		JLabel lblSpeed = new JLabel("Speed:");
		lblSpeed.setForeground(new Color(128, 0, 0));
		lblSpeed.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSpeed.setBounds(12, 309, 79, 24);
		formMPanel.add(lblSpeed);
		
		tfSpeed = new JTextField();
		tfSpeed.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfSpeed.setBounds(90, 310, 174, 24);
		formMPanel.add(tfSpeed);
		tfSpeed.setColumns(10);
		
		JLabel lblStr = new JLabel("Strength:");
		lblStr.setForeground(new Color(128, 0, 0));
		lblStr.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblStr.setBounds(12, 346, 101, 25);
		formMPanel.add(lblStr);
		
		JSpinner sStr = new JSpinner();
		sStr.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				String sm; 
				int sv = (int)sStr.getValue();
				int s = (int)sStr.getValue();
				s-=10;
				s/=2;
				if(sv == 9) {
					sm = "-1";
				} else if(s<0) {
					if(sv%2==1) {
						s-=1;	
					}
					sm = String.valueOf(s);
				} else {
					sm = "+" + String.valueOf(s);
				}
				lblStrMod.setText(sm);
			}
		});
		sStr.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		sStr.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sStr.setBounds(124, 347, 45, 24);
		formMPanel.add(sStr);
		
		lblStrMod = new JLabel("");
		lblStrMod.setForeground(new Color(128, 0, 0));
		lblStrMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblStrMod.setBounds(181, 347, 56, 24);
		formMPanel.add(lblStrMod);
		
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
