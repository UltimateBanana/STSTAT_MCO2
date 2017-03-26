package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controller.Controller;

import javax.swing.UIManager;
import javax.swing.JCheckBox;

public class GUI {

	public JFrame frame;
	public Controller controller;
	private JTabbedPane tabbedPane;
	
	// Binomial Distribution
	private JPanel panelBinomial;
	private JLabel lblNumberOfTrials;
	private JLabel lblKExperiments;
	private JTextField textFieldNumberOfTrials;
	private JTextField textFieldKExperiments;
	// Coin
	private JPanel panelBiCoin;
	private JRadioButton rdbtnBiHeads;
	private JRadioButton rdbtnBiTails;
	private ButtonGroup group1;
	private JLabel lblDefinitionOfSuccessCoin;
	// Cards
	private JPanel panelBiCards;
	private JLabel lblNumberOfCards_1;
	private JTextField textField_29;
	private JLabel labelDefinitionOfSuccessCards;
//	private ButtonGroup group2;
	// Marbles
	private JPanel panelBiMarbles;
	private JLabel labelDefinitionOfSuccessMarbles;
	private JRadioButton rdbtnBiGold;
	private JRadioButton rdbtnBiSilver;
	private JRadioButton rdbtnBiBronze;
	private ButtonGroup group3;
	private JLabel lblNumberOfGold;
	private JLabel lblNumberOfSilver;
	private JLabel lblNumberOfBronze;
	private JTextField textFieldBiGold;
	private JTextField textFieldBiSilver;
	private JTextField textField;
	// Execute
	private JButton btnExecute;
	
	// Negative Binomial Distribution
	private JPanel panelNegativeBinomial;
	private JLabel label_1;
	private JTextField textField_2;
	private JLabel lblNumberOfKexperiment;
	private JTextField textField_30;
	// Coin
	private JPanel panel;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private ButtonGroup group4;
	private JLabel label_2;
	// Cards
	private JPanel panel_1;
	private JLabel label_3;
	private JLabel lblNumberOfCards;
	private JTextField textField_1;
//	private ButtonGroup group5;
	// Marbles
	private JPanel panel_2;
	private JLabel label_4;
	private JRadioButton radioButton_6;
	private JRadioButton radioButton_7;
	private JRadioButton radioButton_8;
	private ButtonGroup group6;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	// Execute
	private JButton button;
	
	// Hypergeometric Distribution
	private JPanel panelHypergeometric;
	// Coin
	private JPanel panel_3;
	private JRadioButton radioButton_9;
	private JRadioButton radioButton_10;
	private ButtonGroup group7;
	private JLabel label_10;
	// Cards
	private JPanel panel_4;
	private ButtonGroup group8;
	private JLabel lblNumberOfSelected;
	private JLabel lblNumberOfCards_2;
	private JTextField textField_11;
	private JTextField textField_12;
	// Marbles
	private JPanel panel_5;
	private JLabel label_12;
	private JRadioButton radioButton_15;
	private JRadioButton radioButton_16;
	private JRadioButton radioButton_17;
	private ButtonGroup group9;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblNumberOfItems;
	private JTextField textField_6;
	// Execute
	private JButton button_1;
	
	// Multinomial Distribution
	private JPanel panelMultinomial;
	// Coins
	private JPanel panel_6;
	private ButtonGroup group10;
	private JLabel lblNumberOfKexperiments_1;
	private JLabel label_22;
	private JTextField textField_27;
	private JTextField textField_28;
	// Cards
	private JPanel panel_7;
	private JLabel lblMultinomKExperiments;
	private JLabel lblNumberOfTrials_1;
	private JTextField textField_23;
	private JTextField textField_24;
	// Marbles
	private JPanel panel_8;
	private JLabel lblSelectedGoldMarbles;
	private JLabel lblSelectedSilverMarbles;
	private JLabel lblSelectedBronzeMarbles;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_22;
	private JLabel lblNumberOfKexperiments_2;
	private JLabel label_19;
	private JTextField textField_25;
	private JTextField textField_26;
	// Execute
	private JButton button_2;
	private JButton btnClear;
	private JButton btnClear_1;
	private JButton btnClear_2;
	private JButton btnClear_3;
	
	private JRadioButton rdbtnTossingACoin;
	private JRadioButton rdbtnDeckOfCards;
	private JRadioButton rdbtnMarbles;
	private ButtonGroup group11;
	
	
	
