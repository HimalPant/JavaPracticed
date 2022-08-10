package com.test.swingdemo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.test.swingdemo.model.User;
import com.test.swingdemo.service.UserService;
import com.test.swingdemo.service.UserServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblLastName;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JTextField Fname;
	private JTextField Lname;
	private JTextField Username;
	private JTextField Password;
	private JLabel lblLoginForm;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(20, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblLastName());
		contentPane.add(getLblUserName());
		contentPane.add(getLblPassword());
		contentPane.add(getFname());
		contentPane.add(getLname());
		contentPane.add(getUsername());
		contentPane.add(getPassword());
		contentPane.add(getLblLoginForm());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setFont(new Font("Kozuka Mincho Pr6N H", Font.PLAIN, 27));
			lblNewLabel.setBounds(119, 91, 234, 78);
		}
		return lblNewLabel;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setFont(new Font("Kozuka Mincho Pr6N H", Font.PLAIN, 27));
			lblLastName.setBounds(119, 191, 234, 78);
		}
		return lblLastName;
	}
	private JLabel getLblUserName() {
		if (lblUserName == null) {
			lblUserName = new JLabel("User Name");
			lblUserName.setFont(new Font("Kozuka Mincho Pr6N H", Font.PLAIN, 27));
			lblUserName.setBounds(119, 313, 234, 78);
		}
		return lblUserName;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Kozuka Mincho Pr6N H", Font.PLAIN, 27));
			lblPassword.setBounds(119, 423, 234, 78);
		}
		return lblPassword;
	}
	private JTextField getFname() {
		if (Fname == null) {
			Fname = new JTextField();
			Fname.setBounds(387, 91, 291, 42);
			Fname.setColumns(10);
		}
		return Fname;
	}
	private JTextField getLname() {
		if (Lname == null) {
			Lname = new JTextField();
			Lname.setColumns(10);
			Lname.setBounds(387, 191, 291, 42);
		}
		return Lname;
	}
	private JTextField getUsername() {
		if (Username == null) {
			Username = new JTextField();
			Username.setColumns(10);
			Username.setBounds(387, 313, 291, 42);
		}
		return Username;
	}
	private JTextField getPassword() {
		if (Password == null) {
			Password = new JTextField();
			Password.setColumns(10);
			Password.setBounds(387, 423, 291, 42);
		}
		return Password;
	}
	private JLabel getLblLoginForm() {
		if (lblLoginForm == null) {
			lblLoginForm = new JLabel("Login Form");
			lblLoginForm.setVerticalAlignment(SwingConstants.BOTTOM);
			lblLoginForm.setFont(new Font("Kozuka Mincho Pr6N H", Font.BOLD, 30));
			lblLoginForm.setBounds(403, 2, 304, 78);
		}
		return lblLoginForm;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					User usr = new User();
					usr.setFname(Fname.getText());
					usr.setLname(Lname.getText());
					usr.setUsername(Username.getText());
					usr.setPassword(Password.getText());
					

					UserService us = new UserServiceImpl();

					if (us.login(usr)) {
						JOptionPane.showMessageDialog(null, "Login Successfully");
					} else {
						JOptionPane.showMessageDialog(null, "Login is failed ");
					}
					new SignUpForm().setVisible(true);
				}
			});
			btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
			btnNewButton.setFont(new Font("Kozuka Mincho Pro R", Font.BOLD, 30));
			btnNewButton.setBounds(438, 512, 199, 78);
		}
		return btnNewButton;
	}
}
