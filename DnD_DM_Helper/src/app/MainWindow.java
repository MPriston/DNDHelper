package app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;



public class MainWindow {

	private JFrame frmDmHelper;
	private JPanel iniPanel, formMPanel, formM2Panel, formM3Panel, formMSpellcaster, formMLegendary;
	private JLabel quote, label_22, lblStrMod, lblDexMod, lblConMod, lblInteMod, lblWisMod, lblChaMod;
	private JTextField tfMonst;
	private JTextField tfHpF;
	private JTextField tfHpB;
	private JTextField tfSpeed;
	private JComboBox cbAlig, cbSize, cbType, cbSpellab;
	private JSpinner sSpellDC, sAC, sHP, sStr, sDex, sCon, sInte, sWis, sCha, sSTStr, sSTDex, sSTCon, sSTInte, sSTWis, sSTCha, sAcrobatics, sAnimalHand, sArcana, sAtletics, sDeception, sHistory, sInsight, sIntim, sInves, sMedicine, sNature, sPercp, sPerfo, sPersu, sRelig, sSleight, sStealth, sSurvival;
	private JCheckBox cbSpellcaster, cbLegendary;
	private JTextField tfDmgVul;
	private JTextField tfDmgRes;
	private JTextField tfDmgImm;
	private JTextField tfCondImm;
	private JTextField tfSenses;
	private JTextField tfLang;
	private JTextField tfChall;
	private JTextField tfXP;
	private JTextField tfTraitN1;
	private JTextField tfTraitN2;
	private JTextField tfTraitN3;
	private JTextField tfTraitN4;
	private JTextField tfTraitN5;
	private JTextField tfTraitN6;
	private JTextArea taTraitD1, taTraitD2, taTraitD3, taTraitD4, taTraitD5, taTraitD6, taAD1, taAD2, taAD3, taAD4, taAD5, taAD6, taAD7, taAD8;
	private JTextField tfAN1;
	private JTextField tfAN2;
	private JTextField tfAN3;
	private JTextField tfAN4;
	private JTextField tfAToHit1;
	private JTextField tfAForm1;
	private JTextField tfAToHit2;
	private JTextField tfAForm2;
	private JTextField tfAToHit3;
	private JTextField tfAForm3;
	private JTextField tfAToHit4;
	private JTextField tfAForm4;
	private JTextField tfAN5;
	private JTextField tfAN6;
	private JTextField tfAN7;
	private JTextField tfAN8;
	private JTextField tfAToHit5;
	private JTextField tfAForm5;
	private JTextField tfAToHit6;
	private JTextField tfAForm6;
	private JTextField tfAToHit7;
	private JTextField tfAForm7;
	private JTextField tfAToHit8;
	private JTextField tfAForm8;
	private JTextField tfSpellToHit;
	
	private void falseall() {
		iniPanel.setVisible(false);
		formMPanel.setVisible(false);
		formM2Panel.setVisible(false);
		formM3Panel.setVisible(false);
		formMSpellcaster.setVisible(true);
		formMLegendary.setVisible(true);
	}
	