	private JLabel lblNumberOfKexperiments;
	private JTextField textField_31;
	private JLabel label;
	private JTextField textField_32;
	private JLabel label_23;
	private JTextField textField_33;
	private JLabel lblProbabilityForGroup;
	private JLabel lblProbabilityForGroup_1;
	private JLabel lblProbabilityForGroup_2;
	private JLabel lblProbabilityForGroup_3;
	private JTextField textField_7;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_20;
	private JTextField textField_15;
	private JTextField textField_16;
	private JLabel lblNumberOfSelected_1;
	private JTextField textField_17;
	private JLabel lblNumberOfSelected_2;
	private JTextField textField_21;
	private JLabel lblNumberOfSelected_3;
	private JTextField textField_34;
	
	
	

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the application.
	 */
	public GUI() {
		controller = new Controller();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 59, 696, 529);
		frame.getContentPane().add(tabbedPane);
		
		
		// Binomial Distribution
		panelBinomial = new JPanel();
		panelBinomial.setBackground(Color.WHITE);
		tabbedPane.addTab("Binomial Distribution", null, panelBinomial, null);
		panelBinomial.setLayout(null);
		
		lblNumberOfTrials = new JLabel("Number of Trials:");
		lblNumberOfTrials.setBounds(10, 11, 167, 14);
		panelBinomial.add(lblNumberOfTrials);
		
		textFieldNumberOfTrials = new JTextField();
		textFieldNumberOfTrials.setBounds(187, 5, 86, 20);
		panelBinomial.add(textFieldNumberOfTrials);
		textFieldNumberOfTrials.setColumns(10);
		
		lblKExperiments = new JLabel("Number of k-experiments:");
		lblKExperiments.setBounds(10, 42, 167, 14);
		panelBinomial.add(lblKExperiments);
		
		textFieldKExperiments = new JTextField();
		textFieldKExperiments.setBounds(187, 36, 86, 20);
		panelBinomial.add(textFieldKExperiments);
		textFieldKExperiments.setColumns(10);
		
		// Coins
		panelBiCoin = new JPanel();
		panelBiCoin.setBackground(Color.WHITE);
		panelBiCoin.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tossing A Coin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelBiCoin.setBounds(283, 11, 398, 134);
		panelBinomial.add(panelBiCoin);
		panelBiCoin.setLayout(null);
		
		rdbtnBiHeads = new JRadioButton("Heads");
		rdbtnBiHeads.setBackground(Color.WHITE);
		rdbtnBiHeads.setBounds(10, 41, 74, 23);
		panelBiCoin.add(rdbtnBiHeads);
		
		rdbtnBiTails = new JRadioButton("Tails");
		rdbtnBiTails.setBackground(Color.WHITE);
		rdbtnBiTails.setBounds(86, 41, 74, 23);
		panelBiCoin.add(rdbtnBiTails);
		
		group1 = new ButtonGroup();
		group1.add(rdbtnBiHeads);
		group1.add(rdbtnBiTails);
		
		lblDefinitionOfSuccessCoin = new JLabel("Definition of Success");
		lblDefinitionOfSuccessCoin.setBounds(10, 20, 150, 14);
		panelBiCoin.add(lblDefinitionOfSuccessCoin);
		
		// Cards
		panelBiCards = new JPanel();
		panelBiCards.setLayout(null);
		panelBiCards.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Deck Of Cards", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelBiCards.setBackground(Color.WHITE);
		panelBiCards.setBounds(283, 156, 398, 133);
		panelBinomial.add(panelBiCards);
		
		labelDefinitionOfSuccessCards = new JLabel("Definition of Success");
		labelDefinitionOfSuccessCards.setBounds(10, 20, 136, 14);
		panelBiCards.add(labelDefinitionOfSuccessCards);
		
		lblNumberOfCards_1 = new JLabel("Number of Cards:");
		lblNumberOfCards_1.setBounds(10, 45, 102, 14);
		panelBiCards.add(lblNumberOfCards_1);
		
		textField_29 = new JTextField();
		textField_29.setBounds(122, 45, 86, 20);
		panelBiCards.add(textField_29);
		textField_29.setColumns(10);
		
//		group2 = new ButtonGroup();
		
		// Marbles
		panelBiMarbles = new JPanel();
		panelBiMarbles.setLayout(null);
		panelBiMarbles.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Marbles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelBiMarbles.setBackground(Color.WHITE);
		panelBiMarbles.setBounds(283, 300, 398, 134);
		panelBinomial.add(panelBiMarbles);
		
		labelDefinitionOfSuccessMarbles = new JLabel("Definition of Success");
		labelDefinitionOfSuccessMarbles.setBounds(10, 20, 129, 14);
		panelBiMarbles.add(labelDefinitionOfSuccessMarbles);
		
		rdbtnBiGold = new JRadioButton("Gold");
		rdbtnBiGold.setBounds(10, 41, 73, 23);
		panelBiMarbles.add(rdbtnBiGold);
		rdbtnBiGold.setBackground(Color.WHITE);
		
