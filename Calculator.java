import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.SystemColor;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double firstnumber;
	double secondnumber;
	double answer;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}
	
	private void checkdecimal (String numbers){
		
		//check decimal point
		String check = numbers.substring(numbers.length() - 2);
		if (check.equals(".0")) {
			
			String numbers2 = numbers.substring(0, numbers.length() - 2);
			textField.setText(numbers2);
		}else {
			
			textField.setText(numbers);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmCalculator.setBackground(new Color(153, 180, 209));
		frmCalculator.setBounds(100, 100, 623, 720);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 43));
		textField.setBounds(38, 57, 424, 97);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("0");
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		
		//Menu Bar
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 658, 26);
		frmCalculator.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExitApplication = new JMenuItem("Exit Application");
		mntmExitApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExitApplication);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAboutTheSoftware = new JMenuItem("About the Software");
		mntmAboutTheSoftware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frmCalculator,"Written by Oscar Wong\nCopyleft 2019\nOC DONUT STEEL");
			}
		});
		mnHelp.add(mntmAboutTheSoftware);
		
		//Numbers
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String numbers = textField.getText();
				
				if (numbers.contentEquals("0")) {
					textField.setText("1");
				}else {
				textField.setText(numbers + "1");
				}
			}
		});
		button_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_1.setBounds(38, 167, 97, 97);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				
				if (numbers.contentEquals("0")) {
					textField.setText("2");
				}else {
				textField.setText(numbers + "2");
				}
			}
		});
		button_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_2.setBounds(147, 167, 97, 97);
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				
				if (numbers.contentEquals("0")) {
					textField.setText("3");
				}else {
				textField.setText(numbers + "3");
				}
			}
		});
		button_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_3.setBounds(256, 167, 97, 97);
		frmCalculator.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				
				if (numbers.contentEquals("0")) {
					textField.setText("4");
				}else {
				textField.setText(numbers + "4");
				}
			}
		});
		button_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_4.setBounds(38, 277, 97, 97);
		frmCalculator.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				if (numbers.contentEquals("0")) {
					textField.setText("5");
				}else {
				textField.setText(numbers + "5");
				}
			}
		});
		button_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_5.setBounds(147, 277, 97, 97);
		frmCalculator.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				
				if (numbers.contentEquals("0")) {
					textField.setText("6");
				}else {
				textField.setText(numbers + "6");
				}
			}
		});
		button_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_6.setBounds(256, 277, 97, 97);
		frmCalculator.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				
				if (numbers.contentEquals("0")) {
					textField.setText("7");
				}else {
				textField.setText(numbers + "7");
				}
			}
		});
		button_7.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_7.setBounds(38, 387, 97, 97);
		frmCalculator.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				
				if (numbers.contentEquals("0")) {
					textField.setText("8");
				}else {
				textField.setText(numbers + "8");
				}
			}
		});
		button_8.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_8.setBounds(147, 387, 97, 97);
		frmCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				
				if (numbers.contentEquals("0")) {
					textField.setText("9");
				}else {
				textField.setText(numbers + "9");
				}
			}
		});
		button_9.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_9.setBounds(256, 386, 97, 97);
		frmCalculator.getContentPane().add(button_9);
		
		JButton button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				if (!numbers.contentEquals("0")) {
				textField.setText(numbers + ".");
				}
			}
		});
		button_dot.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_dot.setBounds(38, 496, 97, 97);
		frmCalculator.getContentPane().add(button_dot);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				textField.setText(numbers + "0");
			}
		});
		button_0.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_0.setBounds(147, 496, 97, 97);
		frmCalculator.getContentPane().add(button_0);
		
		JButton button_flip = new JButton("±");
		button_flip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numbers = textField.getText();
				double number = Double.parseDouble(numbers);
				number = number*-1;
				numbers = Double.toString(number);	
				checkdecimal(numbers);
			}
		});
		button_flip.setFont(new Font("Trebuchet MS", Font.PLAIN, 62));
		button_flip.setBounds(256, 496, 97, 97);
		frmCalculator.getContentPane().add(button_flip);
		
		//Operators
		
		//Plus
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String numbers = textField.getText();
	
				firstnumber = Double.parseDouble(numbers);
				textField.setText("0");
				operation = 1;
				
				
			}
		});
		button_plus.setFont(new Font("Trebuchet MS", Font.PLAIN, 60));
		button_plus.setBounds(365, 167, 97, 97);
		frmCalculator.getContentPane().add(button_plus);
		
		//Minus
		JButton button_sub = new JButton("-");
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				firstnumber = Double.parseDouble(numbers);
				textField.setText("0");
				operation = 2;
				
			}
		});
		button_sub.setFont(new Font("Trebuchet MS", Font.PLAIN, 60));
		button_sub.setBounds(474, 167, 97, 97);
		frmCalculator.getContentPane().add(button_sub);
		
		//Multiply 
		JButton button_mult = new JButton("*");
		button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				firstnumber = Double.parseDouble(numbers);
				textField.setText("0");
				operation = 3;
				
			}
		});
		button_mult.setFont(new Font("Trebuchet MS", Font.PLAIN, 60));
		button_mult.setBounds(365, 277, 97, 97);
		frmCalculator.getContentPane().add(button_mult);
		
		//Divide
		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				firstnumber = Double.parseDouble(numbers);
				textField.setText("0");
				operation = 4;
				
			}
		});
		button_div.setFont(new Font("Trebuchet MS", Font.PLAIN, 60));
		button_div.setBounds(475, 277, 97, 97);
		frmCalculator.getContentPane().add(button_div);
		
		//Modulus
		JButton button_mod = new JButton("%");
		button_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numbers = textField.getText();
				firstnumber = Double.parseDouble(numbers);
				textField.setText("0");
				operation = 5;
				
			}
		});
		button_mod.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_mod.setBounds(365, 387, 97, 97);
		frmCalculator.getContentPane().add(button_mod);
		
		//Square Root
				JButton btnSqrt = new JButton("sqrt");
				btnSqrt.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String numbers = textField.getText();
						firstnumber = Double.parseDouble(numbers);
						answer = Math.sqrt(firstnumber);
						numbers = Double.toString(answer);
						checkdecimal(numbers);
					}
				});
				btnSqrt.setFont(new Font("Trebuchet MS", Font.PLAIN, 35));
				btnSqrt.setBounds(475, 387, 97, 97);
				frmCalculator.getContentPane().add(btnSqrt);
		
		//Equals
		JButton button_equ = new JButton("=");
		button_equ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numbers = textField.getText();
				secondnumber = Double.parseDouble(numbers);
				
				switch(operation) {
				case 1:
					answer = firstnumber + secondnumber;
					break;
					
				case 2:
					answer = firstnumber - secondnumber;
					break;
				
				case 3:
					answer = firstnumber * secondnumber;
					break;
				
				case 4:
					answer = firstnumber / secondnumber;
					break;
					
				case 5:
					answer = firstnumber % secondnumber;
					break;
				}
				
				numbers = Double.toString(answer);
				checkdecimal(numbers);
				
				firstnumber = 0.0;
				secondnumber = 0.0;
				
			}
		});
		button_equ.setFont(new Font("Trebuchet MS", Font.PLAIN, 99));
		button_equ.setBounds(474, 496, 98, 97);
		frmCalculator.getContentPane().add(button_equ);
		
		//Delete
		JButton button_del = new JButton("DEL");
		button_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numbers = textField.getText();
				String numbers2 = numbers.substring(0, numbers.length() - 1);
				
				//Return 0 for 1 character length String
				int length = numbers2.length();
				if(length == 0 || numbers2.equals("-")) {
				textField.setText("0");
				}else{
				textField.setText(numbers2);				
				}
		}
		});
		button_del.setFont(new Font("Trebuchet MS", Font.PLAIN, 37));
		button_del.setBounds(365, 496, 97, 97);
		frmCalculator.getContentPane().add(button_del);
		
		//Clear
		JButton button_clear = new JButton("AC");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				firstnumber = 0.0;
				secondnumber = 0.0;
			}
		});
		button_clear.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		button_clear.setBounds(474, 57, 97, 97);
		frmCalculator.getContentPane().add(button_clear);
	}
}
