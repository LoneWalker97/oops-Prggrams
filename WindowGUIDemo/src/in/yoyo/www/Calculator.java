package in.yoyo.www;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(98, 55, 237, 74);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(347, 55, 253, 74);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					
					
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid Entry Plz Enter integer Only");
				}
			}
		});
		btnNewButton.setBounds(136, 179, 158, 42);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid Entry Plz Enter integer Only");
				}
			}
		});
		btnNewButton_1.setBounds(393, 179, 146, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(347, 255, 256, 48);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabelAns = new JLabel("The Answer is....");
		lblNewLabelAns.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabelAns.setBounds(110, 263, 158, 32);
		frame.getContentPane().add(lblNewLabelAns);
	}
}
