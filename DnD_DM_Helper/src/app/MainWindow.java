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
	private JSpinner sAC, sHP, sStr, sDex, sCon, sInte, sWis, sCha, sSTStr, sSTDex, sSTCon, sSTInte, sSTWis, sSTCha;
	
	
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
		sSTStr.setValue(Integer.parseInt("0"));
		sSTDex.setValue(Integer.parseInt("0"));
		sSTCon.setValue(Integer.parseInt("0"));
		sSTInte.setValue(Integer.parseInt("0"));
		sSTWis.setValue(Integer.parseInt("0"));
		sSTCha.setValue(Integer.parseInt("0"));
		
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
		lblMonster.setBounds(66, 49, 98, 24);
		lblMonster.setForeground(new Color(128, 0, 0));
		lblMonster.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblMonster.setHorizontalAlignment(SwingConstants.LEFT);
		formMPanel.add(lblMonster);
		
		tfMonst = new JTextField();
		tfMonst.setBounds(169, 49, 149, 24);
		lblMonster.setLabelFor(tfMonst);
		tfMonst.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfMonst);
		tfMonst.setColumns(10);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(66, 86, 56, 24);
		lblSize.setForeground(new Color(128, 0, 0));
		lblSize.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblSize);
		
		cbSize = new JComboBox();
		cbSize.setBounds(123, 86, 184, 25);
		cbSize.setBackground(new Color(255, 228, 181));
		cbSize.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbSize.setModel(new DefaultComboBoxModel(new String[] {"Tiny", "Small", "Medium", "Large", "Huge", "Gargantuan"}));
		cbSize.setSelectedIndex(0);
		formMPanel.add(cbSize);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(66, 122, 69, 24);
		lblType.setForeground(new Color(128, 0, 0));
		lblType.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblType);
		
		cbType = new JComboBox();
		cbType.setBounds(134, 123, 184, 24);
		cbType.setModel(new DefaultComboBoxModel(new String[] {"Aberration", "Beast", "Celestial", "Construct", "Dragon", "Elemental", "Fey", "Fiend", "Giant", "Humanoid", "Monstrosity", "Ooze", "Plant", "Undead"}));
		cbType.setSelectedIndex(0);
		cbType.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(cbType);
		
		JLabel lblAl = new JLabel("Alignment:");
		lblAl.setBounds(66, 159, 129, 25);
		lblAl.setForeground(new Color(128, 0, 0));
		lblAl.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblAl.setBackground(Color.WHITE);
		formMPanel.add(lblAl);
		
		cbAlig = new JComboBox();
		cbAlig.setBounds(193, 161, 184, 25);
		cbAlig.setForeground(new Color(0, 0, 0));
		cbAlig.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbAlig.setModel(new DefaultComboBoxModel(new String[] {"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chotic Evil", "Unaligned"}));
		cbAlig.setSelectedIndex(0);
		formMPanel.add(cbAlig);
		
		JLabel lblArmorClass = new JLabel("Armor Class:");
		lblArmorClass.setBounds(66, 197, 141, 24);
		lblArmorClass.setForeground(new Color(128, 0, 0));
		lblArmorClass.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblArmorClass);
		
		sAC = new JSpinner();
		sAC.setBounds(214, 198, 45, 24);
		sAC.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		sAC.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(sAC);
		
		JLabel lblHp = new JLabel("Hp:");
		lblHp.setBounds(66, 234, 45, 24);
		lblHp.setForeground(new Color(128, 0, 0));
		lblHp.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHp);
		
		sHP = new JSpinner();
		sHP.setBounds(110, 235, 56, 24);
		sHP.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(sHP);
		
		JLabel lblEx = new JLabel("Ex: 122");
		lblEx.setBounds(178, 240, 56, 16);
		lblEx.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblEx.setForeground(new Color(128, 0, 0));
		formMPanel.add(lblEx);
		
		JLabel lblHpFormula = new JLabel("Hp Formula:");
		lblHpFormula.setBounds(66, 271, 141, 24);
		lblHpFormula.setForeground(new Color(128, 0, 0));
		lblHpFormula.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHpFormula);
		
		tfHpF = new JTextField();
		tfHpF.setBounds(205, 272, 69, 24);
		tfHpF.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfHpF);
		tfHpF.setColumns(10);
		
		JLabel lblex2 = new JLabel("Ex: 12d8");
		lblex2.setBounds(284, 277, 69, 16);
		lblex2.setForeground(new Color(128, 0, 0));
		lblex2.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(lblex2);
		
		JLabel lblHpBonus = new JLabel("Hp Bonus:");
		lblHpBonus.setBounds(66, 308, 116, 24);
		lblHpBonus.setForeground(new Color(128, 0, 0));
		lblHpBonus.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHpBonus);
		
		tfHpB = new JTextField();
		tfHpB.setBounds(187, 309, 63, 24);
		tfHpB.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfHpB);
		tfHpB.setColumns(10);
		
		JLabel lblExOr = new JLabel("Ex: +36 or -34");
		lblExOr.setBounds(262, 310, 98, 24);
		lblExOr.setForeground(new Color(128, 0, 0));
		lblExOr.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(lblExOr);
		
		JLabel lblSpeed = new JLabel("Speed:");
		lblSpeed.setBounds(66, 345, 79, 24);
		lblSpeed.setForeground(new Color(128, 0, 0));
		lblSpeed.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblSpeed);
		
		tfSpeed = new JTextField();
		tfSpeed.setBounds(144, 346, 174, 24);
		tfSpeed.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfSpeed);
		tfSpeed.setColumns(10);
		
		JLabel lblStr = new JLabel("Strength:");
		lblStr.setBounds(66, 439, 101, 25);
		lblStr.setForeground(new Color(128, 0, 0));
		lblStr.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblStr);
		
		sStr = new JSpinner();
		sStr.setBounds(172, 440, 45, 24);
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
		lblStrMod.setBounds(221, 439, 56, 24);
		lblStrMod.setForeground(new Color(128, 0, 0));
		lblStrMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblStrMod);
		
		JLabel lblabilityScores = new JLabel("Ability Scores");
		lblabilityScores.setForeground(new Color(128, 0, 0));
		lblabilityScores.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblabilityScores.setHorizontalAlignment(SwingConstants.CENTER);
		lblabilityScores.setBounds(66, 402, 311, 24);
		formMPanel.add(lblabilityScores);
		
		JLabel lblDex = new JLabel("Dexterity:");
		lblDex.setForeground(new Color(128, 0, 0));
		lblDex.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblDex.setBounds(69, 488, 107, 24);
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
		sDex.setBounds(183, 488, 45, 24);
		formMPanel.add(sDex);
		
		lblDexMod = new JLabel("");
		lblDexMod.setForeground(new Color(128, 0, 0));
		lblDexMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblDexMod.setBounds(233, 487, 56, 24);
		formMPanel.add(lblDexMod);
		
		JLabel lblCon = new JLabel("Constitution:");
		lblCon.setForeground(new Color(128, 0, 0));
		lblCon.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblCon.setBounds(69, 539, 148, 24);
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
		sCon.setBounds(217, 541, 45, 24);
		formMPanel.add(sCon);
		
		lblConMod = new JLabel("");
		lblConMod.setForeground(new Color(128, 0, 0));
		lblConMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblConMod.setBounds(265, 541, 56, 24);
		formMPanel.add(lblConMod);
		
		JLabel lblInte = new JLabel("Inteligence:");
		lblInte.setForeground(new Color(128, 0, 0));
		lblInte.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblInte.setBounds(69, 588, 129, 25);
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
		sInte.setBounds(202, 590, 45, 24);
		formMPanel.add(sInte);
		
		lblInteMod = new JLabel("");
		lblInteMod.setForeground(new Color(128, 0, 0));
		lblInteMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblInteMod.setBounds(254, 590, 56, 24);
		formMPanel.add(lblInteMod);
		
		JLabel lblWis = new JLabel("Wisdom:");
		lblWis.setForeground(new Color(128, 0, 0));
		lblWis.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblWis.setBounds(69, 639, 101, 25);
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
		sWis.setBounds(172, 641, 45, 24);
		formMPanel.add(sWis);
		
		lblWisMod = new JLabel("");
		lblWisMod.setForeground(new Color(128, 0, 0));
		lblWisMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblWisMod.setBounds(221, 640, 56, 24);
		formMPanel.add(lblWisMod);
		
		JLabel lblCha = new JLabel("Charisma:");
		lblCha.setForeground(new Color(128, 0, 0));
		lblCha.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblCha.setBounds(69, 684, 116, 25);
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
		sCha.setBounds(181, 686, 45, 24);
		formMPanel.add(sCha);
		
		lblChaMod = new JLabel("");
		lblChaMod.setForeground(new Color(128, 0, 0));
		lblChaMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblChaMod.setBounds(231, 687, 56, 24);
		formMPanel.add(lblChaMod);
		
		JLabel lblSavingThrows = new JLabel("Saving Throws");
		lblSavingThrows.setForeground(new Color(128, 0, 0));
		lblSavingThrows.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblSavingThrows.setHorizontalAlignment(SwingConstants.CENTER);
		lblSavingThrows.setBounds(727, 0, 446, 36);
		formMPanel.add(lblSavingThrows);
		
		JLabel lblLeaveBlackIf = new JLabel("leave blank if not mentioned");
		lblLeaveBlackIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeaveBlackIf.setForeground(new Color(128, 0, 0));
		lblLeaveBlackIf.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblLeaveBlackIf.setBounds(729, 32, 446, 16);
		formMPanel.add(lblLeaveBlackIf);
		
		JLabel lblStrength = new JLabel("Strength:");
		lblStrength.setForeground(new Color(128, 0, 0));
		lblStrength.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblStrength.setBounds(738, 66, 84, 24);
		formMPanel.add(lblStrength);
		
		JLabel lblDexterity = new JLabel("Dexterity:");
		lblDexterity.setForeground(new Color(128, 0, 0));
		lblDexterity.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblDexterity.setBounds(903, 66, 91, 24);
		formMPanel.add(lblDexterity);
		
		JLabel lblInteligence = new JLabel("Inteligence:");
		lblInteligence.setForeground(new Color(128, 0, 0));
		lblInteligence.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblInteligence.setBounds(738, 103, 107, 24);
		formMPanel.add(lblInteligence);
		
		JLabel lblContitution = new JLabel("Contitution:");
		lblContitution.setForeground(new Color(128, 0, 0));
		lblContitution.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblContitution.setBounds(1071, 66, 110, 24);
		formMPanel.add(lblContitution);
		
		JLabel lblWisdow = new JLabel("Wisdow:");
		lblWisdow.setForeground(new Color(128, 0, 0));
		lblWisdow.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblWisdow.setBounds(903, 103, 84, 24);
		formMPanel.add(lblWisdow);
		
		JLabel lblCharisma = new JLabel("Charisma:");
		lblCharisma.setForeground(new Color(128, 0, 0));
		lblCharisma.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblCharisma.setBounds(1071, 103, 92, 24);
		formMPanel.add(lblCharisma);
		
		sSTStr = new JSpinner();
		sSTStr.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		sSTStr.setBounds(830, 67, 42, 22);
		formMPanel.add(sSTStr);
		
		sSTInte = new JSpinner();
		sSTInte.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		sSTInte.setBounds(849, 104, 42, 22);
		formMPanel.add(sSTInte);
		
		sSTDex = new JSpinner();
		sSTDex.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		sSTDex.setBounds(999, 67, 42, 22);
		formMPanel.add(sSTDex);
		
		sSTWis = new JSpinner();
		sSTWis.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		sSTWis.setBounds(988, 104, 42, 22);
		formMPanel.add(sSTWis);
		
		sSTCon = new JSpinner();
		sSTCon.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		sSTCon.setBounds(1186, 67, 42, 22);
		formMPanel.add(sSTCon);
		
		sSTCha = new JSpinner();
		sSTCha.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		sSTCha.setBounds(1169, 104, 42, 22);
		formMPanel.add(sSTCha);
		
		JLabel lblMonsterInfo = new JLabel("Monster Info");
		lblMonsterInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonsterInfo.setForeground(new Color(128, 0, 0));
		lblMonsterInfo.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblMonsterInfo.setBounds(66, 11, 311, 24);
		formMPanel.add(lblMonsterInfo);
		
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