	private void cleanMForm() {
		tfMonst.setText(null);
		tfHpF.setText(null);
		tfHpB.setText(null);
		tfSpeed.setText(null);
		
		cbAlig.setSelectedIndex(0);
		cbSize.setSelectedIndex(0);
		cbType.setSelectedIndex(0);
		cbSpellab.setSelectedIndex(0);
		
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
		sAcrobatics.setValue(Integer.parseInt("0"));
		sAnimalHand.setValue(Integer.parseInt("0"));
		sArcana.setValue(Integer.parseInt("0"));
		sAtletics.setValue(Integer.parseInt("0"));
		sDeception.setValue(Integer.parseInt("0"));
		sHistory.setValue(Integer.parseInt("0"));
		sInsight.setValue(Integer.parseInt("0"));
		sIntim.setValue(Integer.parseInt("0"));
		sInves.setValue(Integer.parseInt("0"));
		sMedicine.setValue(Integer.parseInt("0"));
		sNature.setValue(Integer.parseInt("0"));
		sPercp.setValue(Integer.parseInt("0"));
		sPerfo.setValue(Integer.parseInt("0"));
		sPersu.setValue(Integer.parseInt("0"));
		sRelig.setValue(Integer.parseInt("0"));
		sSleight.setValue(Integer.parseInt("0"));
		sStealth.setValue(Integer.parseInt("0"));
		sSurvival.setValue(Integer.parseInt("0"));
		sSpellDC.setValue(Integer.parseInt("0"));
		
		lblStrMod.setText(null);
		lblDexMod.setText(null);
		lblConMod.setText(null);
		lblInteMod.setText(null);
		lblWisMod.setText(null);
		lblChaMod.setText(null);
		tfDmgVul.setText(null);
		tfDmgRes.setText(null);
		tfDmgImm.setText(null);
		tfCondImm.setText(null);
		tfSenses.setText(null);
		tfLang.setText(null);
		tfChall.setText(null);
		tfXP.setText(null);
		tfTraitN1.setText(null);
		tfTraitN2.setText(null);
		tfTraitN3.setText(null);
		tfTraitN4.setText(null);
		tfTraitN5.setText(null);
		tfTraitN6.setText(null);
		tfAN1.setText(null);
		tfAN2.setText(null);
		tfAN3.setText(null);
		tfAN4.setText(null);
		tfAN5.setText(null);
		tfAN6.setText(null);
		tfAN7.setText(null);
		tfAN8.setText(null);
		tfAToHit1.setText(null);
		tfAToHit2.setText(null);
		tfAToHit3.setText(null);
		tfAToHit4.setText(null);
		tfAToHit5.setText(null);
		tfAToHit6.setText(null);
		tfAToHit7.setText(null);
		tfAToHit8.setText(null);
		tfAForm1.setText(null);
		tfAForm2.setText(null);
		tfAForm3.setText(null);
		tfAForm4.setText(null);
		tfAForm5.setText(null);
		tfAForm6.setText(null);
		tfAForm7.setText(null);
		tfAForm8.setText(null);
		tfSpellToHit.setText(null);
		
		taTraitD1.setText(null);
		taTraitD2.setText(null);
		taTraitD3.setText(null);
		taTraitD4.setText(null);
		taTraitD5.setText(null);
		taTraitD6.setText(null);
		taAD1.setText(null);
		taAD2.setText(null);
		taAD3.setText(null);
		taAD4.setText(null);
		taAD5.setText(null);
		taAD6.setText(null);
		taAD7.setText(null);
		taAD8.setText(null);
		
		cbSpellcaster.setSelected(false);
		cbLegendary.setSelected(false);
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
		lblMonster.setBounds(147, 49, 98, 24);
		lblMonster.setForeground(new Color(128, 0, 0));
		lblMonster.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblMonster.setHorizontalAlignment(SwingConstants.LEFT);
		formMPanel.add(lblMonster);
		
		tfMonst = new JTextField();
		tfMonst.setBounds(250, 49, 149, 24);
		lblMonster.setLabelFor(tfMonst);
		tfMonst.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfMonst);
		tfMonst.setColumns(10);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(147, 86, 56, 24);
		lblSize.setForeground(new Color(128, 0, 0));
		lblSize.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblSize);
		
		cbSize = new JComboBox();
		cbSize.setBounds(204, 86, 184, 25);
		cbSize.setBackground(new Color(255, 228, 181));
		cbSize.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbSize.setModel(new DefaultComboBoxModel(new String[] {"Tiny", "Small", "Medium", "Large", "Huge", "Gargantuan"}));
		cbSize.setSelectedIndex(0);
		formMPanel.add(cbSize);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(147, 122, 69, 24);
		lblType.setForeground(new Color(128, 0, 0));
		lblType.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblType);
		
		cbType = new JComboBox();
		cbType.setBounds(215, 123, 184, 24);
		cbType.setModel(new DefaultComboBoxModel(new String[] {"Aberration", "Beast", "Celestial", "Construct", "Dragon", "Elemental", "Fey", "Fiend", "Giant", "Humanoid", "Monstrosity", "Ooze", "Plant", "Undead"}));
		cbType.setSelectedIndex(0);
		cbType.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(cbType);
		
		JLabel lblAl = new JLabel("Alignment:");
		lblAl.setBounds(147, 159, 129, 25);
		lblAl.setForeground(new Color(128, 0, 0));
		lblAl.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblAl.setBackground(Color.WHITE);
		formMPanel.add(lblAl);
		
		cbAlig = new JComboBox();
		cbAlig.setBounds(274, 161, 184, 25);
		cbAlig.setForeground(new Color(0, 0, 0));
		cbAlig.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbAlig.setModel(new DefaultComboBoxModel(new String[] {"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chotic Evil", "Unaligned"}));
		cbAlig.setSelectedIndex(0);
		formMPanel.add(cbAlig);
		
		JLabel lblArmorClass = new JLabel("Armor Class:");
		lblArmorClass.setBounds(147, 197, 141, 24);
		lblArmorClass.setForeground(new Color(128, 0, 0));
		lblArmorClass.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblArmorClass);
		
		sAC = new JSpinner();
		sAC.setBounds(295, 198, 45, 24);
		sAC.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		sAC.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(sAC);
		
		JLabel lblHp = new JLabel("Hp:");
		lblHp.setBounds(147, 234, 45, 24);
		lblHp.setForeground(new Color(128, 0, 0));
		lblHp.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHp);
		
		sHP = new JSpinner();
		sHP.setBounds(191, 235, 56, 24);
		sHP.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(sHP);
		
		JLabel lblEx = new JLabel("Ex: 122");
		lblEx.setBounds(259, 240, 56, 16);
		lblEx.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblEx.setForeground(new Color(128, 0, 0));
		formMPanel.add(lblEx);
		
		JLabel lblHpFormula = new JLabel("Hp Formula:");
		lblHpFormula.setBounds(147, 271, 141, 24);
		lblHpFormula.setForeground(new Color(128, 0, 0));
		lblHpFormula.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHpFormula);
		
		tfHpF = new JTextField();
		tfHpF.setBounds(286, 272, 69, 24);
		tfHpF.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfHpF);
		tfHpF.setColumns(10);
		
		JLabel lblex2 = new JLabel("Ex: 12d8");
		lblex2.setBounds(365, 277, 69, 16);
		lblex2.setForeground(new Color(128, 0, 0));
		lblex2.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(lblex2);
		
		JLabel lblHpBonus = new JLabel("Hp Bonus:");
		lblHpBonus.setBounds(147, 308, 116, 24);
		lblHpBonus.setForeground(new Color(128, 0, 0));
		lblHpBonus.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblHpBonus);
		
		tfHpB = new JTextField();
		tfHpB.setBounds(268, 309, 63, 24);
		tfHpB.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfHpB);
		tfHpB.setColumns(10);
		
		JLabel lblExOr = new JLabel("Ex: +36 or -34");
		lblExOr.setBounds(343, 310, 98, 24);
		lblExOr.setForeground(new Color(128, 0, 0));
		lblExOr.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(lblExOr);
		
		JLabel lblSpeed = new JLabel("Speed:");
		lblSpeed.setBounds(147, 345, 79, 24);
		lblSpeed.setForeground(new Color(128, 0, 0));
		lblSpeed.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblSpeed);
		
		tfSpeed = new JTextField();
		tfSpeed.setBounds(225, 346, 174, 24);
		tfSpeed.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		formMPanel.add(tfSpeed);
		tfSpeed.setColumns(10);
		
		JLabel lblStr = new JLabel("Strength:");
		lblStr.setBounds(147, 507, 101, 25);
		lblStr.setForeground(new Color(128, 0, 0));
		lblStr.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblStr);
		
		sStr = new JSpinner();
		sStr.setBounds(253, 507, 45, 24);
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
		lblStrMod.setBounds(302, 507, 56, 24);
		lblStrMod.setForeground(new Color(128, 0, 0));
		lblStrMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblStrMod);
		
		JLabel lblabilityScores = new JLabel("Ability Scores");
		lblabilityScores.setBounds(147, 460, 311, 24);
		lblabilityScores.setForeground(new Color(128, 0, 0));
		lblabilityScores.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblabilityScores.setHorizontalAlignment(SwingConstants.CENTER);
		formMPanel.add(lblabilityScores);
		
		JLabel lblDex = new JLabel("Dexterity:");
		lblDex.setBounds(147, 545, 107, 24);
		lblDex.setForeground(new Color(128, 0, 0));
		lblDex.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblDex);
		
		sDex = new JSpinner();
		sDex.setBounds(261, 545, 45, 24);
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
		formMPanel.add(sDex);
		
		lblDexMod = new JLabel("");
		lblDexMod.setBounds(311, 545, 56, 24);
		lblDexMod.setForeground(new Color(128, 0, 0));
		lblDexMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblDexMod);
		
		JLabel lblCon = new JLabel("Constitution:");
		lblCon.setBounds(147, 582, 148, 24);
		lblCon.setForeground(new Color(128, 0, 0));
		lblCon.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblCon);
		
		sCon = new JSpinner();
		sCon.setBounds(295, 582, 45, 24);
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
		formMPanel.add(sCon);
		
		lblConMod = new JLabel("");
		lblConMod.setBounds(343, 582, 56, 24);
		lblConMod.setForeground(new Color(128, 0, 0));
		lblConMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblConMod);
		
		JLabel lblInte = new JLabel("Inteligence:");
		lblInte.setBounds(147, 621, 129, 25);
		lblInte.setForeground(new Color(128, 0, 0));
		lblInte.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblInte);
		
		sInte = new JSpinner();
		sInte.setBounds(280, 621, 45, 24);
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
		formMPanel.add(sInte);
		
		lblInteMod = new JLabel("");
		lblInteMod.setBounds(332, 621, 56, 24);
		lblInteMod.setForeground(new Color(128, 0, 0));
		lblInteMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblInteMod);
		
		JLabel lblWis = new JLabel("Wisdom:");
		lblWis.setBounds(147, 660, 101, 25);
		lblWis.setForeground(new Color(128, 0, 0));
		lblWis.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblWis);
		
		sWis = new JSpinner();
		sWis.setBounds(253, 660, 45, 24);
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
		formMPanel.add(sWis);
		
		lblWisMod = new JLabel("");
		lblWisMod.setBounds(302, 660, 56, 24);
		lblWisMod.setForeground(new Color(128, 0, 0));
		lblWisMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblWisMod);
		
		JLabel lblCha = new JLabel("Charisma:");
		lblCha.setBounds(147, 699, 116, 25);
		lblCha.setForeground(new Color(128, 0, 0));
		lblCha.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(lblCha);
		
		sCha = new JSpinner();
		sCha.setBounds(262, 699, 45, 24);
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
		formMPanel.add(sCha);
		
		lblChaMod = new JLabel("");
		lblChaMod.setBounds(312, 699, 56, 24);
		lblChaMod.setForeground(new Color(128, 0, 0));
		lblChaMod.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblChaMod);
		
		JLabel lblSavingThrows = new JLabel("Saving Throws");
		lblSavingThrows.setBounds(664, 13, 446, 36);
		lblSavingThrows.setForeground(new Color(128, 0, 0));
		lblSavingThrows.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblSavingThrows.setHorizontalAlignment(SwingConstants.CENTER);
		formMPanel.add(lblSavingThrows);
		
		JLabel lblLeaveBlackIf = new JLabel("leave blank if not mentioned");
		lblLeaveBlackIf.setBounds(666, 45, 446, 16);
		lblLeaveBlackIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeaveBlackIf.setForeground(new Color(128, 0, 0));
		lblLeaveBlackIf.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(lblLeaveBlackIf);
		
		JLabel lblStrength = new JLabel("Strength:");
		lblStrength.setBounds(675, 79, 84, 24);
		lblStrength.setForeground(new Color(128, 0, 0));
		lblStrength.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblStrength);
		
		JLabel lblDexterity = new JLabel("Dexterity:");
		lblDexterity.setBounds(840, 79, 91, 24);
		lblDexterity.setForeground(new Color(128, 0, 0));
		lblDexterity.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblDexterity);
		
		JLabel lblInteligence = new JLabel("Inteligence:");
		lblInteligence.setBounds(675, 116, 107, 24);
		lblInteligence.setForeground(new Color(128, 0, 0));
		lblInteligence.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblInteligence);
		
		JLabel lblContitution = new JLabel("Contitution:");
		lblContitution.setBounds(1008, 79, 110, 24);
		lblContitution.setForeground(new Color(128, 0, 0));
		lblContitution.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblContitution);
		
		JLabel lblWisdow = new JLabel("Wisdow:");
		lblWisdow.setBounds(840, 116, 84, 24);
		lblWisdow.setForeground(new Color(128, 0, 0));
		lblWisdow.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblWisdow);
		
		JLabel lblCharisma = new JLabel("Charisma:");
		lblCharisma.setBounds(1008, 116, 92, 24);
		lblCharisma.setForeground(new Color(128, 0, 0));
		lblCharisma.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		formMPanel.add(lblCharisma);
		
		sSTStr = new JSpinner();
		sSTStr.setBounds(767, 80, 42, 22);
		sSTStr.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(sSTStr);
		
		sSTInte = new JSpinner();
		sSTInte.setBounds(786, 117, 42, 22);
		sSTInte.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(sSTInte);
		
		sSTDex = new JSpinner();
		sSTDex.setBounds(936, 80, 42, 22);
		sSTDex.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(sSTDex);
		
		sSTWis = new JSpinner();
		sSTWis.setBounds(925, 117, 42, 22);
		sSTWis.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(sSTWis);
		
		sSTCon = new JSpinner();
		sSTCon.setBounds(1123, 80, 42, 22);
		sSTCon.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(sSTCon);
		
		sSTCha = new JSpinner();
		sSTCha.setBounds(1106, 117, 42, 22);
		sSTCha.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(sSTCha);
		
		JLabel lblMonsterInfo = new JLabel("Monster Info");
		lblMonsterInfo.setBounds(147, 11, 311, 36);
		lblMonsterInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonsterInfo.setForeground(new Color(128, 0, 0));
		lblMonsterInfo.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		formMPanel.add(lblMonsterInfo);
		
		cbSpellcaster = new JCheckBox("Spellcaster");
		cbSpellcaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbSpellcaster.isSelected() || cbLegendary.isSelected()) {
					label_22.setText("Next");
				} else {
					label_22.setText("Save");
				}
			}
		});
		cbSpellcaster.setBounds(147, 378, 151, 25);
		cbSpellcaster.setBackground(new Color(255, 228, 181));
		cbSpellcaster.setForeground(new Color(128, 0, 0));
		cbSpellcaster.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		formMPanel.add(cbSpellcaster);
		
		cbLegendary = new JCheckBox("Legendary Actions");
		cbLegendary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbLegendary.isSelected() || cbSpellcaster.isSelected()) {
					label_22.setText("Next");
				} else {
					label_22.setText("Save");
				}
			}
		});
		cbLegendary.setBounds(147, 408, 241, 25);
		cbLegendary.setForeground(new Color(128, 0, 0));
		cbLegendary.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		cbLegendary.setBackground(new Color(255, 228, 181));
		formMPanel.add(cbLegendary);
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setBounds(663, 166, 446, 36);
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setForeground(new Color(128, 0, 0));
		lblSkills.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		formMPanel.add(lblSkills);
		
		JLabel label = new JLabel("leave blank if not mentioned");
		label.setBounds(665, 197, 446, 16);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		formMPanel.add(label);
		
		JLabel lblAcrobatics = new JLabel("Acrobatics:");
		lblAcrobatics.setBounds(674, 237, 121, 33);
		formMPanel.add(lblAcrobatics);
		lblAcrobatics.setForeground(new Color(128, 0, 0));
		lblAcrobatics.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblInvestigation = new JLabel("Investigation:");
		lblInvestigation.setBounds(674, 581, 149, 33);
		formMPanel.add(lblInvestigation);
		lblInvestigation.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInvestigation.setForeground(new Color(128, 0, 0));
		lblInvestigation.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblIntimidation = new JLabel("Intimidation:");
		lblIntimidation.setBounds(674, 538, 142, 33);
		formMPanel.add(lblIntimidation);
		lblIntimidation.setForeground(new Color(128, 0, 0));
		lblIntimidation.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblInsight = new JLabel("Insight:");
		lblInsight.setBounds(674, 495, 85, 33);
		formMPanel.add(lblInsight);
		lblInsight.setForeground(new Color(128, 0, 0));
		lblInsight.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblHistory = new JLabel("History:");
		lblHistory.setBounds(674, 452, 87, 33);
		formMPanel.add(lblHistory);
		lblHistory.setForeground(new Color(128, 0, 0));
		lblHistory.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblDeception = new JLabel("Deception:");
		lblDeception.setBounds(674, 409, 121, 33);
		formMPanel.add(lblDeception);
		lblDeception.setForeground(new Color(128, 0, 0));
		lblDeception.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblAtletics = new JLabel("Atletics:");
		lblAtletics.setBounds(674, 366, 91, 33);
		formMPanel.add(lblAtletics);
		lblAtletics.setForeground(new Color(128, 0, 0));
		lblAtletics.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblArcana = new JLabel("Arcana:");
		lblArcana.setBounds(674, 324, 84, 33);
		formMPanel.add(lblArcana);
		lblArcana.setForeground(new Color(128, 0, 0));
		lblArcana.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblAnimalH = new JLabel("Animal Handling:");
		lblAnimalH.setBounds(674, 280, 196, 33);
		formMPanel.add(lblAnimalH);
		lblAnimalH.setForeground(new Color(128, 0, 0));
		lblAnimalH.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JLabel lblNext = new JLabel("Next");
		lblNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				falseall();
				formM2Panel.setVisible(true);
			}
		});
		lblNext.setForeground(new Color(128, 0, 0));
		lblNext.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblNext.setBounds(1197, 699, 65, 27);
		formMPanel.add(lblNext);
		
		JLabel lblMedicine = new JLabel("Medicine:");
		lblMedicine.setForeground(new Color(128, 0, 0));
		lblMedicine.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblMedicine.setBounds(936, 236, 108, 33);
		formMPanel.add(lblMedicine);
		
		JLabel lblSurvival = new JLabel("Survival:");
		lblSurvival.setForeground(new Color(128, 0, 0));
		lblSurvival.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSurvival.setAlignmentY(1.0f);
		lblSurvival.setBounds(936, 580, 100, 33);
		formMPanel.add(lblSurvival);
		
		JLabel lblStealth = new JLabel("Stealth:");
		lblStealth.setForeground(new Color(128, 0, 0));
		lblStealth.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblStealth.setBounds(936, 537, 84, 33);
		formMPanel.add(lblStealth);
		
		JLabel lblSleightOfHand = new JLabel("Sleight of Hand:");
		lblSleightOfHand.setForeground(new Color(128, 0, 0));
		lblSleightOfHand.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSleightOfHand.setBounds(936, 494, 180, 33);
		formMPanel.add(lblSleightOfHand);
		
		JLabel lblReligion = new JLabel("Religion:");
		lblReligion.setForeground(new Color(128, 0, 0));
		lblReligion.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblReligion.setBounds(936, 451, 100, 33);
		formMPanel.add(lblReligion);
		
		JLabel lblPersuation = new JLabel("Persuation:");
		lblPersuation.setForeground(new Color(128, 0, 0));
		lblPersuation.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblPersuation.setBounds(936, 408, 123, 33);
		formMPanel.add(lblPersuation);
		
		JLabel lblPerformance = new JLabel("Performance:");
		lblPerformance.setForeground(new Color(128, 0, 0));
		lblPerformance.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblPerformance.setBounds(936, 365, 144, 33);
		formMPanel.add(lblPerformance);
		
		JLabel lblPerception = new JLabel("Perception:");
		lblPerception.setForeground(new Color(128, 0, 0));
		lblPerception.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblPerception.setBounds(936, 321, 122, 33);
		formMPanel.add(lblPerception);
		
		JLabel lblNature = new JLabel("Nature:");
		lblNature.setForeground(new Color(128, 0, 0));
		lblNature.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblNature.setBounds(936, 279, 84, 33);
		formMPanel.add(lblNature);
		
		sAcrobatics = new JSpinner();
		sAcrobatics.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sAcrobatics.setBounds(798, 241, 45, 24);
		formMPanel.add(sAcrobatics);
		
		sAnimalHand = new JSpinner();
		sAnimalHand.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sAnimalHand.setBounds(871, 284, 45, 24);
		formMPanel.add(sAnimalHand);
		
		sArcana = new JSpinner();
		sArcana.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sArcana.setBounds(762, 328, 45, 24);
		formMPanel.add(sArcana);
		
		sAtletics = new JSpinner();
		sAtletics.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sAtletics.setBounds(767, 370, 45, 24);
		formMPanel.add(sAtletics);
		
		sDeception = new JSpinner();
		sDeception.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sDeception.setBounds(796, 413, 45, 24);
		formMPanel.add(sDeception);
		
		sHistory = new JSpinner();
		sHistory.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sHistory.setBounds(764, 456, 45, 24);
		formMPanel.add(sHistory);
		
		sInsight = new JSpinner();
		sInsight.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sInsight.setBounds(762, 499, 45, 24);
		formMPanel.add(sInsight);
		
	    sIntim = new JSpinner();
		sIntim.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sIntim.setBounds(822, 542, 45, 24);
		formMPanel.add(sIntim);
		
		sInves = new JSpinner();
		sInves.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sInves.setBounds(827, 585, 45, 24);
		formMPanel.add(sInves);
		
	    sMedicine = new JSpinner();
		sMedicine.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sMedicine.setBounds(1048, 240, 45, 24);
		formMPanel.add(sMedicine);
		
		sNature = new JSpinner();
		sNature.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sNature.setBounds(1022, 283, 45, 24);
		formMPanel.add(sNature);
		
		sPercp = new JSpinner();
		sPercp.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sPercp.setBounds(1065, 325, 45, 24);
		formMPanel.add(sPercp);
		
		sPerfo = new JSpinner();
		sPerfo.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sPerfo.setBounds(1082, 369, 45, 24);
		formMPanel.add(sPerfo);
		
		sPersu = new JSpinner();
		sPersu.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sPersu.setBounds(1065, 412, 45, 24);
		formMPanel.add(sPersu);
		
		sRelig = new JSpinner();
		sRelig.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sRelig.setBounds(1035, 455, 45, 24);
		formMPanel.add(sRelig);
		
		sSleight = new JSpinner();
		sSleight.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sSleight.setBounds(1120, 498, 45, 24);
		formMPanel.add(sSleight);
		
		sStealth = new JSpinner();
		sStealth.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sStealth.setBounds(1024, 541, 45, 24);
		formMPanel.add(sStealth);
		
		sSurvival = new JSpinner();
		sSurvival.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sSurvival.setBounds(1036, 584, 45, 24);
		formMPanel.add(sSurvival);
		
		formM2Panel = new JPanel();
		formM2Panel.setBackground(new Color(255, 228, 181));
		frmDmHelper.getContentPane().add(formM2Panel, "name_1208306260293136");
		formM2Panel.setLayout(null);
		
		JLabel lblSpecialTraits = new JLabel("Special Info");
		lblSpecialTraits.setForeground(new Color(128, 0, 0));
		lblSpecialTraits.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblSpecialTraits.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecialTraits.setBounds(12, 13, 1250, 28);
		formM2Panel.add(lblSpecialTraits);
		
		JLabel lblDamageVulnerabilities = new JLabel("Damage Vulnerabilities:");
		lblDamageVulnerabilities.setForeground(new Color(128, 0, 0));
		lblDamageVulnerabilities.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblDamageVulnerabilities.setBounds(12, 65, 186, 24);
		formM2Panel.add(lblDamageVulnerabilities);
		
		JLabel label_1 = new JLabel("leave blank if not mentioned");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(128, 0, 0));
		label_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		label_1.setBounds(414, 44, 446, 16);
		formM2Panel.add(label_1);
		
		JLabel lblDamageResistances = new JLabel("Damage Resistances:");
		lblDamageResistances.setForeground(new Color(128, 0, 0));
		lblDamageResistances.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblDamageResistances.setBounds(344, 65, 162, 24);
		formM2Panel.add(lblDamageResistances);
		
		JLabel lblDamageImmunities = new JLabel("Damage Immunities:");
		lblDamageImmunities.setForeground(new Color(128, 0, 0));
		lblDamageImmunities.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblDamageImmunities.setBounds(650, 65, 160, 24);
		formM2Panel.add(lblDamageImmunities);
		
		JLabel lblConditionImmunities = new JLabel("Condition Immunities:");
		lblConditionImmunities.setForeground(new Color(128, 0, 0));
		lblConditionImmunities.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblConditionImmunities.setBounds(954, 65, 172, 24);
		formM2Panel.add(lblConditionImmunities);
		
		tfDmgVul = new JTextField();
		tfDmgVul.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		tfDmgVul.setBounds(214, 65, 116, 22);
		formM2Panel.add(tfDmgVul);
		tfDmgVul.setColumns(10);
		
		tfDmgRes = new JTextField();
		tfDmgRes.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		tfDmgRes.setColumns(10);
		tfDmgRes.setBounds(520, 65, 116, 22);
		formM2Panel.add(tfDmgRes);
		
		tfDmgImm = new JTextField();
		tfDmgImm.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		tfDmgImm.setColumns(10);
		tfDmgImm.setBounds(824, 65, 116, 22);
		formM2Panel.add(tfDmgImm);
		
		tfCondImm = new JTextField();
		tfCondImm.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		tfCondImm.setColumns(10);
		tfCondImm.setBounds(1140, 65, 116, 22);
		formM2Panel.add(tfCondImm);
		
		JLabel lblSenses = new JLabel("Senses:");
		lblSenses.setForeground(new Color(128, 0, 0));
		lblSenses.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblSenses.setBounds(12, 119, 186, 24);
		formM2Panel.add(lblSenses);
		
		tfSenses = new JTextField();
		tfSenses.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		tfSenses.setColumns(10);
		tfSenses.setBounds(76, 121, 254, 22);
		formM2Panel.add(tfSenses);
		
		JLabel lblLanguages = new JLabel("Languages:");
		lblLanguages.setForeground(new Color(128, 0, 0));
		lblLanguages.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblLanguages.setBounds(344, 119, 162, 24);
		formM2Panel.add(lblLanguages);
		
		JLabel lblChallenge = new JLabel("Challenge:");
		lblChallenge.setForeground(new Color(128, 0, 0));
		lblChallenge.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblChallenge.setBounds(650, 119, 160, 24);
		formM2Panel.add(lblChallenge);
		
		tfLang = new JTextField();
		tfLang.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		tfLang.setColumns(10);
		tfLang.setBounds(433, 121, 203, 22);
		formM2Panel.add(tfLang);
		
		tfChall = new JTextField();
		tfChall.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		tfChall.setColumns(10);
		tfChall.setBounds(732, 121, 116, 22);
		formM2Panel.add(tfChall);
		
		JLabel lblXp = new JLabel("XP:");
		lblXp.setForeground(new Color(128, 0, 0));
		lblXp.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblXp.setBounds(954, 119, 30, 24);
		formM2Panel.add(lblXp);
		
		tfXP = new JTextField();
		tfXP.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		tfXP.setColumns(10);
		tfXP.setBounds(983, 119, 116, 22);
		formM2Panel.add(tfXP);
		
		JLabel lblSpecialTraits_1 = new JLabel("Special Traits");
		lblSpecialTraits_1.setForeground(new Color(128, 0, 0));
		lblSpecialTraits_1.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblSpecialTraits_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecialTraits_1.setBounds(12, 159, 1250, 28);
		formM2Panel.add(lblSpecialTraits_1);
		
		JLabel label_2 = new JLabel("leave blank if not mentioned");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(128, 0, 0));
		label_2.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		label_2.setBounds(414, 186, 446, 16);
		formM2Panel.add(label_2);
		
		JLabel lblName = new JLabel("First Trait:");
		lblName.setForeground(new Color(128, 0, 0));
		lblName.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblName.setBounds(12, 240, 125, 28);
		formM2Panel.add(lblName);
		
		tfTraitN1 = new JTextField();
		tfTraitN1.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfTraitN1.setBounds(144, 244, 207, 22);
		formM2Panel.add(tfTraitN1);
		tfTraitN1.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(new Color(128, 0, 0));
		lblDescription.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblDescription.setBounds(12, 281, 133, 28);
		formM2Panel.add(lblDescription);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 311, 339, 121);
		formM2Panel.add(scrollPane_2);
		
		taTraitD1 = new JTextArea();
		taTraitD1.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		scrollPane_2.setViewportView(taTraitD1);
		
		JLabel lblSecondName = new JLabel("Second Trait:");
		lblSecondName.setForeground(new Color(128, 0, 0));
		lblSecondName.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSecondName.setBounds(492, 243, 162, 28);
		formM2Panel.add(lblSecondName);
		
		tfTraitN2 = new JTextField();
		tfTraitN2.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfTraitN2.setColumns(10);
		tfTraitN2.setBounds(650, 244, 186, 22);
		formM2Panel.add(tfTraitN2);
		
		JLabel label_4 = new JLabel("Description:");
		label_4.setForeground(new Color(128, 0, 0));
		label_4.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_4.setBounds(492, 284, 133, 28);
		formM2Panel.add(label_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(492, 314, 344, 121);
		formM2Panel.add(scrollPane_3);
		
		taTraitD2 = new JTextArea();
		taTraitD2.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		scrollPane_3.setViewportView(taTraitD2);
		
		JLabel lblThirdName = new JLabel("Third Trait:");
		lblThirdName.setForeground(new Color(128, 0, 0));
		lblThirdName.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblThirdName.setBounds(922, 240, 145, 28);
		formM2Panel.add(lblThirdName);
		
		tfTraitN3 = new JTextField();
		tfTraitN3.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfTraitN3.setColumns(10);
		tfTraitN3.setBounds(1061, 244, 186, 22);
		formM2Panel.add(tfTraitN3);
		
		JLabel label_6 = new JLabel("Description:");
		label_6.setForeground(new Color(128, 0, 0));
		label_6.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_6.setBounds(922, 281, 133, 28);
		formM2Panel.add(label_6);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(922, 311, 325, 121);
		formM2Panel.add(scrollPane_5);
		
		taTraitD3 = new JTextArea();
		taTraitD3.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		scrollPane_5.setViewportView(taTraitD3);
		
		JLabel lblFouthName = new JLabel("Fourth Trait:");
		lblFouthName.setForeground(new Color(128, 0, 0));
		lblFouthName.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblFouthName.setBounds(12, 483, 150, 28);
		formM2Panel.add(lblFouthName);
		
		tfTraitN4 = new JTextField();
		tfTraitN4.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfTraitN4.setColumns(10);
		tfTraitN4.setBounds(165, 487, 186, 22);
		formM2Panel.add(tfTraitN4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 554, 339, 121);
		formM2Panel.add(scrollPane);
		
		taTraitD4 = new JTextArea();
		taTraitD4.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		scrollPane.setViewportView(taTraitD4);
		
		JLabel label_8 = new JLabel("Description:");
		label_8.setForeground(new Color(128, 0, 0));
		label_8.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_8.setBounds(12, 524, 133, 28);
		formM2Panel.add(label_8);
		
		JLabel lblFifthName = new JLabel("Fifth Trait:");
		lblFifthName.setForeground(new Color(128, 0, 0));
		lblFifthName.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblFifthName.setBounds(492, 486, 133, 28);
		formM2Panel.add(lblFifthName);
		
		tfTraitN5 = new JTextField();
		tfTraitN5.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfTraitN5.setColumns(10);
		tfTraitN5.setBounds(624, 490, 212, 22);
		formM2Panel.add(tfTraitN5);
		
		JLabel label_10 = new JLabel("Description:");
		label_10.setForeground(new Color(128, 0, 0));
		label_10.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_10.setBounds(492, 527, 133, 28);
		formM2Panel.add(label_10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(492, 557, 344, 121);
		formM2Panel.add(scrollPane_1);
		
		taTraitD5 = new JTextArea();
		taTraitD5.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		scrollPane_1.setViewportView(taTraitD5);
		
		JLabel lblSixthName = new JLabel("Sixth Trait:");
		lblSixthName.setForeground(new Color(128, 0, 0));
		lblSixthName.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSixthName.setBounds(922, 483, 134, 28);
		formM2Panel.add(lblSixthName);
		
		tfTraitN6 = new JTextField();
		tfTraitN6.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfTraitN6.setColumns(10);
		tfTraitN6.setBounds(1061, 487, 186, 22);
		formM2Panel.add(tfTraitN6);
		
		JLabel label_12 = new JLabel("Description:");
		label_12.setForeground(new Color(128, 0, 0));
		label_12.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_12.setBounds(922, 524, 133, 28);
		formM2Panel.add(label_12);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(922, 554, 325, 121);
		formM2Panel.add(scrollPane_4);
		
		taTraitD6 = new JTextArea();
		taTraitD6.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		scrollPane_4.setViewportView(taTraitD6);
		
		JLabel label_3 = new JLabel("Next");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				falseall();
				formM3Panel.setVisible(true);
			}
		});
		label_3.setForeground(new Color(128, 0, 0));
		label_3.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		label_3.setBounds(1197, 699, 65, 27);
		formM2Panel.add(label_3);
		
		JLabel label_5 = new JLabel("|");
		label_5.setForeground(new Color(128, 0, 0));
		label_5.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		label_5.setBounds(1184, 699, 13, 27);
		formM2Panel.add(label_5);
		
		JLabel lblPrev = new JLabel("Prev");
		lblPrev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				falseall();
				formMPanel.setVisible(true);
			}
		});
		lblPrev.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPrev.setForeground(new Color(128, 0, 0));
		lblPrev.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblPrev.setBounds(1118, 699, 65, 27);
		formM2Panel.add(lblPrev);
		
		JLabel lblEx_1 = new JLabel("Ex: 12000");
		lblEx_1.setForeground(new Color(128, 0, 0));
		lblEx_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblEx_1.setBounds(1103, 122, 69, 16);
		formM2Panel.add(lblEx_1);
		
		JLabel lblExOr_1 = new JLabel("Ex: 1/8 or 4");
		lblExOr_1.setForeground(new Color(128, 0, 0));
		lblExOr_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblExOr_1.setBounds(852, 122, 88, 16);
		formM2Panel.add(lblExOr_1);
		
		formM3Panel = new JPanel();
		formM3Panel.setBackground(new Color(255, 228, 181));
		frmDmHelper.getContentPane().add(formM3Panel, "name_1528868008358160");
		formM3Panel.setLayout(null);
		
		JLabel lblActions = new JLabel("Actions");
		lblActions.setForeground(new Color(128, 0, 0));
		lblActions.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblActions.setHorizontalAlignment(SwingConstants.CENTER);
		lblActions.setBounds(414, 13, 446, 36);
		formM3Panel.add(lblActions);
		
		JLabel label_7 = new JLabel("leave blank if not mentioned");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(128, 0, 0));
		label_7.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		label_7.setBounds(414, 43, 446, 16);
		formM3Panel.add(label_7);
		
		JLabel lblFirstAction = new JLabel("First Action:");
		lblFirstAction.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblFirstAction.setForeground(new Color(128, 0, 0));
		lblFirstAction.setBounds(15, 72, 133, 26);
		formM3Panel.add(lblFirstAction);
		
		JLabel lblSecondAction = new JLabel("Second Action:");
		lblSecondAction.setForeground(new Color(128, 0, 0));
		lblSecondAction.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSecondAction.setBounds(311, 72, 165, 26);
		formM3Panel.add(lblSecondAction);
		
		JLabel lblThirdAction = new JLabel("Third Action:");
		lblThirdAction.setForeground(new Color(128, 0, 0));
		lblThirdAction.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblThirdAction.setBounds(639, 72, 146, 26);
		formM3Panel.add(lblThirdAction);
		
		JLabel lblFourthAction = new JLabel("Fourth Action:");
		lblFourthAction.setForeground(new Color(128, 0, 0));
		lblFourthAction.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblFourthAction.setBounds(948, 72, 158, 26);
		formM3Panel.add(lblFourthAction);
		
		tfAN1 = new JTextField();
		tfAN1.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAN1.setBounds(150, 75, 133, 22);
		formM3Panel.add(tfAN1);
		tfAN1.setColumns(10);
		
		tfAN2 = new JTextField();
		tfAN2.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAN2.setColumns(10);
		tfAN2.setBounds(480, 75, 133, 22);
		formM3Panel.add(tfAN2);
		
		tfAN3 = new JTextField();
		tfAN3.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAN3.setColumns(10);
		tfAN3.setBounds(789, 74, 133, 22);
		formM3Panel.add(tfAN3);
		
		tfAN4 = new JTextField();
		tfAN4.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAN4.setColumns(10);
		tfAN4.setBounds(1109, 75, 133, 22);
		formM3Panel.add(tfAN4);
		
		JLabel lblDescription_1 = new JLabel("Description:");
		lblDescription_1.setForeground(new Color(128, 0, 0));
		lblDescription_1.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblDescription_1.setBounds(15, 103, 133, 26);
		formM3Panel.add(lblDescription_1);
		
		JLabel label_9 = new JLabel("Description:");
		label_9.setForeground(new Color(128, 0, 0));
		label_9.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_9.setBounds(311, 103, 133, 26);
		formM3Panel.add(label_9);
		
		JLabel label_11 = new JLabel("Description:");
		label_11.setForeground(new Color(128, 0, 0));
		label_11.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_11.setBounds(639, 103, 133, 26);
		formM3Panel.add(label_11);
		
		JLabel label_13 = new JLabel("Description:");
		label_13.setForeground(new Color(128, 0, 0));
		label_13.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_13.setBounds(948, 103, 133, 26);
		formM3Panel.add(label_13);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(12, 132, 271, 70);
		formM3Panel.add(scrollPane_6);
		
		taAD1 = new JTextArea();
		scrollPane_6.setViewportView(taAD1);
		taAD1.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(310, 134, 303, 68);
		formM3Panel.add(scrollPane_7);
		
		taAD2 = new JTextArea();
		scrollPane_7.setViewportView(taAD2);
		taAD2.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(639, 134, 283, 68);
		formM3Panel.add(scrollPane_8);
		
		taAD3 = new JTextArea();
		scrollPane_8.setViewportView(taAD3);
		taAD3.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(948, 134, 294, 68);
		formM3Panel.add(scrollPane_9);
		
		taAD4 = new JTextArea();
		scrollPane_9.setViewportView(taAD4);
		taAD4.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JLabel lblToHit = new JLabel("To Hit:");
		lblToHit.setForeground(new Color(128, 0, 0));
		lblToHit.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblToHit.setBounds(15, 212, 76, 26);
		formM3Panel.add(lblToHit);
		
		tfAToHit1 = new JTextField();
		tfAToHit1.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAToHit1.setColumns(10);
		tfAToHit1.setBounds(94, 214, 54, 22);
		formM3Panel.add(tfAToHit1);
		
		JLabel lblDiceFormula = new JLabel("Dice Formula:");
		lblDiceFormula.setForeground(new Color(128, 0, 0));
		lblDiceFormula.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblDiceFormula.setBounds(15, 251, 158, 26);
		formM3Panel.add(lblDiceFormula);
		
		tfAForm1 = new JTextField();
		tfAForm1.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAForm1.setColumns(10);
		tfAForm1.setBounds(171, 253, 112, 22);
		formM3Panel.add(tfAForm1);
		
		JLabel label_14 = new JLabel("To Hit:");
		label_14.setForeground(new Color(128, 0, 0));
		label_14.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_14.setBounds(311, 215, 76, 26);
		formM3Panel.add(label_14);
		
		tfAToHit2 = new JTextField();
		tfAToHit2.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAToHit2.setColumns(10);
		tfAToHit2.setBounds(390, 217, 54, 22);
		formM3Panel.add(tfAToHit2);
		
		JLabel label_15 = new JLabel("Dice Formula:");
		label_15.setForeground(new Color(128, 0, 0));
		label_15.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_15.setBounds(311, 254, 158, 26);
		formM3Panel.add(label_15);
		
		tfAForm2 = new JTextField();
		tfAForm2.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAForm2.setColumns(10);
		tfAForm2.setBounds(467, 256, 112, 22);
		formM3Panel.add(tfAForm2);
		
		JLabel label_16 = new JLabel("To Hit:");
		label_16.setForeground(new Color(128, 0, 0));
		label_16.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_16.setBounds(639, 215, 76, 26);
		formM3Panel.add(label_16);
		
		tfAToHit3 = new JTextField();
		tfAToHit3.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAToHit3.setColumns(10);
		tfAToHit3.setBounds(718, 217, 54, 22);
		formM3Panel.add(tfAToHit3);
		
		JLabel label_17 = new JLabel("Dice Formula:");
		label_17.setForeground(new Color(128, 0, 0));
		label_17.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_17.setBounds(639, 254, 158, 26);
		formM3Panel.add(label_17);
		
		tfAForm3 = new JTextField();
		tfAForm3.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAForm3.setColumns(10);
		tfAForm3.setBounds(795, 256, 112, 22);
		formM3Panel.add(tfAForm3);
		
		JLabel label_18 = new JLabel("To Hit:");
		label_18.setForeground(new Color(128, 0, 0));
		label_18.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_18.setBounds(948, 215, 76, 26);
		formM3Panel.add(label_18);
		
		tfAToHit4 = new JTextField();
		tfAToHit4.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAToHit4.setColumns(10);
		tfAToHit4.setBounds(1027, 217, 54, 22);
		formM3Panel.add(tfAToHit4);
		
		JLabel label_19 = new JLabel("Dice Formula:");
		label_19.setForeground(new Color(128, 0, 0));
		label_19.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_19.setBounds(948, 254, 158, 26);
		formM3Panel.add(label_19);
		
		tfAForm4 = new JTextField();
		tfAForm4.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAForm4.setColumns(10);
		tfAForm4.setBounds(1104, 256, 112, 22);
		formM3Panel.add(tfAForm4);
		
		JLabel lblFifthAction = new JLabel("Fifth Action:");
		lblFifthAction.setForeground(new Color(128, 0, 0));
		lblFifthAction.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblFifthAction.setBounds(15, 374, 146, 26);
		formM3Panel.add(lblFifthAction);
		
		JLabel lblSeventhAction = new JLabel("Sixth Action:");
		lblSeventhAction.setForeground(new Color(128, 0, 0));
		lblSeventhAction.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSeventhAction.setBounds(311, 374, 165, 26);
		formM3Panel.add(lblSeventhAction);
		
		JLabel lblEiAction = new JLabel("Seventh Action:");
		lblEiAction.setForeground(new Color(128, 0, 0));
		lblEiAction.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblEiAction.setBounds(639, 374, 175, 26);
		formM3Panel.add(lblEiAction);
		
		JLabel lblEighthAction = new JLabel("Eighth Action:");
		lblEighthAction.setForeground(new Color(128, 0, 0));
		lblEighthAction.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblEighthAction.setBounds(948, 374, 158, 26);
		formM3Panel.add(lblEighthAction);
		
		tfAN5 = new JTextField();
		tfAN5.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAN5.setColumns(10);
		tfAN5.setBounds(154, 377, 133, 22);
		formM3Panel.add(tfAN5);
		
		tfAN6 = new JTextField();
		tfAN6.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAN6.setColumns(10);
		tfAN6.setBounds(455, 377, 133, 22);
		formM3Panel.add(tfAN6);
		
		tfAN7 = new JTextField();
		tfAN7.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAN7.setColumns(10);
		tfAN7.setBounds(815, 377, 107, 22);
		formM3Panel.add(tfAN7);
		
		tfAN8 = new JTextField();
		tfAN8.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAN8.setColumns(10);
		tfAN8.setBounds(1109, 377, 133, 22);
		formM3Panel.add(tfAN8);
		
		JLabel label_24 = new JLabel("Description:");
		label_24.setForeground(new Color(128, 0, 0));
		label_24.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_24.setBounds(15, 405, 133, 26);
		formM3Panel.add(label_24);
		
		JLabel label_25 = new JLabel("Description:");
		label_25.setForeground(new Color(128, 0, 0));
		label_25.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_25.setBounds(311, 405, 133, 26);
		formM3Panel.add(label_25);
		
		JLabel label_26 = new JLabel("Description:");
		label_26.setForeground(new Color(128, 0, 0));
		label_26.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_26.setBounds(639, 405, 133, 26);
		formM3Panel.add(label_26);
		
		JLabel label_27 = new JLabel("Description:");
		label_27.setForeground(new Color(128, 0, 0));
		label_27.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_27.setBounds(948, 405, 133, 26);
		formM3Panel.add(label_27);
		
		JLabel label_28 = new JLabel("To Hit:");
		label_28.setForeground(new Color(128, 0, 0));
		label_28.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_28.setBounds(15, 514, 76, 26);
		formM3Panel.add(label_28);
		
		tfAToHit5 = new JTextField();
		tfAToHit5.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAToHit5.setColumns(10);
		tfAToHit5.setBounds(94, 516, 54, 22);
		formM3Panel.add(tfAToHit5);
		
		JLabel label_29 = new JLabel("Dice Formula:");
		label_29.setForeground(new Color(128, 0, 0));
		label_29.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_29.setBounds(15, 553, 158, 26);
		formM3Panel.add(label_29);
		
		tfAForm5 = new JTextField();
		tfAForm5.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAForm5.setColumns(10);
		tfAForm5.setBounds(171, 555, 112, 22);
		formM3Panel.add(tfAForm5);
		
		JLabel label_30 = new JLabel("To Hit:");
		label_30.setForeground(new Color(128, 0, 0));
		label_30.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_30.setBounds(311, 517, 76, 26);
		formM3Panel.add(label_30);
		
		tfAToHit6 = new JTextField();
		tfAToHit6.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAToHit6.setColumns(10);
		tfAToHit6.setBounds(390, 519, 54, 22);
		formM3Panel.add(tfAToHit6);
		
		JLabel label_31 = new JLabel("Dice Formula:");
		label_31.setForeground(new Color(128, 0, 0));
		label_31.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_31.setBounds(311, 556, 158, 26);
		formM3Panel.add(label_31);
		
		tfAForm6 = new JTextField();
		tfAForm6.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAForm6.setColumns(10);
		tfAForm6.setBounds(467, 558, 112, 22);
		formM3Panel.add(tfAForm6);
		
		JLabel label_32 = new JLabel("To Hit:");
		label_32.setForeground(new Color(128, 0, 0));
		label_32.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_32.setBounds(639, 517, 76, 26);
		formM3Panel.add(label_32);
		
		tfAToHit7 = new JTextField();
		tfAToHit7.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAToHit7.setColumns(10);
		tfAToHit7.setBounds(718, 519, 54, 22);
		formM3Panel.add(tfAToHit7);
		
		JLabel label_33 = new JLabel("Dice Formula:");
		label_33.setForeground(new Color(128, 0, 0));
		label_33.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_33.setBounds(639, 556, 158, 26);
		formM3Panel.add(label_33);
		
		tfAForm7 = new JTextField();
		tfAForm7.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAForm7.setColumns(10);
		tfAForm7.setBounds(795, 558, 112, 22);
		formM3Panel.add(tfAForm7);
		
		JLabel label_34 = new JLabel("To Hit:");
		label_34.setForeground(new Color(128, 0, 0));
		label_34.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_34.setBounds(948, 517, 76, 26);
		formM3Panel.add(label_34);
		
		tfAToHit8 = new JTextField();
		tfAToHit8.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAToHit8.setColumns(10);
		tfAToHit8.setBounds(1027, 519, 54, 22);
		formM3Panel.add(tfAToHit8);
		
		JLabel label_35 = new JLabel("Dice Formula:");
		label_35.setForeground(new Color(128, 0, 0));
		label_35.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		label_35.setBounds(948, 556, 158, 26);
		formM3Panel.add(label_35);
		
		tfAForm8 = new JTextField();
		tfAForm8.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfAForm8.setColumns(10);
		tfAForm8.setBounds(1104, 558, 112, 22);
		formM3Panel.add(tfAForm8);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(15, 433, 272, 68);
		formM3Panel.add(scrollPane_10);
		
		taAD5 = new JTextArea();
		scrollPane_10.setViewportView(taAD5);
		taAD5.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(311, 433, 277, 68);
		formM3Panel.add(scrollPane_11);
		
		taAD6 = new JTextArea();
		scrollPane_11.setViewportView(taAD6);
		taAD6.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(639, 433, 283, 68);
		formM3Panel.add(scrollPane_12);
		
		taAD7 = new JTextArea();
		scrollPane_12.setViewportView(taAD7);
		taAD7.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(947, 433, 295, 68);
		formM3Panel.add(scrollPane_13);
		
		taAD8 = new JTextArea();
		scrollPane_13.setViewportView(taAD8);
		taAD8.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		
		JLabel lblNeedMoreActions = new JLabel("Need more Actions");
		lblNeedMoreActions.setHorizontalAlignment(SwingConstants.CENTER);
		lblNeedMoreActions.setForeground(new Color(128, 0, 0));
		lblNeedMoreActions.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblNeedMoreActions.setBounds(414, 644, 446, 36);
		formM3Panel.add(lblNeedMoreActions);
		
		JLabel label_20 = new JLabel("Prev");
		label_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				falseall();
				formM2Panel.setVisible(true);
			}
		});
		label_20.setHorizontalAlignment(SwingConstants.TRAILING);
		label_20.setForeground(new Color(128, 0, 0));
		label_20.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		label_20.setBounds(1118, 699, 65, 27);
		formM3Panel.add(label_20);
		
		JLabel label_21 = new JLabel("|");
		label_21.setForeground(new Color(128, 0, 0));
		label_21.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		label_21.setBounds(1184, 699, 13, 27);
		formM3Panel.add(label_21);
		
		label_22 = new JLabel("Save");
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(cbSpellcaster.isSelected()) {
					falseall();
					formMSpellcaster.setVisible(true);
				}
				if(cbLegendary.isSelected()) {
					falseall();
					formMLegendary.setVisible(true);
				}
			}
		});
		label_22.setForeground(new Color(128, 0, 0));
		label_22.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		label_22.setBounds(1197, 699, 65, 27);
		formM3Panel.add(label_22);
		
		formMSpellcaster = new JPanel();
		formMSpellcaster.setBackground(new Color(255, 228, 181));
		frmDmHelper.getContentPane().add(formMSpellcaster, "name_1630098190459233");
		formMSpellcaster.setLayout(null);
		
		JLabel lblSpellcaster = new JLabel("Spellcaster");
		lblSpellcaster.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpellcaster.setForeground(new Color(128, 0, 0));
		lblSpellcaster.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		lblSpellcaster.setBounds(414, 13, 446, 36);
		formMSpellcaster.add(lblSpellcaster);
		
		JLabel lblSpellcasterAbility = new JLabel("Spellcaster Ability:");
		lblSpellcasterAbility.setForeground(new Color(128, 0, 0));
		lblSpellcasterAbility.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSpellcasterAbility.setBounds(92, 52, 205, 26);
		formMSpellcaster.add(lblSpellcasterAbility);
		
		cbSpellab = new JComboBox();
		cbSpellab.setModel(new DefaultComboBoxModel(new String[] {"STR", "DEX", "CON", "INT", "WIS", "CHA"}));
		cbSpellab.setSelectedIndex(0);
		cbSpellab.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		cbSpellab.setBounds(309, 52, 68, 26);
		formMSpellcaster.add(cbSpellab);
		
		JLabel lblSpellDc = new JLabel("Spell DC:");
		lblSpellDc.setForeground(new Color(128, 0, 0));
		lblSpellDc.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSpellDc.setBounds(549, 52, 113, 26);
		formMSpellcaster.add(lblSpellDc);
		
		sSpellDC = new JSpinner();
		sSpellDC.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		sSpellDC.setBounds(662, 52, 49, 26);
		formMSpellcaster.add(sSpellDC);
		
		JLabel lblSpellToHit = new JLabel("Spell To Hit:");
		lblSpellToHit.setForeground(new Color(128, 0, 0));
		lblSpellToHit.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		lblSpellToHit.setBounds(895, 52, 137, 26);
		formMSpellcaster.add(lblSpellToHit);
		
		tfSpellToHit = new JTextField();
		tfSpellToHit.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		tfSpellToHit.setBounds(1039, 52, 58, 26);
		formMSpellcaster.add(tfSpellToHit);
		tfSpellToHit.setColumns(10);
		
		formMLegendary = new JPanel();
		formMLegendary.setBackground(new Color(255, 228, 181));
		frmDmHelper.getContentPane().add(formMLegendary, "name_1638253162384953");
		
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
