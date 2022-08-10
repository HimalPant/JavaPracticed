package com.test.swingdemo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.test.swingdemo.model.Employee;
import com.test.swingdemo.service.EmployeServiceImpl;
import com.test.swingdemo.service.EmployeeService;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;

public class Editform extends JFrame {

	private JPanel contentPane;
	private JTextField Last;
	private JLabel lblNewLabel;
	private JLabel lblLastName;
	private JTextField First;
	private JLabel label;
	private JRadioButton radioFemale;
	private JRadioButton radioMale;
	private JLabel lblPhoneNumber;
	private JTextField Phone;
	private JLabel lblEmail;
	private JTextField Email;
	private JLabel lblCompany;
	private JLabel lblPost;
	private JLabel lblCity;
	private JLabel lblCountry;
	private JLabel lblSalary;
	private JLabel lblDateOfBirth;
	private JLabel lblState;
	private JLabel lblJoinedDate;
	private JTextField Company;
	private JComboBox Postcomb;
	private JComboBox Citycomb;
	private JComboBox Countrycomb;
	private JTextField Salary;
	private JComboBox Statecomb;
	private JDateChooser Dob;
	private JDateChooser JoinedDate;
	private JButton btnNewButton;
	private JLabel lblEmployeeRegistrationForm;
	private JButton btnCancel;
	int eid = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editform frame = new Editform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Editform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLast());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblLastName());
		contentPane.add(getFirst());
		contentPane.add(getLabel());
		contentPane.add(getRadioFemale());
		contentPane.add(getRadioMale());
		contentPane.add(getLblPhoneNumber());
		contentPane.add(getPhone());
		contentPane.add(getLblEmail());
		contentPane.add(getEmail());
		contentPane.add(getLblCompany());
		contentPane.add(getLblPost());
		contentPane.add(getLblCity());
		contentPane.add(getLblCountry());
		contentPane.add(getLblSalary());
		contentPane.add(getLblDateOfBirth());
		contentPane.add(getLblState());
		contentPane.add(getLblJoinedDate());
		contentPane.add(getCompany());
		contentPane.add(getPostcomb());
		contentPane.add(getCitycomb());
		contentPane.add(getCountrycomb());
		contentPane.add(getSalary());
		contentPane.add(getStatecomb());
		contentPane.add(getDob());
		contentPane.add(getJoinedDate());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblEmployeeRegistrationForm());
		contentPane.add(getBtnCancel());

	}

	private JTextField getLast() {
		if (Last == null) {
			Last = new JTextField();
			Last.setBounds(491, 102, 188, 31);
			Last.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Last.setColumns(10);
		}
		return Last;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setBounds(365, 61, 120, 25);
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblNewLabel;
	}

	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Gender");
			lblLastName.setBounds(368, 160, 120, 25);
			lblLastName.setForeground(Color.BLUE);
			lblLastName.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblLastName;
	}

	private JTextField getFirst() {
		if (First == null) {
			First = new JTextField();
			First.setBounds(489, 57, 190, 31);
			First.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			First.setColumns(10);
		}
		return First;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Last Name");
			label.setBounds(367, 112, 120, 25);
			label.setForeground(Color.BLUE);
			label.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return label;
	}

	private JRadioButton getRadioFemale() {
		if (radioFemale == null) {
			radioFemale = new JRadioButton("Female");
			radioFemale.setBounds(582, 161, 97, 23);
			radioFemale.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			radioFemale.setForeground(Color.BLUE);
		}
		return radioFemale;
	}

	private JRadioButton getRadioMale() {
		if (radioMale == null) {
			radioMale = new JRadioButton("Male");
			radioMale.setBounds(491, 160, 75, 23);
			radioMale.setForeground(Color.BLUE);
			radioMale.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return radioMale;
	}

	private JLabel getLblPhoneNumber() {
		if (lblPhoneNumber == null) {
			lblPhoneNumber = new JLabel("Phone Number");
			lblPhoneNumber.setBounds(365, 196, 120, 25);
			lblPhoneNumber.setForeground(Color.BLUE);
			lblPhoneNumber.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblPhoneNumber;
	}

	private JTextField getPhone() {
		if (Phone == null) {
			Phone = new JTextField();
			Phone.setBounds(491, 196, 188, 31);
			Phone.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Phone.setColumns(10);
		}
		return Phone;
	}

	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(365, 238, 120, 25);
			lblEmail.setForeground(Color.BLUE);
			lblEmail.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblEmail;
	}

	private JTextField getEmail() {
		if (Email == null) {
			Email = new JTextField();
			Email.setBounds(491, 239, 188, 31);
			Email.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Email.setColumns(10);
		}
		return Email;
	}

	private JLabel getLblCompany() {
		if (lblCompany == null) {
			lblCompany = new JLabel("Company");
			lblCompany.setBounds(365, 290, 120, 25);
			lblCompany.setForeground(Color.BLUE);
			lblCompany.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblCompany;
	}

	private JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("Post");
			lblPost.setBounds(365, 339, 120, 25);
			lblPost.setForeground(Color.BLUE);
			lblPost.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblPost;
	}

	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setBounds(365, 381, 120, 25);
			lblCity.setForeground(Color.BLUE);
			lblCity.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblCity;
	}

	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(365, 436, 120, 25);
			lblCountry.setForeground(Color.BLUE);
			lblCountry.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblCountry;
	}

	private JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setBounds(365, 480, 120, 25);
			lblSalary.setForeground(Color.BLUE);
			lblSalary.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblSalary;
	}

	private JLabel getLblDateOfBirth() {
		if (lblDateOfBirth == null) {
			lblDateOfBirth = new JLabel("Date Of Birth");
			lblDateOfBirth.setBounds(365, 588, 120, 25);
			lblDateOfBirth.setForeground(Color.BLUE);
			lblDateOfBirth.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblDateOfBirth;
	}

	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setBounds(365, 528, 120, 25);
			lblState.setForeground(Color.BLUE);
			lblState.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblState;
	}

	private JLabel getLblJoinedDate() {
		if (lblJoinedDate == null) {
			lblJoinedDate = new JLabel("Joined Date");
			lblJoinedDate.setBounds(365, 646, 120, 25);
			lblJoinedDate.setForeground(Color.BLUE);
			lblJoinedDate.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblJoinedDate;
	}

	private JTextField getCompany() {
		if (Company == null) {
			Company = new JTextField();
			Company.setBounds(491, 291, 188, 31);
			Company.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Company.setColumns(10);
		}
		return Company;
	}

	private JComboBox getPostcomb() {
		if (Postcomb == null) {
			Postcomb = new JComboBox();
			Postcomb.setBackground(Color.WHITE);
			Postcomb.setEditable(true);
			Postcomb.setForeground(Color.BLUE);
			Postcomb.setModel(new DefaultComboBoxModel(
					new String[] { "Select your Post", "Manager ", "Casier", "Clerk", "Security", "Accountant" }));
			Postcomb.setBounds(491, 339, 188, 31);
			Postcomb.setToolTipText(
					"                                                                  Select the Post");
			Postcomb.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return Postcomb;
	}

	private JComboBox getCitycomb() {
		if (Citycomb == null) {
			Citycomb = new JComboBox();
			Citycomb.setModel(new DefaultComboBoxModel(
					new String[] { "Select City", "Kathmandu ", "Delhi", "Beijing", "Thimpu", "Colambu", "Dhaka" }));
			Citycomb.setToolTipText(
					"                                                                  Select the Post");
			Citycomb.setForeground(Color.BLUE);
			Citycomb.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			Citycomb.setEditable(true);
			Citycomb.setBackground(Color.WHITE);
			Citycomb.setBounds(491, 381, 188, 31);
		}
		return Citycomb;
	}

	private JComboBox getCountrycomb() {
		if (Countrycomb == null) {
			Countrycomb = new JComboBox();
			Countrycomb.setModel(new DefaultComboBoxModel(
					new String[] { "Select Country", "Nepal", "India", "China", "Bhutan", "Srilanka", "Bangladesh" }));
			Countrycomb.setToolTipText(
					"                                                                  Select the Post");
			Countrycomb.setForeground(Color.BLUE);
			Countrycomb.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			Countrycomb.setEditable(true);
			Countrycomb.setBackground(Color.WHITE);
			Countrycomb.setBounds(491, 423, 188, 31);
		}
		return Countrycomb;
	}

	private JTextField getSalary() {
		if (Salary == null) {
			Salary = new JTextField();
			Salary.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Salary.setColumns(10);
			Salary.setBounds(491, 473, 188, 31);
		}
		return Salary;
	}

	private JComboBox getStatecomb() {
		if (Statecomb == null) {
			Statecomb = new JComboBox();
			Statecomb.setModel(new DefaultComboBoxModel(
					new String[] { "Select State", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
			Statecomb.setToolTipText(
					"                                                                  Select the Post");
			Statecomb.setForeground(Color.BLUE);
			Statecomb.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			Statecomb.setEditable(true);
			Statecomb.setBackground(Color.WHITE);
			Statecomb.setBounds(491, 525, 188, 31);
		}
		return Statecomb;
	}

	private JDateChooser getDob() {
		if (Dob == null) {
			Dob = new JDateChooser();
			Dob.setBounds(491, 582, 188, 31);
		}
		return Dob;
	}

	private JDateChooser getJoinedDate() {
		if (JoinedDate == null) {
			JoinedDate = new JDateChooser();
			JoinedDate.setBounds(491, 640, 188, 31);
		}
		return JoinedDate;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Employee emp = new Employee();
					emp.setId(eid);
					emp.setFname(First.getText());
					emp.setLname(Last.getText());
					emp.setPhone(Phone.getText());
					emp.setEmail(Email.getText());
					emp.setCompany(Company.getText());
					emp.setCity(Citycomb.getSelectedItem().toString());
					emp.setCountry(Countrycomb.getSelectedItem().toString());
					emp.setSalary(Integer.parseInt(Salary.getText()));
					emp.setPost(Postcomb.getSelectedItem().toString());
					emp.setState(Statecomb.getSelectedItem().toString());
					emp.setDob(new Date(Dob.getDate().getTime()));
					emp.setJoindate(new Date(JoinedDate.getDate().getTime()));

					if (radioMale.isSelected()) {
						emp.setGender("Male");
					} else {
						emp.setGender("Female");
					}

					EmployeeService ep = new EmployeServiceImpl();
					if (ep.updateEmp(emp)) {
						JOptionPane.showMessageDialog(null, "Updated Successfully");
						new EmployeeForm().setVisible(true);
						dispose();

					} else {
						JOptionPane.showMessageDialog(null, "Update Failed ");
					}

				}
			});
			btnNewButton.setBackground(Color.GREEN);
			btnNewButton.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnNewButton.setBounds(1002, 315, 109, 31);
		}
		return btnNewButton;
	}

	private JLabel getLblEmployeeRegistrationForm() {
		if (lblEmployeeRegistrationForm == null) {
			lblEmployeeRegistrationForm = new JLabel("Employee Registration Form");
			lblEmployeeRegistrationForm.setForeground(SystemColor.controlText);
			lblEmployeeRegistrationForm.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 26));
			lblEmployeeRegistrationForm.setBounds(543, 0, 389, 25);
		}
		return lblEmployeeRegistrationForm;
	}

	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new EmployeeForm().setVisible(true);

				}
			});
			btnCancel.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnCancel.setBackground(Color.GREEN);
			btnCancel.setBounds(1002, 585, 109, 31);
		}
		return btnCancel;
	}

	public void setData(int id) {
		eid = id;
		EmployeeService es = new EmployeServiceImpl();
		Employee e = es.getById(id);
		First.setText(e.getFname());
		Last.setText(e.getLname());
		Phone.setText(e.getPhone());
		Email.setText(e.getEmail());
		Company.setText(e.getCompany());
		Postcomb.setSelectedItem(e.getPost());
		Citycomb.setSelectedItem(e.getCity());
		Countrycomb.setSelectedItem(e.getCountry());
		Statecomb.setSelectedItem(e.getState());
		Salary.setText(String.valueOf(e.getSalary()));
		Dob.setDate(e.getDob());
		JoinedDate.setDate(e.getJoindate());

		if (e.getGender().equalsIgnoreCase("Male")) {
			radioMale.setSelected(true);

		} else {
			radioFemale.setSelected(true);
		}

	}
}
