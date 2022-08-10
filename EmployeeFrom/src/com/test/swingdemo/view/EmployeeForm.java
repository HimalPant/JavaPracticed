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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;

public class EmployeeForm extends JFrame {

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
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblSearch;
	private JTextField Search;
	private JButton btnNewButton;
	private JButton btnView;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnPrint;
	private JButton btnExit;
	private JLabel lblEmployeeRegistrationForm;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
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
	public EmployeeForm() {
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
		contentPane.add(getScrollPane());
		contentPane.add(getLblSearch());
		contentPane.add(getSearch());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnView());
		contentPane.add(getBtnEdit());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnPrint());
		contentPane.add(getBtnExit());
		contentPane.add(getLblEmployeeRegistrationForm());
		contentPane.add(getBtnClear());
		displayDataInTable();
	}

	private JTextField getLast() {
		if (Last == null) {
			Last = new JTextField();
			Last.setBounds(155, 77, 188, 31);
			Last.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Last.setColumns(10);
		}
		return Last;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setBounds(29, 36, 120, 25);
			lblNewLabel.setForeground(Color.BLUE);
			lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblNewLabel;
	}

	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Gender");
			lblLastName.setBounds(32, 135, 120, 25);
			lblLastName.setForeground(Color.BLUE);
			lblLastName.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblLastName;
	}

	private JTextField getFirst() {
		if (First == null) {
			First = new JTextField();
			First.setBounds(153, 32, 190, 31);
			First.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			First.setColumns(10);
		}
		return First;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Last Name");
			label.setBounds(31, 87, 120, 25);
			label.setForeground(Color.BLUE);
			label.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return label;
	}

	private JRadioButton getRadioFemale() {
		if (radioFemale == null) {
			radioFemale = new JRadioButton("Female");
			radioFemale.setBounds(246, 136, 97, 23);
			radioFemale.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			radioFemale.setForeground(Color.BLUE);
		}
		return radioFemale;
	}

	private JRadioButton getRadioMale() {
		if (radioMale == null) {
			radioMale = new JRadioButton("Male");
			radioMale.setBounds(155, 135, 75, 23);
			radioMale.setForeground(Color.BLUE);
			radioMale.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return radioMale;
	}

	private JLabel getLblPhoneNumber() {
		if (lblPhoneNumber == null) {
			lblPhoneNumber = new JLabel("Phone Number");
			lblPhoneNumber.setBounds(29, 171, 120, 25);
			lblPhoneNumber.setForeground(Color.BLUE);
			lblPhoneNumber.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblPhoneNumber;
	}

	private JTextField getPhone() {
		if (Phone == null) {
			Phone = new JTextField();
			Phone.setBounds(155, 171, 188, 31);
			Phone.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Phone.setColumns(10);
		}
		return Phone;
	}

	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(29, 213, 120, 25);
			lblEmail.setForeground(Color.BLUE);
			lblEmail.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblEmail;
	}

	private JTextField getEmail() {
		if (Email == null) {
			Email = new JTextField();
			Email.setBounds(155, 214, 188, 31);
			Email.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Email.setColumns(10);
		}
		return Email;
	}

	private JLabel getLblCompany() {
		if (lblCompany == null) {
			lblCompany = new JLabel("Company");
			lblCompany.setBounds(29, 265, 120, 25);
			lblCompany.setForeground(Color.BLUE);
			lblCompany.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblCompany;
	}

	private JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("Post");
			lblPost.setBounds(29, 314, 120, 25);
			lblPost.setForeground(Color.BLUE);
			lblPost.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblPost;
	}

	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setBounds(29, 356, 120, 25);
			lblCity.setForeground(Color.BLUE);
			lblCity.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblCity;
	}

	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(29, 411, 120, 25);
			lblCountry.setForeground(Color.BLUE);
			lblCountry.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblCountry;
	}

	private JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setBounds(29, 467, 120, 25);
			lblSalary.setForeground(Color.BLUE);
			lblSalary.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblSalary;
	}

	private JLabel getLblDateOfBirth() {
		if (lblDateOfBirth == null) {
			lblDateOfBirth = new JLabel("Date Of Birth");
			lblDateOfBirth.setBounds(29, 574, 120, 25);
			lblDateOfBirth.setForeground(Color.BLUE);
			lblDateOfBirth.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblDateOfBirth;
	}

	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setBounds(29, 514, 120, 25);
			lblState.setForeground(Color.BLUE);
			lblState.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblState;
	}

	private JLabel getLblJoinedDate() {
		if (lblJoinedDate == null) {
			lblJoinedDate = new JLabel("Joined Date");
			lblJoinedDate.setBounds(29, 632, 120, 25);
			lblJoinedDate.setForeground(Color.BLUE);
			lblJoinedDate.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		}
		return lblJoinedDate;
	}

	private JTextField getCompany() {
		if (Company == null) {
			Company = new JTextField();
			Company.setBounds(155, 266, 188, 31);
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
			Postcomb.setBounds(155, 314, 188, 31);
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
			Citycomb.setBounds(155, 356, 188, 31);
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
			Countrycomb.setBounds(155, 398, 188, 31);
		}
		return Countrycomb;
	}

	private JTextField getSalary() {
		if (Salary == null) {
			Salary = new JTextField();
			Salary.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Salary.setColumns(10);
			Salary.setBounds(155, 461, 188, 31);
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
			Statecomb.setBounds(155, 514, 188, 31);
		}
		return Statecomb;
	}

	private JDateChooser getDob() {
		if (Dob == null) {
			Dob = new JDateChooser();
			Dob.setBounds(155, 568, 188, 31);
		}
		return Dob;
	}

	private JDateChooser getJoinedDate() {
		if (JoinedDate == null) {
			JoinedDate = new JDateChooser();
			JoinedDate.setBounds(155, 624, 188, 31);
		}
		return JoinedDate;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(533, 157, 762, 442);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(new Object[][] {},
					new String[] { "ID", "Employee Name", "Company", "Phone" }));
		}
		return table;
	}

	private JLabel getLblSearch() {
		if (lblSearch == null) {
			lblSearch = new JLabel("Search");
			lblSearch.setForeground(Color.BLUE);
			lblSearch.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			lblSearch.setBounds(561, 101, 120, 25);
		}
		return lblSearch;
	}

	private JTextField getSearch() {
		if (Search == null) {
			Search = new JTextField();
			Search.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String input = Search.getText().toString();
					EmployeeService ser = new EmployeServiceImpl();
					List<Employee> elist = ser.search(input);
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);

					for (Employee emp : elist)

					{
						model.addRow(
								new Object[] { emp.getId(), emp.getFname() + emp.getLname(), emp.getCompany(), emp.getPhone() });
					}
				}
			});
			Search.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 16));
			Search.setColumns(10);
			Search.setBounds(649, 95, 646, 31);
		}
		return Search;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Save");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Employee emp = new Employee();
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
					if (ep.addEmp(emp)) {
						JOptionPane.showMessageDialog(null, "Added Successfully");
						displayDataInTable();
					} else {
						JOptionPane.showMessageDialog(null, "NOt Added ");
					}

				}
			});
			btnNewButton.setBackground(Color.GREEN);
			btnNewButton.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnNewButton.setBounds(533, 632, 89, 31);
		}
		return btnNewButton;
	}

	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("View");
			btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (table.getSelectedRow() < 0) {
						JOptionPane.showConfirmDialog(null, "Select Any Row From The Table");
						return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					ViewForm ef = new ViewForm();
					ef.setData(id);
					ef.setVisible(true);
					dispose();

				}
			});
			btnView.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnView.setBackground(Color.MAGENTA);
			btnView.setBounds(649, 629, 89, 31);
		}
		return btnView;
	}

	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("Edit");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (table.getSelectedRow() < 0) {
						JOptionPane.showConfirmDialog(null, "Select Any Row From The Table");
						return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					Editform ef = new Editform();
					ef.setData(id);
					ef.setVisible(true);
					dispose();
				}
			});
			btnEdit.setForeground(Color.WHITE);
			btnEdit.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnEdit.setBackground(Color.BLACK);
			btnEdit.setBounds(869, 629, 89, 31);
		}
		return btnEdit;
	}

	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (table.getSelectedRow() < 0) {
						JOptionPane.showConfirmDialog(null, "Select Any Row From The Table");
						return;
					}
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					EmployeeService es = new EmployeServiceImpl();
					if (es.deleteEmp(id)) {
						JOptionPane.showConfirmDialog(null, "Deleted Successfully");
						displayDataInTable();
					}
				}
			});
			btnDelete.setForeground(Color.BLACK);
			btnDelete.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnDelete.setBackground(Color.RED);
			btnDelete.setBounds(989, 629, 89, 31);
		}
		return btnDelete;
	}

	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton("Print");
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnPrint.setForeground(Color.WHITE);
			btnPrint.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnPrint.setBackground(Color.GRAY);
			btnPrint.setBounds(1099, 629, 89, 31);
		}
		return btnPrint;
	}

	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.setForeground(Color.BLACK);
			btnExit.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnExit.setBackground(Color.CYAN);
			btnExit.setBounds(1208, 629, 89, 31);
		}
		return btnExit;
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

	private void displayDataInTable() {

		EmployeeService es = new EmployeServiceImpl();
		List<Employee> elist = es.getAll();

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);

		for (Employee emp : elist)

		{
			model.addRow(
					new Object[] { emp.getId(), emp.getFname() + emp.getLname(), emp.getCompany(), emp.getPhone() });
		}
	}

	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					First.setText("");
					Last.setText("");
					Phone.setText("");
					Email.setText("");
					Company.setText("");
					Citycomb.setSelectedIndex(0);
					Countrycomb.setSelectedIndex(0);
					Postcomb.setSelectedIndex(0);
					Statecomb.setSelectedIndex(0);
					Salary.setText("");
					Dob.setCalendar(null);
					JoinedDate.setCalendar(null);
					radioMale.setSelected(false);
					radioFemale.setSelected(false);

				}
			});
			btnClear.setFont(new Font("Sitka Small", Font.PLAIN, 16));
			btnClear.setBackground(Color.MAGENTA);
			btnClear.setBounds(758, 632, 89, 31);
		}
		return btnClear;
	}
}
