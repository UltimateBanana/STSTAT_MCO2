package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 890, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 61, 854, 518);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnBinomialDistribution = new JRadioButton("Binomial Distribution");
		rdbtnBinomialDistribution.setBounds(10, 20, 121, 23);
		frame.getContentPane().add(rdbtnBinomialDistribution);
		
		JRadioButton rdbtnNegativeBinomialDistribution = new JRadioButton("Negative Binomial Distribution");
		rdbtnNegativeBinomialDistribution.setBounds(146, 20, 167, 23);
		frame.getContentPane().add(rdbtnNegativeBinomialDistribution);
		
		JRadioButton rdbtnHypergeometricDistribution = new JRadioButton("Hypergeometric Distribution");
		rdbtnHypergeometricDistribution.setBounds(335, 20, 159, 23);
		frame.getContentPane().add(rdbtnHypergeometricDistribution);
		
		JRadioButton rdbtnMultinomialDistribution = new JRadioButton("Multinomial Distribution");
		rdbtnMultinomialDistribution.setBounds(517, 20, 135, 23);
		frame.getContentPane().add(rdbtnMultinomialDistribution);
	}
}
