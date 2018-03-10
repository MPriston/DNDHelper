package app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class MainWindow {

	private JFrame frmDmHelper;
	private JPanel iniPanel, formMPanel;
	private JLabel quote, lblStrMod, lblDexMod, lblConMod, lblInteMod, lblWisMod, lblChaMod;
	private JTextField tfMonst;
	private JTextField tfHpF;
	private JTextField tfHpB;
	private JTextField tfSpeed;
	private JComboBox cbAlig, cbSize, cbType;
	private JSpinner sAC, sHP, sStr, sDex, sCon, sInte, sWis, sCha;
	
	
	private void falseall() {
		iniPanel.setVisible(false);
		formMPanel.setVisible(false);
	}
	
	private void cleanMForm() {
		tfMonst.setText(null);
		tfHpF.setText(null);
		tfHpB.setText(null);
		tfSpeed.setText(null);
		
		cbAlig.setSelectedIndex(0);
		cbSize.setSelectedIndex(0);
		cbType.setSelectedIndex(0);
		
		sAC.setValue(Integer.parseInt("0"));
		sHP.setValue(Integer.parseInt("0"));
		sStr.setValue(Integer.parseInt("0"));
		sDex.setValue(Integer.parseInt("0"));
		sCon.setValue(Integer.parseInt("0"));
		sInte.setValue(Integer.parseInt("0"));
		sWis.setValue(Integer.parseInt("0"));
		sCha.setValue(Integer.parseInt("0"));
		
		lblStrMod.setText(null);
		lblDexMod.setText(null);
		lblConMod.setText(null);
		lblInteMod.setText(null);
		lblWisMod.setText(null);
		lblChaMod.setText(null);
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
		lblMonster.setBounds(12, 13, 98, 24);
		lblMonster.setForeground(new Color(128, 0, 0));
		lblMonster.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblMonster.setHorizontalAlignment(SwingConstants.LEFT);
		formMPanel.add(lblMonster);
		
		tfMonst = new JTextField();
		tfMonst.setBounds(115, 13, 149, 24);
		lblMonster.setLabelFor(tfMonst);
		tfMonst.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfMonst);
		tfMonst.setColumns(10);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(12, 50, 56, 24);
		lblSize.setForeground(new Color(128, 0, 0));
		lblSize.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblSize);
		
		cbSize = new JComboBox();
		cbSize.setBounds(69, 50, 184, 25);
		cbSize.setBackground(new Color(255, 228, 181));
		cbSize.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbSize.setModel(new DefaultComboBoxModel(new String[] {"Tiny", "Small", "Medium", "Large", "Huge", "Gargantuan"}));
		cbSize.setSelectedIndex(0);
		formMPanel.add(cbSize);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(12, 86, 69, 24);
		lblType.setForeground(new Color(128, 0, 0));
		lblType.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblType);
		
		cbType = new JComboBox();
		cbType.setBounds(80, 87, 184, 24);
		cbType.setModel(new DefaultComboBoxModel(new String[] {"Aberration", "Beast", "Celestial", "Construct", "Dragon", "Elemental", "Fey", "Fiend", "Giant", "Humanoid", "Monstrosity", "Ooze", "Plant", "Undead"}));
		cbType.setSelectedIndex(0);
		cbType.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(cbType);
		
		JLabel lblAl = new JLabel("Alignment:");
		lblAl.setBounds(12, 123, 129, 25);
		lblAl.setForeground(new Color(128, 0, 0));
		lblAl.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblAl.setBackground(Color.WHITE);
		formMPanel.add(lblAl);
		
		cbAlig = new JComboBox();
		cbAlig.setBounds(139, 125, 184, 25);
		cbAlig.setForeground(new Color(0, 0, 0));
		cbAlig.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbAlig.setModel(new DefaultComboBoxModel(new String[] {"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chotic Evil", "Unaligned"}));
		cbAlig.setSelectedIndex(0);
		formMPanel.add(cbAlig);
		
		JLabel lblArmorClass = new JLabel("Armor Class:");
		lblArmorClass.setBounds(12, 161, 141, 24);
		lblArmorClass.setForeground(new Color(128, 0, 0));
		lblArmorClass.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblArmorClass);
		
		sAC = new JSpinner();
		sAC.setBounds(160, 162, 45, 24);
		sAC.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		sAC.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(sAC);
		
		JLabel lblHp = new JLabel("Hp:");
		lblHp.setBounds(12, 198, 45, 24);
		lblHp.setForeground(new Color(128, 0, 0));
		lblHp.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHp);
		
		sHP = new JSpinner();
		sHP.setBounds(56, 199, 56, 24);
		sHP.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(sHP);
		
		JLabel lblEx = new JLabel("Ex: 122");
		lblEx.setBounds(124, 204, 56, 16);
		lblEx.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblEx.setForeground(new Color(128, 0, 0));
		formMPanel.add(lblEx);
		
		JLabel lblHpFormula = new JLabel("Hp Formula:");
		lblHpFormula.setBounds(12, 235, 141, 24);
		lblHpFormula.setForeground(new Color(128, 0, 0));
		lblHpFormula.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHpFormula);
		
		tfHpF = new JTextField();
		tfHpF.setBounds(151, 236, 69, 24);
		tfHpF.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfHpF);
		tfHpF.setColumns(10);
		
		JLabel lblex2 = new JLabel("Ex: 12d8");
		lblex2.setBounds(230, 241, 69, 16);
		lblex2.setForeground(new Color(128, 0, 0));
		lblex2.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(lblex2);
		
		JLabel lblHpBonus = new JLabel("Hp Bonus:");
		lblHpBonus.setBounds(12, 272, 116, 24);
		lblHpBonus.setForeground(new Color(128, 0, 0));
		lblHpBonus.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHpBonus);
		
		tfHpB = new JTextField();
		tfHpB.setBounds(133, 273, 63, 24);
		tfHpB.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfHpB);
		tfHpB.setColumns(10);
		
		JLabel lblExOr = new JLabel("Ex: +36 or -34");
		lblExOr.setBounds(208, 274, 98, 24);
		lblExOr.setForeground(new Color(128, 0, 0));
		lblExOr.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(lblExOr);
		
		JLabel lblSpeed = new JLabel("Speed:");
		lblSpeed.setBounds(12, 309, 79, 24);
		lblSpeed.setForeground(new Color(128, 0, 0));
		lblSpeed.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblSpeed);
		
		tfSpeed = new JTextField();
		tfSpeed.setBounds(90, 310, 174, 24);
		tfSpeed.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfSpeed);
		tfSpeed.setColumns(10);
		
		JLabel lblStr = new JLabel("Strength:");
		lblStr.setBounds(12, 394, 101, 25);
		lblStr.setForeground(new Color(128, 0, 0));
		lblStr.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblStr);
		
		sStr = new JSpinner();
		sStr.setBounds(115, 395, 45, 24);
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
		formMPanel.add(sStr);
		
		lblStrMod = new JLabel("");
		lblStrMod.setBounds(164, 394, 56, 24);
		lblStrMod.setForeground(new Color(128, 0, 0));
		lblStrMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblStrMod);
		
		JLabel lblabilityScores = new JLabel("Ability Scores");
		lblabilityScores.setForeground(new Color(128, 0, 0));
		lblabilityScores.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblabilityScores.setHorizontalAlignment(SwingConstants.CENTER);
		lblabilityScores.setBounds(12, 357, 311, 24);
		formMPanel.add(lblabilityScores);
		
		JLabel lblDex = new JLabel("Dexterity:");
		lblDex.setForeground(new Color(128, 0, 0));
		lblDex.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblDex.setBounds(10, 432, 107, 24);
		formMPanel.add(lblDex);
		
		sDex = new JSpinner();
		sDex.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				String sm; 
				int sv = (int)sDex.getValue();
				int s = (int)sDex.getValue();
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
				lblDexMod.setText(sm);
			}
		});
		sDex.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sDex.setBounds(124, 432, 45, 24);
		formMPanel.add(sDex);
		
		lblDexMod = new JLabel("");
		lblDexMod.setForeground(new Color(128, 0, 0));
		lblDexMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblDexMod.setBounds(174, 431, 56, 24);
		formMPanel.add(lblDexMod);
		
		JLabel lblCon = new JLabel("Constitution:");
		lblCon.setForeground(new Color(128, 0, 0));
		lblCon.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblCon.setBounds(12, 469, 148, 24);
		formMPanel.add(lblCon);
		
		sCon = new JSpinner();
		sCon.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String sm; 
				int sv = (int)sCon.getValue();
				int s = (int)sCon.getValue();
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
				lblConMod.setText(sm);
			}
		});
		sCon.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sCon.setBounds(160, 471, 45, 24);
		formMPanel.add(sCon);
		
		lblConMod = new JLabel("");
		lblConMod.setForeground(new Color(128, 0, 0));
		lblConMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblConMod.setBounds(208, 471, 56, 24);
		formMPanel.add(lblConMod);
		
		JLabel lblInte = new JLabel("Inteligence:");
		lblInte.setForeground(new Color(128, 0, 0));
		lblInte.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblInte.setBounds(12, 506, 129, 25);
		formMPanel.add(lblInte);
		
		sInte = new JSpinner();
		sInte.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String sm; 
				int sv = (int)sInte.getValue();
				int s = (int)sInte.getValue();
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
				lblInteMod.setText(sm);
			}
		});
		sInte.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sInte.setBounds(145, 508, 45, 24);
		formMPanel.add(sInte);
		
		lblInteMod = new JLabel("");
		lblInteMod.setForeground(new Color(128, 0, 0));
		lblInteMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblInteMod.setBounds(197, 508, 56, 24);
		formMPanel.add(lblInteMod);
		
		JLabel lblWis = new JLabel("Wisdom:");
		lblWis.setForeground(new Color(128, 0, 0));
		lblWis.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblWis.setBounds(12, 544, 101, 25);
		formMPanel.add(lblWis);
		
		sWis = new JSpinner();
		sWis.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String sm; 
				int sv = (int)sWis.getValue();
				int s = (int)sWis.getValue();
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
				lblWisMod.setText(sm);
			}
		});
		sWis.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sWis.setBounds(115, 546, 45, 24);
		formMPanel.add(sWis);
		
		lblWisMod = new JLabel("");
		lblWisMod.setForeground(new Color(128, 0, 0));
		lblWisMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblWisMod.setBounds(164, 545, 56, 24);
		formMPanel.add(lblWisMod);
		
		JLabel lblCha = new JLabel("Charisma:");
		lblCha.setForeground(new Color(128, 0, 0));
		lblCha.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblCha.setBounds(12, 582, 116, 25);
		formMPanel.add(lblCha);
		
		sCha = new JSpinner();
		sCha.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String sm; 
				int sv = (int)sCha.getValue();
				int s = (int)sCha.getValue();
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
				lblChaMod.setText(sm);
			}
		});
		sCha.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sCha.setBounds(124, 584, 45, 24);
		formMPanel.add(sCha);
		
		lblChaMod = new JLabel("");
		lblChaMod.setForeground(new Color(128, 0, 0));
		lblChaMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblChaMod.setBounds(174, 585, 56, 24);
		formMPanel.add(lblChaMod);
		
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
				cleanMForm();
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