		rdbtnBiSilver = new JRadioButton("Silver");
		rdbtnBiSilver.setBounds(10, 67, 73, 23);
		panelBiMarbles.add(rdbtnBiSilver);
		rdbtnBiSilver.setBackground(Color.WHITE);
		
		rdbtnBiBronze = new JRadioButton("Bronze");
		rdbtnBiBronze.setBounds(10, 93, 73, 23);
		panelBiMarbles.add(rdbtnBiBronze);
		rdbtnBiBronze.setBackground(Color.WHITE);
		
		group3 = new ButtonGroup();
		group3.add(rdbtnBiBronze);
		group3.add(rdbtnBiGold);
		group3.add(rdbtnBiSilver);
		
		lblNumberOfGold = new JLabel("Number of Gold Marbles:");
		lblNumberOfGold.setBounds(125, 50, 175, 14);
		panelBiMarbles.add(lblNumberOfGold);
		
		lblNumberOfSilver = new JLabel("Number of Silver Marbles:");
		lblNumberOfSilver.setBounds(125, 76, 175, 14);
		panelBiMarbles.add(lblNumberOfSilver);
		
		lblNumberOfBronze = new JLabel("Number of Bronze Marbles:");
		lblNumberOfBronze.setBounds(125, 102, 175, 14);
		panelBiMarbles.add(lblNumberOfBronze);
		
		textFieldBiGold = new JTextField();
		textFieldBiGold.setBounds(317, 44, 71, 20);
		panelBiMarbles.add(textFieldBiGold);
		textFieldBiGold.setColumns(10);
		
		textFieldBiSilver = new JTextField();
		textFieldBiSilver.setColumns(10);
		textFieldBiSilver.setBounds(317, 70, 71, 20);
		panelBiMarbles.add(textFieldBiSilver);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(317, 96, 71, 20);
		panelBiMarbles.add(textField);
		
		btnExecute = new JButton("Execute");
		btnExecute.setBounds(189, 445, 89, 23);
		panelBinomial.add(btnExecute);
		btnExecute.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if(rdbtnTossingACoin.isSelected())
				  {
					  double x = Float.parseFloat(textFieldKExperiments.getText());
					  double size = Float.parseFloat(textFieldNumberOfTrials.getText());
					  double prob = 0.5;
					  
					  if(rdbtnBiHeads.isSelected())
						  controller.getBinomial(x, size, prob, rdbtnBiHeads.getText());
					  else if(rdbtnBiTails.isSelected())
						  controller.getBinomial(x, size, prob, rdbtnBiTails.getText());
				  }
				  else if(rdbtnDeckOfCards.isSelected())
				  {
					  double x = Float.parseFloat(textFieldKExperiments.getText());
					  double size = Float.parseFloat(textFieldNumberOfTrials.getText());
					  double numCards = Float.parseFloat(textField_29.getText());
					  double prob = numCards/52.0;
					  
					  controller.getBinomial(x, size, prob, "Number of successful cards in the deck");
				  }
				  else if(rdbtnMarbles.isSelected())
				  {
					  double x = Float.parseFloat(textFieldKExperiments.getText());
					  double size = Float.parseFloat(textFieldNumberOfTrials.getText());
					  double numGold = Float.parseFloat(textFieldBiGold.getText());
					  double numSilver = Float.parseFloat(textFieldBiSilver.getText());
					  double numBronze = Float.parseFloat(textField.getText());
					  double prob = 0.0;
					  
					  if(rdbtnBiGold.isSelected())
					  {
						  if(numSilver == 0)
						  {
							  prob = numGold/(numBronze + numGold);
							  
						  }
						  else if(numBronze == 0)
						  {
							  prob = numGold/(numSilver + numGold);
						  }
						  else
						  {
							  prob = numGold/(numSilver + numBronze + numGold);
						  }
						  controller.getBinomial(x, size, prob, rdbtnBiGold.getText());
					  }
					  else if(rdbtnBiSilver.isSelected())
					  {
						  if(numGold == 0)
						  {
							  prob = numSilver/(numBronze + numSilver);
							  
						  }
						  else if(numBronze == 0)
						  {
							  prob = numSilver/(numGold + numSilver);
						  }
						  else
						  {
							  prob = numSilver/(numGold + numBronze + numSilver);
						  }
						  controller.getBinomial(x, size, prob, rdbtnBiSilver.getText());
					  }
					  else if(rdbtnBiBronze.isSelected())
					  {
						  if(numGold == 0)
						  {
							  prob = numBronze/(numSilver + numBronze);
							  
						  }
						  else if(numSilver == 0)
						  {
							  prob = numBronze/(numGold + numBronze);
							  controller.getBinomial(x, size, prob, rdbtnBiBronze.getText());
						  }
						  else
						  {
							  prob = numBronze/(numSilver + numGold + numBronze);
							  controller.getBinomial(x, size, prob, rdbtnBiBronze.getText());
						  }
						  controller.getBinomial(x, size, prob, rdbtnBiBronze.getText());
					  }
				  }
			  } 
		});
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(402, 445, 89, 23);
		panelBinomial.add(btnClear);
		
		
		// Negative Binomial
		panelNegativeBinomial = new JPanel();
		panelNegativeBinomial.setBackground(Color.WHITE);
		tabbedPane.addTab("Negative Binomial Distribution", null, panelNegativeBinomial, null);
		panelNegativeBinomial.setLayout(null);
		
		label_1 = new JLabel("Number of Successes:");
		label_1.setBounds(10, 11, 167, 14);
		panelNegativeBinomial.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 11, 86, 20);
		panelNegativeBinomial.add(textField_2);
		
		lblNumberOfKexperiment = new JLabel("Number of k-experiments:");
		lblNumberOfKexperiment.setBounds(10, 36, 167, 14);
		panelNegativeBinomial.add(lblNumberOfKexperiment);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(187, 36, 86, 20);
		panelNegativeBinomial.add(textField_30);
		
		// Coin
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tossing A Coin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(283, 11, 398, 134);
		panelNegativeBinomial.add(panel);
		
		radioButton = new JRadioButton("Heads");
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(10, 41, 74, 23);
		panel.add(radioButton);
		
		radioButton_1 = new JRadioButton("Tails");
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(86, 41, 74, 23);
		panel.add(radioButton_1);
		
		group4 = new ButtonGroup();
		group4.add(radioButton);
		group4.add(radioButton_1);
		
		label_2 = new JLabel("Definition of Success");
		label_2.setBounds(10, 20, 144, 14);
		panel.add(label_2);
		
		// Cards
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Deck Of Cards", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(283, 156, 398, 133);
		panelNegativeBinomial.add(panel_1);
		
		label_3 = new JLabel("Definition of Success");
		label_3.setBounds(10, 20, 144, 14);
		panel_1.add(label_3);
		
		lblNumberOfCards = new JLabel("Number of Cards:");
		lblNumberOfCards.setBounds(10, 46, 109, 14);
		panel_1.add(lblNumberOfCards);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 43, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
