package CNIT255Lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInputForm {

	private JFrame frame;
	private JTextField textField_FirstName;
	private JTextField textField_LastName;
	private JTextField textField_MInitial;
	private JTextField textField_age;
	private JTextField textField_birthDate_day;
	private JTextField textField_PUID;
	private JTextField textField_Address1;
	private JTextField textField_Address2;
	private JTextField textField_City;
	private JTextField textField_ZipCode;
	private JTextField textField_thesis;
	private JTextField textField_advisor_LastName;

	private JTextField textField_advisor_FirstName;
	private JTextField textField_birthDate_month;
	private JTextField textField_birthDate_year;
	private JTextField textField_gradDate_day;
	private JTextField textField_gradDate_month;
	private JTextField textField_gradDate_year;
	
	Person p;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInputForm window = new StudentInputForm();
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
	public StudentInputForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 606, 715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_FirstName = new JTextField();
		textField_FirstName.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_FirstName.setBounds(151, 96, 147, 30);
		frame.getContentPane().add(textField_FirstName);
		textField_FirstName.setColumns(10);
		
		textField_LastName = new JTextField();
		textField_LastName.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_LastName.setColumns(10);
		textField_LastName.setBounds(151, 138, 147, 30);
		frame.getContentPane().add(textField_LastName);
		
		textField_MInitial = new JTextField();
		textField_MInitial.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_MInitial.setColumns(10);
		textField_MInitial.setBounds(420, 95, 156, 30);
		frame.getContentPane().add(textField_MInitial);
		
		JRadioButton rdbtnGradStudent = new JRadioButton("Is Grad Student?");
		rdbtnGradStudent.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		rdbtnGradStudent.setBounds(306, 143, 270, 25);
		frame.getContentPane().add(rdbtnGradStudent);
		
		String[] major = {"CIT", "Physics", "Math", "Plant Science", "7 Year Plan", "Creative Writing"};
		JComboBox comboBox_major = new JComboBox(major);
		comboBox_major.setBounds(151, 181, 147, 30);
		frame.getContentPane().add(comboBox_major);
		
		String[] favClass = {"CNIT 25501", "CNIT 15501", "Postcolonial Literature",
				"Presidency of Kanye West", "Jazz Flute", "Intro to AnCapitalism"};
		JComboBox comboBox_favClass = new JComboBox(favClass);
		comboBox_favClass.setBounds(420, 181, 156, 30);
		frame.getContentPane().add(comboBox_favClass);
		
		textField_age = new JTextField();
		textField_age.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_age.setColumns(10);
		textField_age.setBounds(420, 224, 147, 30);
		frame.getContentPane().add(textField_age);
		textField_age.setEditable(false);
		
		textField_birthDate_day = new JTextField();
		textField_birthDate_day.setColumns(10);
		textField_birthDate_day.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_birthDate_day.setBounds(151, 224, 45, 30);
		frame.getContentPane().add(textField_birthDate_day);
		
		textField_PUID = new JTextField();
		textField_PUID.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_PUID.setColumns(10);
		textField_PUID.setBounds(151, 267, 147, 30);
		frame.getContentPane().add(textField_PUID);
		
		textField_Address1 = new JTextField();
		textField_Address1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_Address1.setColumns(10);
		textField_Address1.setBounds(151, 310, 425, 30);
		frame.getContentPane().add(textField_Address1);
		
		textField_Address2 = new JTextField();
		textField_Address2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_Address2.setColumns(10);
		textField_Address2.setBounds(151, 353, 425, 30);
		frame.getContentPane().add(textField_Address2);
		
		JRadioButton rdbtnAttendedHogwarts = new JRadioButton("Attended Hogwarts?");
		rdbtnAttendedHogwarts.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		rdbtnAttendedHogwarts.setBounds(304, 272, 271, 25);
		frame.getContentPane().add(rdbtnAttendedHogwarts);
		
		textField_City = new JTextField();
		textField_City.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_City.setColumns(10);
		textField_City.setBounds(151, 396, 147, 30);
		frame.getContentPane().add(textField_City);
		
		textField_ZipCode = new JTextField();
		textField_ZipCode.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_ZipCode.setColumns(10);
		textField_ZipCode.setBounds(151, 438, 147, 30);
		frame.getContentPane().add(textField_ZipCode);
		
		textField_thesis = new JTextField();
		textField_thesis.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_thesis.setColumns(10);
		textField_thesis.setBounds(151, 481, 147, 30);
		frame.getContentPane().add(textField_thesis);
		
		textField_advisor_LastName = new JTextField();
		textField_advisor_LastName.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_advisor_LastName.setColumns(10);
		textField_advisor_LastName.setBounds(377, 524, 199, 30);
		frame.getContentPane().add(textField_advisor_LastName);
		
		String[] States = {"AK - Alaska", "AL - Alabama", "AR - Arkansas", "AZ - Arizona", "CA - California",
				"CO - Colorado","CT - Connecticut", "DE - Delaware", "FL - Florida", "GA - Georgia", 
                "HI - Hawaii", "IA - Iowa", "ID - Idaho", "IL - Illinois", "IN - Indiana", "KS - Kansas", 
                "KY - Kentucky", "LA - Louisiana", "MA - Massachusetts", "MD - Maryland", "ME - Maine", 
                "MI - Michigan", "MN - Minnesota", "MO - Missouri", "MS - Mississippi", "MT - Montana", 
                "NC - North Carolina", "ND - North Dakota", "NE - Nebraska", "NH - New Hampshire", 
                "NJ - New Jersey", "NM - New Mexico", "NV - Nevada", "NY - New York", "OH - Ohio", 
                "OK - Oklahoma", "OR - Oregon", "PA - Pennsylvania", "PR - Puerto Rico", "RI - Rhode Island", 
                "SC - South Carolina", "SD - South Dakota", "TN - Tennessee", "TX - Texas", "UT - Utah", 
                "VA - Virginia", "VT - Vermont", "WA - Washington", "WI - Wisconsin", "WV - West Virginia", 
                "WY - Wyoming"};
		JComboBox comboBox_States = new JComboBox(States);
		comboBox_States.setBounds(420, 396, 156, 30);
		frame.getContentPane().add(comboBox_States);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_FirstName.setText("");
				textField_LastName.setText("");
				textField_MInitial.setText("");
				
				textField_birthDate_year.setText("");
				textField_birthDate_month.setText("");
				textField_birthDate_day.setText("");
				
				textField_gradDate_year.setText("");
				textField_gradDate_month.setText("");
				textField_gradDate_day.setText("");
				
				textField_PUID.setText("");
				textField_Address1.setText("");
				textField_Address2.setText("");
				textField_City.setText("");
				textField_ZipCode.setText("");	
				
				textField_age.setText("");
				
				textField_thesis.setText("");
				textField_advisor_FirstName.setText("");
				textField_advisor_LastName.setText("");
				
				rdbtnGradStudent.setSelected(false);
				rdbtnAttendedHogwarts.setSelected(false);
				
				comboBox_States.setSelectedIndex(0);
				comboBox_favClass.setSelectedIndex(0);
				comboBox_major.setSelectedIndex(0);
			}
		});
		btnClear.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnClear.setBounds(12, 586, 134, 69);
		frame.getContentPane().add(btnClear);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (!rdbtnGradStudent.isSelected()) {
					p = new Student();
					
					try {
					
					p.PersonName.setFirstName(textField_FirstName.getText());
					p.PersonName.setLastName(textField_LastName.getText());
					p.PersonName.setMiddleInitial(textField_MInitial.getText());
					
					p.PersonAddress.setstreetAddress1(textField_Address1.getText());
					p.PersonAddress.setstreetAddress2(textField_Address2.getText());
					p.PersonAddress.setcity(textField_City.getText());
					p.PersonAddress.setstate(comboBox_States.getSelectedItem().toString());
					p.PersonAddress.setzipCode(textField_ZipCode.getText());
					
					p.birthDate.setyear(Integer.parseInt(textField_birthDate_year.getText()));
					p.birthDate.setmonth(Integer.parseInt(textField_birthDate_month.getText()));
					p.birthDate.setday(Integer.parseInt(textField_birthDate_day.getText()));
					
					((Student)p).setPUID(textField_PUID.getText());
					((Student)p).setmajor(comboBox_major.getSelectedItem().toString());
					((Student)p).setfavclass(comboBox_favClass.getSelectedItem().toString());
					
					if (!rdbtnAttendedHogwarts.isSelected()) {
						((Student)p).setHogwarts(false);
					}else {
						((Student)p).setHogwarts(true);
					}
					
					((Student)p).gradDate.setyear(Integer.parseInt(textField_gradDate_year.getText()));
					((Student)p).gradDate.setmonth(Integer.parseInt(textField_gradDate_month.getText()));
					((Student)p).gradDate.setday(Integer.parseInt(textField_gradDate_day.getText()));
					
					}catch(Exception e){
						
					}
				}else {
					try {
					p = new GradStudent();
					
					p.PersonName.setFirstName(textField_FirstName.getText());
					p.PersonName.setLastName(textField_LastName.getText());
					p.PersonName.setMiddleInitial(textField_MInitial.getText());
					
					p.PersonAddress.setstreetAddress1(textField_Address1.getText());
					p.PersonAddress.setstreetAddress2(textField_Address2.getText());
					p.PersonAddress.setcity(textField_City.getText());
					p.PersonAddress.setstate(comboBox_States.getSelectedItem().toString());
					p.PersonAddress.setzipCode(textField_ZipCode.getText());
					
					p.birthDate.setyear(Integer.parseInt(textField_birthDate_year.getText()));
					p.birthDate.setmonth(Integer.parseInt(textField_birthDate_month.getText()));
					p.birthDate.setday(Integer.parseInt(textField_birthDate_day.getText()));
					
					((GradStudent)p).setPUID(textField_PUID.getText());
					((GradStudent)p).setmajor(comboBox_major.getSelectedItem().toString());
					((GradStudent)p).setfavclass(comboBox_favClass.getSelectedItem().toString());
					
					if (!rdbtnAttendedHogwarts.isSelected()) {
						((GradStudent)p).setHogwarts(false);
					}else {
						((GradStudent)p).setHogwarts(true);
					}
					
					((GradStudent)p).gradDate.setyear(Integer.parseInt(textField_gradDate_year.getText()));
					((GradStudent)p).gradDate.setmonth(Integer.parseInt(textField_gradDate_month.getText()));
					((GradStudent)p).gradDate.setday(Integer.parseInt(textField_gradDate_day.getText()));
					
					((GradStudent)p).setthesis(textField_thesis.getText());
					((GradStudent)p).advisor.setFirstName(textField_advisor_FirstName.getText());
					((GradStudent)p).advisor.setLastName(textField_advisor_LastName.getText());
					}catch (Exception e) {
					
				}
					
				}
			}
		}
		);
		btnSave.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnSave.setBounds(231, 586, 134, 69);
		frame.getContentPane().add(btnSave);
		
		JButton btnRetore = new JButton("Restore");
		btnRetore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				textField_FirstName.setText(p.PersonName.getFirstName());
				textField_LastName.setText(p.PersonName.getLastName());
				textField_MInitial.setText(p.PersonName.getMiddleInitial());
				
				textField_gradDate_year.setText(Integer.toString(((Student)p).gradDate.getyear()));
				textField_gradDate_month.setText(Integer.toString(((Student)p).gradDate.getmonth()));
				textField_gradDate_day.setText(Integer.toString(((Student)p).gradDate.getday()));
				
				textField_birthDate_year.setText(Integer.toString(p.birthDate.getyear()));
				textField_birthDate_month.setText(Integer.toString(p.birthDate.getmonth()));
				textField_birthDate_day.setText(Integer.toString(p.birthDate.getday()));
				textField_PUID.setText(((Student)p).getPUID());
				textField_Address1.setText(p.PersonAddress.getstreetAddress1());
				textField_Address2.setText(p.PersonAddress.getstreetAddress2());
				textField_City.setText(p.PersonAddress.getcity());
				textField_ZipCode.setText(p.PersonAddress.getzipCode());
				
				textField_age.setText(Integer.toString(p.calculateage(p.birthDate.year,p.birthDate.month, p.birthDate.day)));
				
				comboBox_States.setSelectedItem(p.PersonAddress.getstate());
				comboBox_major.setSelectedItem(((Student)p).getmajor());
				comboBox_major.setSelectedItem(((Student)p).getfavclass());
				textField_thesis.setText(((GradStudent)p).getthesis());
				textField_advisor_FirstName.setText(((GradStudent)p).advisor.getFirstName());
				textField_advisor_LastName.setText(((GradStudent)p).advisor.getLastName());
				
				if(((Student)p).getHogwarts() == true) {
					rdbtnAttendedHogwarts.setSelected(true);
				}else {
					rdbtnAttendedHogwarts.setSelected(false);
				}
				
				}catch(Exception f) {
				
				}
			}
		});
		btnRetore.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnRetore.setBounds(442, 586, 134, 69);
		frame.getContentPane().add(btnRetore);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblFirstName.setBounds(12, 96, 127, 30);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblLastName.setBounds(12, 138, 127, 30);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblMajor = new JLabel("Major");
		lblMajor.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblMajor.setBounds(12, 181, 127, 30);
		frame.getContentPane().add(lblMajor);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblAge.setBounds(306, 224, 111, 30);
		frame.getContentPane().add(lblAge);
		
		JLabel lblPUID = new JLabel("PUID");
		lblPUID.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblPUID.setBounds(12, 267, 127, 30);
		frame.getContentPane().add(lblPUID);
		
		JLabel lblAddress = new JLabel("Address 1");
		lblAddress.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblAddress.setBounds(12, 310, 127, 30);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblAddress_1 = new JLabel("Address 2");
		lblAddress_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblAddress_1.setBounds(12, 353, 127, 30);
		frame.getContentPane().add(lblAddress_1);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblCity.setBounds(12, 396, 127, 30);
		frame.getContentPane().add(lblCity);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblZipCode.setBounds(12, 438, 127, 30);
		frame.getContentPane().add(lblZipCode);
		
		JLabel lblThesisName = new JLabel("Thesis");
		lblThesisName.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblThesisName.setBounds(12, 481, 127, 30);
		frame.getContentPane().add(lblThesisName);
		
		JLabel lblAdvisor = new JLabel("Advisor");
		lblAdvisor.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblAdvisor.setBounds(12, 524, 127, 30);
		frame.getContentPane().add(lblAdvisor);
		
		JLabel lblMiddleInitial = new JLabel("Middle Initial");
		lblMiddleInitial.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblMiddleInitial.setBounds(310, 96, 107, 30);
		frame.getContentPane().add(lblMiddleInitial);
		
		JLabel lblBirthDate = new JLabel("Birth Date");
		lblBirthDate.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblBirthDate.setBounds(12, 224, 127, 30);
		frame.getContentPane().add(lblBirthDate);
		
		JLabel lblFavouriteClass = new JLabel("Fav Class");
		lblFavouriteClass.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblFavouriteClass.setBounds(306, 179, 111, 30);
		frame.getContentPane().add(lblFavouriteClass);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblState.setBounds(304, 396, 113, 30);
		frame.getContentPane().add(lblState);
		
		JLabel lblTitle = new JLabel("Not Purdue University");
		lblTitle.setFont(new Font("Trebuchet MS", Font.PLAIN, 34));
		lblTitle.setBounds(0, 13, 588, 70);
		frame.getContentPane().add(lblTitle);
		lblTitle.setHorizontalAlignment(JTextField.CENTER);
		
		textField_advisor_FirstName = new JTextField();
		textField_advisor_FirstName.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_advisor_FirstName.setColumns(10);
		textField_advisor_FirstName.setBounds(151, 524, 214, 30);
		frame.getContentPane().add(textField_advisor_FirstName);
		
		textField_birthDate_month = new JTextField();
		textField_birthDate_month.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_birthDate_month.setColumns(10);
		textField_birthDate_month.setBounds(202, 224, 45, 30);
		frame.getContentPane().add(textField_birthDate_month);
		
		textField_birthDate_year = new JTextField();
		textField_birthDate_year.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_birthDate_year.setColumns(10);
		textField_birthDate_year.setBounds(253, 224, 45, 30);
		frame.getContentPane().add(textField_birthDate_year);
		
		textField_gradDate_day = new JTextField();
		textField_gradDate_day.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_gradDate_day.setColumns(10);
		textField_gradDate_day.setBounds(420, 438, 45, 30);
		frame.getContentPane().add(textField_gradDate_day);
		
		textField_gradDate_month = new JTextField();
		textField_gradDate_month.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_gradDate_month.setColumns(10);
		textField_gradDate_month.setBounds(477, 438, 45, 30);
		frame.getContentPane().add(textField_gradDate_month);
		
		textField_gradDate_year = new JTextField();
		textField_gradDate_year.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField_gradDate_year.setColumns(10);
		textField_gradDate_year.setBounds(531, 438, 45, 30);
		frame.getContentPane().add(textField_gradDate_year);
		
		JLabel lblGradDate = new JLabel("Grad Date");
		lblGradDate.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblGradDate.setBounds(306, 441, 108, 25);
		frame.getContentPane().add(lblGradDate);
	}
}
