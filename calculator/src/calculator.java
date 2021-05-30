import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frmCalculator;
	private JTextField box1;
	private JTextField box2;
	private JTextField ansbox;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 823, 508);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		box1 = new JTextField();
		box1.setBounds(73, 150, 233, 55);
		frmCalculator.getContentPane().add(box1);
		box1.setColumns(10);
		
		box2 = new JTextField();
		box2.setColumns(10);
		box2.setBounds(515, 150, 233, 55);
		frmCalculator.getContentPane().add(box2);
		
		ansbox = new JTextField();
		ansbox.setBounds(231, 279, 352, 95);
		frmCalculator.getContentPane().add(ansbox);
		ansbox.setColumns(10);
		
		JButton btnNewButton = new JButton("SUM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(box1.getText().trim()); 
					num2 = Integer.parseInt(box2.getText().trim());
					ans = num1 + num2;
					ansbox.setText(Integer.toString(ans));
					lblNewLabel_1.setText("THE SUM IS ");
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number...");
				}
			}
		});
		btnNewButton.setBounds(29, 279, 116, 41);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DIFFERENCE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(box1.getText().trim()); 
					num2 = Integer.parseInt(box2.getText().trim());
					ans = num1 - num2;
					ansbox.setText(Integer.toString(ans));
					lblNewLabel_1.setText("THE DIFFERENCE IS ");
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number...");
				}
			}
		});
		btnNewButton_1.setBounds(29, 330, 116, 44);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("NUM 1");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.PLAIN, 17));
		lblNewLabel.setBounds(123, 108, 126, 32);
		frmCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblNum = new JLabel("NUM 2");
		lblNum.setFont(new Font("Sitka Subheading", Font.PLAIN, 17));
		lblNum.setBounds(581, 108, 126, 32);
		frmCalculator.getContentPane().add(lblNum);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(244, 237, 276, 32);
		frmCalculator.getContentPane().add(lblNewLabel_1);
	}

}