//		group5 = new ButtonGroup();
		
		// Marbles
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Marbles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(283, 300, 398, 134);
		panelNegativeBinomial.add(panel_2);
		
		label_4 = new JLabel("Definition of Success");
		label_4.setBounds(10, 20, 144, 14);
		panel_2.add(label_4);
		
		radioButton_6 = new JRadioButton("Gold");
		radioButton_6.setBackground(Color.WHITE);
		radioButton_6.setBounds(10, 41, 73, 23);
		panel_2.add(radioButton_6);
		
		radioButton_7 = new JRadioButton("Silver");
		radioButton_7.setBackground(Color.WHITE);
		radioButton_7.setBounds(10, 67, 73, 23);
		panel_2.add(radioButton_7);
		
		radioButton_8 = new JRadioButton("Bronze");
		radioButton_8.setBackground(Color.WHITE);
		radioButton_8.setBounds(10, 93, 73, 23);
		panel_2.add(radioButton_8);
		
		group6 = new ButtonGroup();
		group6.add(radioButton_6);
		group6.add(radioButton_7);
		group6.add(radioButton_8);
		
		label_5 = new JLabel("Number of Gold Marbles:");
		label_5.setBounds(89, 45, 173, 14);
		panel_2.add(label_5);
		
		label_6 = new JLabel("Number of Silver Marbles:");
		label_6.setBounds(89, 71, 173, 14);
		panel_2.add(label_6);
		
		label_7 = new JLabel("Number of Bronze Marbles:");
		label_7.setBounds(89, 97, 173, 14);
		panel_2.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(272, 44, 71, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(272, 70, 71, 20);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(272, 96, 71, 20);
		panel_2.add(textField_5);
		
		button = new JButton("Execute");
		button.setBounds(181, 445, 89, 23);
		panelNegativeBinomial.add(button);
		button.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if(rdbtnTossingACoin.isSelected())
				  {
					  double k = Float.parseFloat(textField_30.getText());
					  double size = Float.parseFloat(textField_2.getText());
					  double prob = 0.5;
					  
					  if(radioButton.isSelected())
					  {
						  controller.getNegativeBinomial(k, size, prob, radioButton.getText());
					  }
					  else if(radioButton_1.isSelected())
					  {
						  controller.getNegativeBinomial(k, size, prob, radioButton_1.getText());
					  }
				  }
				  else if(rdbtnDeckOfCards.isSelected())
				  {
					  double k = Float.parseFloat(textField_30.getText());
					  double size = Float.parseFloat(textField_2.getText());
					  double numCards = Float.parseFloat(textField_1.getText());
					  double prob = numCards/52.0;
					  
					  controller.getNegativeBinomial(k, size, prob, "Number of successful cards in the deck");
				  }
				  else if(rdbtnMarbles.isSelected())
				  {
					  double k = Float.parseFloat(textField_30.getText());
					  double size = Float.parseFloat(textField_2.getText());
					  double numGold = Float.parseFloat(textField_3.getText());
					  double numSilver = Float.parseFloat(textField_4.getText());
					  double numBronze = Float.parseFloat(textField_5.getText());
					  double prob = 0.0;
					  
					  if(radioButton_6.isSelected())
					  {
						  if(numSilver == 0)
						  {
							  prob = numGold/(numBronze + numGold);
						  }
						  else if(numBronze == 0)
						  {
							  prob = numGold/(numSilver + numGold);
						  }
						  else
						  {
							  prob = numGold/(numSilver + numBronze + numGold);
						  }
						  controller.getNegativeBinomial(k, size, prob, radioButton_6.getText());
					  }
					  else if(radioButton_7.isSelected())
					  {
						  if(numGold == 0)
						  {
							  prob = numSilver/(numBronze + numSilver);
						  }
						  else if(numBronze == 0)
						  {
							  prob = numSilver/(numGold + numSilver);
						  }
						  else
						  {
							  prob = numSilver/(numGold + numBronze + numSilver);
						  }
						  controller.getNegativeBinomial(k, size, prob, radioButton_7.getText());
					  }
					  else if(radioButton_8.isSelected())
					  {
						  if(numGold == 0)
						  {
							  prob = numBronze/(numSilver + numBronze);
						  }
						  else if(numSilver == 0)
						  {
							  prob = numBronze/(numGold + numBronze);
						  }
						  else
						  {
							  prob = numBronze/(numSilver + numGold + numBronze);
						  }
						  controller.getNegativeBinomial(k, size, prob, radioButton_8.getText());
					  }
				  }
			  } 
		});
		
		btnClear_2 = new JButton("Clear");
		btnClear_2.setBounds(434, 445, 89, 23);
		panelNegativeBinomial.add(btnClear_2);
		
		
		// Hypergeometric
		panelHypergeometric = new JPanel();
		panelHypergeometric.setBackground(Color.WHITE);
		tabbedPane.addTab("Hypergeometric Distribution", null, panelHypergeometric, null);
		panelHypergeometric.setLayout(null);
		
		// Coin
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tossing A Coin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 11, 671, 134);
		panelHypergeometric.add(panel_3);
		
		radioButton_9 = new JRadioButton("Heads");
		radioButton_9.setBackground(Color.WHITE);
		radioButton_9.setBounds(10, 41, 74, 23);
		panel_3.add(radioButton_9);
		
		radioButton_10 = new JRadioButton("Tails");
		radioButton_10.setBackground(Color.WHITE);
		radioButton_10.setBounds(86, 41, 74, 23);
		panel_3.add(radioButton_10);
		
		group7 = new ButtonGroup();
		group7.add(radioButton_9);
		group7.add(radioButton_10);
		
		label_10 = new JLabel("Definition of Success");
		label_10.setBounds(10, 20, 137, 14);
		panel_3.add(label_10);
		
		lblNumberOfKexperiments = new JLabel("Number of k-experiments:");
		lblNumberOfKexperiments.setBounds(196, 20, 270, 14);
		panel_3.add(lblNumberOfKexperiments);
		
		textField_31 = new JTextField();
		textField_31.setBounds(476, 19, 74, 20);
		panel_3.add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNumberOfCoin = new JLabel("Number of Coin Flips (one side) in Population:");
		lblNumberOfCoin.setBounds(196, 45, 270, 14);
		panel_3.add(lblNumberOfCoin);
		
		textField_15 = new JTextField();
		textField_15.setBounds(476, 44, 74, 20);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNumberOfCoin_1 = new JLabel("Number of Coin Flips in Sample:");
		lblNumberOfCoin_1.setBounds(196, 70, 270, 14);
		panel_3.add(lblNumberOfCoin_1);
		
		textField_16 = new JTextField();
		textField_16.setBounds(476, 67, 74, 20);
		panel_3.add(textField_16);
		textField_16.setColumns(10);
		
		lblNumberOfSelected_3 = new JLabel("Number of Selected Coin Flips in Sample:");
		lblNumberOfSelected_3.setBounds(196, 95, 270, 14);
		panel_3.add(lblNumberOfSelected_3);
		
		textField_34 = new JTextField();
		textField_34.setBounds(476, 92, 74, 20);
		panel_3.add(textField_34);
		textField_34.setColumns(10);
		
		// Cards
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Deck Of Cards", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 156, 671, 133);
		panelHypergeometric.add(panel_4);
		
