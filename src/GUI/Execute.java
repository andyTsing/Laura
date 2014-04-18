package GUI;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;

public class Execute extends JFrame{
	 JTextArea about;
	 private JButton Home;
	
	
	
	public Execute() {
		setResizable(false);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 41, 795, 556);
		getContentPane().add(scrollPane);
		
		 about = new JTextArea();
		 about.setFont(new Font("Monospaced", Font.PLAIN, 16));
		about.setBackground(SystemColor.control);
		scrollPane.setViewportView(about);
		
		Home = new JButton("Home");
		Home.setFont(new Font("Gabriola", Font.PLAIN, 16));
		Home.setBounds(326, 7, 89, 23);
		getContentPane().add(Home);
	}
	
	
	public String getabouttextarea(){
		
		return about.getText();
	}
	
	public void setabouttextarea(String s){
		
	s=null;
		
		return;
	}
	
	void addHomeListener(ActionListener listenForExecuteButton){
		Home.addActionListener(listenForExecuteButton); 
		System.out.println("execute");
	}
	
}