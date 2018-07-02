package dictonary;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextArea;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DictionaryAplication extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnbutton2;
	private JButton btnFind;
	ReadFileIO re;
	//MyThread my;
	//ArrayList<String> list= re.find1(textField.getText());


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryAplication frame = new DictionaryAplication();
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
	public DictionaryAplication() {
		re = new ReadFileIO();
		//my = new MyThread();
		setTitle("DictionaryApplication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(25, 77, 266, 270);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		textArea.setBorder(border);
		contentPane.add(textArea);
		textArea.setEditable(false);
		
		JButton btnbutton1 = new JButton("Search");
		btnbutton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String text = textField.getText();
				
				textArea.setText(re.search(text));
				
			}
		});
		btnbutton1.setBounds(301, 38, 89, 28);
		contentPane.add(btnbutton1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				textArea.setText(re.getArr(re.find1(textField.getText())));
				if(textField.getText().equals("")){
					textArea.setText("");
				}
			}
		});
		textField.setBounds(25, 38, 266, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnbutton2 = new JButton("refresh");
		btnbutton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText(null);
				textArea.setText(null);
			}
		});
		btnbutton2.setBounds(301, 77, 89, 28);
		contentPane.add(btnbutton2);
		
		btnFind = new JButton("Find");
		btnFind.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String text = textField.getText();
				textArea.setText(re.getArr(re.find1(text)));
				
			}
		});
		btnFind.setBounds(301, 116, 89, 28);
		contentPane.add(btnFind);
	}
}