//		group8 = new ButtonGroup();
		
		lblNumberOfSelected = new JLabel("Number of Selected Cards in Population:");
		lblNumberOfSelected.setBounds(10, 26, 282, 14);
		panel_4.add(lblNumberOfSelected);
		
		lblNumberOfCards_2 = new JLabel("Number of Cards in Sample:");
		lblNumberOfCards_2.setBounds(10, 52, 282, 14);
		panel_4.add(lblNumberOfCards_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(302, 52, 69, 20);
		panel_4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(302, 26, 69, 20);
		panel_4.add(textField_12);
		
		label = new JLabel("Number of k-experiments:");
		label.setBounds(10, 80, 282, 14);
		panel_4.add(label);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(302, 80, 69, 20);
		panel_4.add(textField_32);
		
		lblNumberOfSelected_1 = new JLabel("Number of Selected Cards in Sample:");
		lblNumberOfSelected_1.setBounds(10, 105, 282, 14);
		panel_4.add(lblNumberOfSelected_1);
		
		textField_17 = new JTextField();
		textField_17.setBounds(302, 102, 69, 20);
		panel_4.add(textField_17);
		textField_17.setColumns(10);
		
		// Marbles
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Marbles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(10, 300, 671, 134);
		panelHypergeometric.add(panel_5);
		
		label_12 = new JLabel("Definition of Success");
		label_12.setBounds(10, 20, 137, 14);
		panel_5.add(label_12);
		
		radioButton_15 = new JRadioButton("Gold");
		radioButton_15.setBackground(Color.WHITE);
		radioButton_15.setBounds(10, 41, 73, 23);
		panel_5.add(radioButton_15);
		
		radioButton_16 = new JRadioButton("Silver");
		radioButton_16.setBackground(Color.WHITE);
		radioButton_16.setBounds(10, 67, 73, 23);
		panel_5.add(radioButton_16);
		
		radioButton_17 = new JRadioButton("Bronze");
		radioButton_17.setBackground(Color.WHITE);
		radioButton_17.setBounds(10, 93, 73, 23);
		panel_5.add(radioButton_17);
		
		group9 = new ButtonGroup();
		group9.add(radioButton_15);
		group9.add(radioButton_16);
		group9.add(radioButton_17);
		
		label_13 = new JLabel("Number of Gold Marbles:");
		label_13.setBounds(89, 45, 170, 14);
		panel_5.add(label_13);
		
		label_14 = new JLabel("Number of Silver Marbles:");
		label_14.setBounds(89, 71, 170, 14);
		panel_5.add(label_14);
		
		label_15 = new JLabel("Number of Bronze Marbles:");
		label_15.setBounds(89, 97, 170, 14);
		panel_5.add(label_15);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(285, 41, 51, 20);
		panel_5.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(285, 67, 51, 20);
		panel_5.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(285, 93, 51, 20);
		panel_5.add(textField_10);
		
		lblNumberOfItems = new JLabel("Number of Marbles in Sample:");
		lblNumberOfItems.setBounds(358, 41, 239, 14);
		panel_5.add(lblNumberOfItems);
		
		textField_6 = new JTextField();
		textField_6.setBounds(592, 41, 69, 20);
		panel_5.add(textField_6);
		textField_6.setColumns(10);
		
		label_23 = new JLabel("Number of k-experiments:");
		label_23.setBounds(358, 69, 239, 14);
		panel_5.add(label_23);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(592, 71, 69, 20);
		panel_5.add(textField_33);
		
		lblNumberOfSelected_2 = new JLabel("Number of Selected Marbles in Sample:");
		lblNumberOfSelected_2.setBounds(358, 94, 239, 14);
		panel_5.add(lblNumberOfSelected_2);
		
		textField_21 = new JTextField();
		textField_21.setBounds(592, 94, 69, 20);
		panel_5.add(textField_21);
		textField_21.setColumns(10);
		
		button_1 = new JButton("Execute");
		button_1.setBounds(168, 445, 89, 23);
		panelHypergeometric.add(button_1);
		button_1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if(rdbtnTossingACoin.isSelected())
				  {
					  double x = Float.parseFloat(textField_34.getText());
					  double nn = Float.parseFloat(textField_31.getText()); // k-experiments
					  double m = Float.parseFloat(textField_15.getText());
					  double n = Float.parseFloat(textField_15.getText());
					  double k = Float.parseFloat(textField_16.getText());
					  
					  if(radioButton_9.isSelected())
						  controller.getHypergeometric(x, nn, m, n, k, radioButton_9.getText());
					  else if(radioButton_10.isSelected())
						  controller.getHypergeometric(x, nn, m, n, k, radioButton_10.getText());
				  }
				  else if(rdbtnDeckOfCards.isSelected())
				  {
					  double x = Float.parseFloat(textField_17.getText());
					  double nn = Float.parseFloat(textField_32.getText()); // k-experiments
					  double m = Float.parseFloat(textField_11.getText());
					  double n = 52.0-m;
					  double k = Float.parseFloat(textField_12.getText());
					  
					  controller.getHypergeometric(x, nn, m, n, k, "Number of successful cards in the deck");
				  }
				  else if(rdbtnMarbles.isSelected())
				  {
					  double x = Float.parseFloat(textField_21.getText());
					  double nn = Float.parseFloat(textField_33.getText()); // k-experiments
					  double numGold = Float.parseFloat(textField_8.getText());
					  double numSilver = Float.parseFloat(textField_9.getText());
					  double numBronze = Float.parseFloat(textField_10.getText());
					  double k = Float.parseFloat(textField_6.getText());
					  
					  if(radioButton_15.isSelected())
					  {
						  double m = numGold;
						  double n = numSilver + numBronze;
						  
						  controller.getHypergeometric(x, nn, m, n, k, radioButton_15.getText());
					  }
					  else if(radioButton_16.isSelected())
					  {
						  double m = numSilver;
						  double n = numGold + numBronze;
						  
						  controller.getHypergeometric(x, nn, m, n, k, radioButton_16.getText());
					  }
					  else if(radioButton_17.isSelected())
					  {
						  double m = numBronze;
						  double n = numGold + numSilver;
						  
						  controller.getHypergeometric(x, nn, m, n, k, radioButton_16.getText());
					  }
				  }
			  } 
		});
		
		btnClear_1 = new JButton("Clear");
		btnClear_1.setBounds(450, 445, 89, 23);
		panelHypergeometric.add(btnClear_1);
		
		
		// Multinomial
		panelMultinomial = new JPanel();
		panelMultinomial.setBackground(Color.WHITE);
		tabbedPane.addTab("Multinomial Distribution", null, panelMultinomial, null);
		panelMultinomial.setLayout(null);
		
		// Coin
		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tossing A Coin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(10, 11, 636, 134);
		panelMultinomial.add(panel_6);
		
