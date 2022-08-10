package com.test.swingdemo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.test.swingdemo.db.db;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class SignUpForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JTextField Username;
	private JTextField Password;
	private JButton btnNewButton;
	private JLabel lblSignUpForm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm frame = new SignUpForm();
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
	public SignUpForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setForeground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblPassword());
		contentPane.add(getUsername());
		contentPane.add(getPassword());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblSignUpForm());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User Name");
			lblNewLabel.setFont(new Font("Kozuka Mincho Pr6N H", Font.PLAIN, 27));
			lblNewLabel.setBounds(137, 215, 200, 62);
		}
		return lblNewLabel;
	}

	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Kozuka Mincho Pr6N B", Font.PLAIN, 27));
			lblPassword.setBounds(152, 351, 172, 62);
		}
		return lblPassword;
	}

	private JTextField getUsername() {
		if (Username == null) {
			Username = new JTextField();
			Username.setBounds(367, 212, 353, 54);
			Username.setColumns(10);
		}
		return Username;
	}

	private JTextField getPassword() {
		if (Password == null) {
			Password = new JTextField();
			Password.setColumns(10);
			Password.setBounds(367, 341, 353, 54);
		}
		return Password;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Sign Up");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String psw = Password.getText();
					String un = Username.getText();

					String sql = "select * from user where username='" + un + "' and password='" + psw + "' ";
					try {
						Statement stm = db.getDbcon().createStatement();
						ResultSet rs = stm.executeQuery(sql);
						if (rs.next())

						{
							String password = rs.getString("password");
							if (psw.equals(password)) {
								dispose();
								EmployeeForm ep = new EmployeeForm();
								ep.setVisible(true);

							} else {
								JOptionPane.showMessageDialog(null, "invalid Password ", "Sign Up error",
										JOptionPane.ERROR_MESSAGE);
							}
						} else {
							JOptionPane.showMessageDialog(null, "invalid Username", "Sign Up error",
									JOptionPane.ERROR_MESSAGE);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton.setFont(new Font("Kozuka Mincho Pr6N B", Font.PLAIN, 27));
			btnNewButton.setBounds(476, 432, 133, 62);
		}
		return btnNewButton;
	}

	private JLabel getLblSignUpForm() {
		if (lblSignUpForm == null) {
			lblSignUpForm = new JLabel("Sign Up Form");
			lblSignUpForm.setFont(new Font("Kozuka Mincho Pr6N H", Font.PLAIN, 40));
			lblSignUpForm.setBounds(409, 58, 322, 100);
		}
		return lblSignUpForm;
	}
}
