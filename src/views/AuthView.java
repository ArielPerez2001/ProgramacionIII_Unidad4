package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controllers.AuthController;
import models.AuthModel;

public class AuthView {
	
	private JFrame frame;
	private AuthController controller;
	private AuthModel model;
	
	public AuthView() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100,100,520,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,0));
		
		model = new AuthModel();
		
	}
	public void login() {
		
		JPanel login = new JPanel();
		
		login.setBackground(Color.decode("#30508f"));
		login.setLayout(null);

		//User Login
		JLabel login_tag = new JLabel("User Login",0);
		login_tag.setSize(300, 80);
		login_tag.setFont(new Font ("Segoe UI Black",Font.BOLD,32));
		login_tag.setForeground(Color.white);
		login_tag.setLocation(105, 12);
		login.add(login_tag);

		//MyAccount
		JLabel myAccount = new JLabel("My Account",0);
		myAccount.setBounds(150,120,220,40);
		myAccount.setFont(new Font ("Segoe UI Black", Font.BOLD, 35));
		myAccount.setForeground(Color.decode("#D9C943"));
		login.add(myAccount);

		//Titulo
		JLabel userName = new JLabel("Enter Your Username");
		userName.setBounds(100,170,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 20));
		userName.setForeground(Color.white);
		login.add(userName);

		//Textbox del username

		JTextField typeUser = new JTextField();
		typeUser.setBounds(100,210,300,35);
		typeUser.setOpaque(true);
		typeUser.setBackground(Color.white);
		login.add(typeUser);

		//Icono persona
		/*JLabel person = new JLabel();
		person.setIcon(new ImageIcon(getClass().getResource("persona.png")));
		person.setBounds(60, 218, 20, 20);
		login.add(person);/*/

		//personFrame
		JLabel iconFrame = new JLabel();
		iconFrame.setBounds(55,212,30,30);
		iconFrame.setOpaque(true);
		iconFrame.setBackground(Color.decode("#D9C943"));
		login.add(iconFrame);

		//Contraseña
		JLabel pwd = new JLabel("Enter Your Password:");
		pwd.setBounds(100,260,180,40);
		pwd.setFont(new Font("Agency FB",Font.BOLD,20));
		pwd.setForeground(Color.white);
		login.add(pwd);

		//Campo para la contraseña
		JPasswordField typePwd = new JPasswordField();
		typePwd.setBounds(100,300,300,35);
		typePwd.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(typePwd);

		//Locker icon
		/*JLabel locker = new JLabel();
		locker.setIcon(new ImageIcon(getClass().getResource("candado.png")));
		locker.setBounds(60, 305, 20, 20);
		login.add(locker);/*/

		//lockerFrame
		JLabel lockerFrame = new JLabel();
		lockerFrame.setBounds(55,300,30,30);
		lockerFrame.setOpaque(true);
		lockerFrame.setBackground(Color.decode("#D9C943"));
		login.add(lockerFrame);

		//Boton de acceso
		JButton accessButton = new JButton("Login");
		accessButton.setBounds(160,370,170,50);
		accessButton.setBackground(Color.decode("#D9C943"));
		accessButton.setFont(new Font("Segoe UI Black",Font.BOLD,25));
		login.add(accessButton);
		
		accessButton.addActionListener(new ActionListener() {
			
			 @Override
			    public void actionPerformed(ActionEvent e) {

				 	model.login(typeUser.getText(),typePwd.getText());
	            }
			 
		});
		
		JButton noAccount = new JButton("Don´t have an account?");
		noAccount.setBounds(100,470,300,25);
		noAccount.setBackground(Color.decode("#D9C943"));
		noAccount.setFont(new Font ("Segoe UI Black", Font.BOLD, 20));
		login.add(noAccount);
		
		noAccount.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller = new AuthController();
				frame.removeAll();
				frame.setVisible(false);
				controller.register();
			}
			
		});

		//Recuadro
		JLabel frames = new JLabel();
		frames.setSize(450,350 );
		frames.setOpaque(true);
		frames.setBackground(Color.decode("#22396c"));
		frames.setLocation(25,100);
		login.add(frames);

		frame.add(login);
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}
	
	public void register() {
		
		JPanel registro = new JPanel();
		registro.setBackground(Color.cyan);
		registro.setLayout(null);

		JLabel register_tag = new JLabel("Registro",0);
		register_tag.setSize(300, 80);
		register_tag.setFont(new Font ("Arial",Font.BOLD,24));
		register_tag.setForeground(Color.black);
		register_tag.setLocation(100, 26);
		register_tag.setOpaque(true);//Fondo a la etiqueta
		register_tag.setBackground(Color.orange);
		registro.add(register_tag);

		//Registro de usuario
		JLabel userName = new JLabel(" Nombre de usuario:");
		userName.setBounds(167,120,180,40);
		userName.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(userName);

		JTextField userField = new JTextField();
		userField.setBounds(167, 159, 180, 40);
		userField.setFont(new Font("Arial",Font.BOLD,20));
		userField.setOpaque(true);
		userField.setBackground(Color.white);
		registro.add(userField);

		JLabel bioTag = new JLabel("Biografia",0);
		bioTag.setBounds(50, 209, 400, 40);
		bioTag.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(bioTag);

		JTextArea bioText = new JTextArea();
		bioText.setBounds(60, 247, 400, 80);
		bioText.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(bioText);

		JLabel pref = new JLabel("Preferencias",0);
		pref.setBounds(70, 330, 400, 40);
		pref.setFont(new Font("Arial",Font.BOLD,20));
		registro.add(pref);

		JCheckBox itemBox = new JCheckBox("Papas");
		itemBox.setBounds(80, 360, 90, 40);
		itemBox.setFont(new Font("Arial",Font.BOLD,18));
		itemBox.setOpaque(false);
		itemBox.setBackground(Color.magenta);
		registro.add(itemBox);

		JCheckBox itemBox2 = new JCheckBox("Dulces");
		itemBox2.setBounds(350, 360, 100, 40);
		itemBox2.setFont(new Font("Arial",Font.BOLD,18));
		itemBox2.setOpaque(false);
		registro.add(itemBox2);

		JCheckBox itemBox3 = new JCheckBox("Refresco");
		itemBox3.setBounds(200, 360, 130, 40);
		itemBox3.setFont(new Font("Arial",Font.BOLD,18));
		itemBox3.setOpaque(false);
		registro.add(itemBox3);

		JLabel termsTag = new JLabel("Terminos",0);
		termsTag.setBounds(200, 410, 100, 40);
		termsTag.setFont(new Font("Arial",Font.BOLD,20));
		termsTag.setOpaque(false);
		termsTag.setBackground(Color.red);
		registro.add(termsTag);

		JRadioButton acceptRadio = new JRadioButton("Acepto los terminos");
		acceptRadio.setBounds(268, 450, 220, 40);
		acceptRadio.setFont(new Font("Arial",Font.BOLD,16));
		acceptRadio.setOpaque(false);
		acceptRadio.setBackground(Color.red);
		registro.add(acceptRadio);

		JRadioButton noAcceptRadio = new JRadioButton("No acepto los terminos");
		noAcceptRadio.setBounds(33, 450, 220, 40);
		noAcceptRadio.setFont(new Font("Arial",Font.BOLD,16));
		noAcceptRadio.setOpaque(false);
		noAcceptRadio.setBackground(Color.red);
		registro.add(noAcceptRadio);

		ButtonGroup terms = new ButtonGroup();
		terms.add(acceptRadio);
		terms.add(noAcceptRadio);

		String colony[] = {"Centro","Camino real","Ayuntamiento"};

		JComboBox locations = new JComboBox(colony);
		locations.setBounds(80, 496, 350, 40);
		locations.setFont(new Font("Arial",Font.BOLD,19));
		registro.add(locations);

		JButton registerButton = new JButton("Crear cuenta");
		registerButton.setBounds(159, 564, 200, 40);
		registerButton.setFont(new Font("Arial",Font.BOLD,19));
		registro.add(registerButton);
		
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usr = userField.getText();
				String bio = bioText.getText();
					if(usr.length()<=0) {
						userField.setBorder(BorderFactory.createLineBorder(Color.red,2));
					}
					else {
						userField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					}
					
					if(bio.length()<=0) {
						bioText.setBorder(BorderFactory.createLineBorder(Color.red,2));

					}
					else {
						bioText.setBorder(BorderFactory.createLineBorder(Color.green,2));

					}
					
					if(!acceptRadio.isSelected()) {
						acceptRadio.setBorderPainted(true);
						acceptRadio.setBorder(BorderFactory.createLineBorder(Color.red,2));
					}
					else {
						acceptRadio.setBorder(BorderFactory.createLineBorder(Color.green,2));

					}
			}
			
		});
		frame.add(registro);
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
}

	