//		group10 = new ButtonGroup();
		
		lblNumberOfKexperiments_1 = new JLabel("Number of k-experiments:");
		lblNumberOfKexperiments_1.setBounds(10, 25, 160, 14);
		panel_6.add(lblNumberOfKexperiments_1);
		
		label_22 = new JLabel("Number of Trials:");
		label_22.setBounds(10, 48, 160, 14);
		panel_6.add(label_22);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(180, 22, 73, 20);
		panel_6.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(180, 45, 73, 20);
		panel_6.add(textField_28);
		
		// Cards
		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Deck Of Cards", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(10, 156, 636, 141);
		panelMultinomial.add(panel_7);
		
		lblMultinomKExperiments = new JLabel("Number of k-experiments:");
		lblMultinomKExperiments.setBounds(292, 21, 161, 14);
		panel_7.add(lblMultinomKExperiments);
		
		lblNumberOfTrials_1 = new JLabel("Number of Trials:");
		lblNumberOfTrials_1.setBounds(292, 47, 161, 14);
		panel_7.add(lblNumberOfTrials_1);
		
		textField_23 = new JTextField();
		textField_23.setBounds(463, 18, 73, 20);
		panel_7.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(463, 44, 73, 20);
		panel_7.add(textField_24);
		
		lblProbabilityForGroup = new JLabel("Probability for Group1:");
		lblProbabilityForGroup.setBounds(10, 18, 157, 14);
		panel_7.add(lblProbabilityForGroup);
		
		lblProbabilityForGroup_1 = new JLabel("Probability for Group2:");
		lblProbabilityForGroup_1.setBounds(10, 41, 157, 14);
		panel_7.add(lblProbabilityForGroup_1);
		
		lblProbabilityForGroup_2 = new JLabel("Probability for Group3:");
		lblProbabilityForGroup_2.setBounds(10, 66, 157, 14);
		panel_7.add(lblProbabilityForGroup_2);
		
		lblProbabilityForGroup_3 = new JLabel("Probability for Group4:");
		lblProbabilityForGroup_3.setBounds(10, 91, 157, 14);
		panel_7.add(lblProbabilityForGroup_3);
		
		textField_7 = new JTextField();
		textField_7.setBounds(177, 15, 86, 20);
		panel_7.add(textField_7);
		textField_7.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(177, 38, 86, 20);
		panel_7.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(177, 63, 86, 20);
		panel_7.add(textField_14);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(177, 88, 86, 20);
		panel_7.add(textField_20);
		
		// Marbles
		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Marbles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(10, 300, 636, 134);
		panelMultinomial.add(panel_8);
		
		lblSelectedGoldMarbles = new JLabel("Probability of Gold Marbles:");
		lblSelectedGoldMarbles.setBounds(10, 28, 210, 14);
		panel_8.add(lblSelectedGoldMarbles);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(219, 28, 51, 20);
		panel_8.add(textField_18);
		
		lblSelectedSilverMarbles = new JLabel("Probability of Silver Marbles:");
		lblSelectedSilverMarbles.setBounds(10, 54, 210, 14);
		panel_8.add(lblSelectedSilverMarbles);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(219, 54, 51, 20);
		panel_8.add(textField_19);
		
		lblSelectedBronzeMarbles = new JLabel("Probability of Bronze Marbles:");
		lblSelectedBronzeMarbles.setBounds(10, 80, 210, 14);
		panel_8.add(lblSelectedBronzeMarbles);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(219, 80, 51, 20);
		panel_8.add(textField_22);
		
		lblNumberOfKexperiments_2 = new JLabel("Number of k-experiments:");
		lblNumberOfKexperiments_2.setBounds(295, 31, 156, 14);
		panel_8.add(lblNumberOfKexperiments_2);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(461, 25, 73, 20);
		panel_8.add(textField_25);
		
		label_19 = new JLabel("Number of Trials:");
		label_19.setBounds(295, 54, 156, 14);
		panel_8.add(label_19);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(461, 51, 73, 20);
		panel_8.add(textField_26);
		
		button_2 = new JButton("Execute");
		button_2.setBounds(151, 445, 89, 23);
		panelMultinomial.add(button_2);
		button_2.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if(rdbtnTossingACoin.isSelected())
				  {
					  double k = Double.parseDouble(textField_27.getText());
					  double size = Double.parseDouble(textField_28.getText());
					  double[] prob = {0.5, 0.5};
					  
					  controller.getMultinomial(k, size, prob);
				  }
				  else if(rdbtnDeckOfCards.isSelected())
				  {
					  double k = Double.parseDouble(textField_23.getText());
					  double size = Double.parseDouble(textField_24.getText());
					  double probGroup1 = Double.parseDouble(textField_7.getText());
					  double probGroup2 = Double.parseDouble(textField_13.getText());
					  double probGroup3 = Double.parseDouble(textField_14.getText());
					  double probGroup4 = Double.parseDouble(textField_20.getText());
					  ArrayList<Double> listProb = new ArrayList<Double>(0);
					  
					  if(probGroup1 != 0)
						  listProb.add(probGroup1);
					  if(probGroup2 != 0)
						  listProb.add(probGroup2);
					  if(probGroup3 != 0)
						  listProb.add(probGroup3);
					  if(probGroup4 != 0)
						  listProb.add(probGroup4);
					  
					  double[] prob = new double[listProb.size()];
					  for(int i = 0; i < listProb.size(); i++)
					  {
						  prob[i] = listProb.get(i);
					  }
					  
					  controller.getMultinomial(k, size, prob);
				  }
				  else if(rdbtnMarbles.isSelected())
				  {
					  double k = Double.parseDouble(textField_25.getText());
					  double size = Double.parseDouble(textField_26.getText());
					  double probGold = Double.parseDouble(textField_18.getText());
					  double probSilver = Double.parseDouble(textField_19.getText());
					  double probBronze = Double.parseDouble(textField_22.getText());
					  ArrayList<Double> listProb = new ArrayList<Double>(0);
					  
					  if(probGold != 0)
						  listProb.add(probGold);
					  if(probSilver != 0)
						  listProb.add(probSilver);
					  if(probBronze != 0)
						  listProb.add(probBronze);
					  
					  double[] prob = new double[listProb.size()];
					  for(int i = 0; i < listProb.size(); i++)
					  {
						  prob[i] = listProb.get(i);
					  }
					  
					  controller.getMultinomial(k, size, prob);
				  }
			  } 
		});
		
		btnClear_3 = new JButton("Clear");
		btnClear_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClear_3.setBounds(449, 445, 89, 23);
		panelMultinomial.add(btnClear_3);
		
		rdbtnTossingACoin = new JRadioButton("Tossing A Coin");
		rdbtnTossingACoin.setBounds(34, 18, 109, 23);
		frame.getContentPane().add(rdbtnTossingACoin);
		
		rdbtnDeckOfCards = new JRadioButton("Deck Of Cards");
		rdbtnDeckOfCards.setBounds(230, 18, 109, 23);
		frame.getContentPane().add(rdbtnDeckOfCards);
		
		rdbtnMarbles = new JRadioButton("Marbles");
		rdbtnMarbles.setBounds(432, 18, 109, 23);
		frame.getContentPane().add(rdbtnMarbles);
		
		group11 = new ButtonGroup();
		group11.add(rdbtnTossingACoin);
		group11.add(rdbtnDeckOfCards);
		group11.add(rdbtnMarbles);
		
	}
}
