package app;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainWindow {

	private JFrame frmDmHelper;

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
		frmDmHelper.setTitle("DM Helper");
		frmDmHelper.setBounds(100, 100, 1280, 800);
		frmDmHelper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
