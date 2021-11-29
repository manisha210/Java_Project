package com.converter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author Manisha Gurav created on 03/08/2018
 *
 */

public class Runner {
	private static JFrame frame;
	private static JPanel panel,panel1;
	private static JLabel label,labelTo,labelFrom,label2;
	private static JTextField text;
	private static JButton button;
	private static JComboBox from,to;
	public static void main(String[] args) {
		
		//creating frame
			
		frame=new JFrame("Currency Converter");
		panel=new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    
		label=new JLabel("Enter Value");
		label.setBounds(10, 20,80, 25);
		panel.add(label);
		
		text=new JTextField(20);
		text.setBounds(100,20,165,25);
		panel.add(text);
		
		labelFrom=new JLabel("From");
		labelFrom.setBounds(10, 80,80, 25);
		panel.add(labelFrom);
		
		String currency[]={"AUD:Austrailian Dollar","GBP:British Pound Sterling"};       
	    from=new JComboBox(currency);    
	    from.setBounds(100, 80,165,25);    
	    panel.add(from);
	    
	    labelTo=new JLabel("To");
		labelTo.setBounds(10, 140,80, 25);
		panel.add(labelTo);
		
		String cucy[]= {"AUD:Austrailian Dollar","EUR:Euro","GBP:British Pound Sterling","CNY:Chinese Yuan","JPY:Japanese Yen","CAD:Canadian Dollar"};        
	    to=new JComboBox(cucy);    
	    to.setBounds(100, 140,165,25);    
	    panel.add(to);
	    
	    label2=new JLabel("");
		label2.setBounds(10, 260,180, 50);
		panel.add(label2);
		
		button=new JButton("convert");
		button.setBounds(10,220,80,25);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {

			int input=Integer.parseInt(text.getText());
				String selectedItemFrom=(String) from.getItemAt(from.getSelectedIndex());
				String selectedItemTo=(String)to.getItemAt(to.getSelectedIndex());
				
				if(selectedItemFrom.equals("AUD:Austrailian Dollar") && selectedItemTo.equals("EUR:Euro"))
				{
					int output=(int) (input*0.622663);
					System.out.println(output);
					label2.setText(input+"AUD="+output+"EUR");
					
				}else if(selectedItemFrom.equals("AUD:Austrailian Dollar") && selectedItemTo.equals("GBP:British Pound Sterling"))
				{
					int output=(int) (input*0.563349);
					System.out.println(output);
					label2.setText(input+"AUD="+output+"GBP");
					
				}else if(selectedItemFrom.equals("AUD:Austrailian Dollar") && selectedItemTo.equals("CNY:Chinese Yuan"))
				{
					int output=(int) (input*4.949932);
					System.out.println(output);
					label2.setText(input+"AUD="+output+"CNY");
					
				}else if(selectedItemFrom.equals("AUD:Austrailian Dollar") && selectedItemTo.equals("JPY:Japanese Yen"))
				{
					int output=(int) (input*78.47752);
					System.out.println(output);
					label2.setText(input+"AUD="+output+"JPY");
					
				}
				else if(selectedItemFrom.equals("AUD:Austrailian Dollar") && selectedItemTo.equals("CAD:Canadian Dollar"))
				{
					int output=(int) (input*0.964849);
					System.out.println(output);
					label2.setText(input+"AUD="+output+"CAD");
					
				}else if(selectedItemFrom.equals("AUD:Austrailian Dollar") && selectedItemTo.equals("AUD:Austrailian Dollar"))
				{
					int output=(int) (input*1);
					System.out.println(output);
					label2.setText(input+"AUD="+output+"AUD");
					
				}
				
				
				else if(selectedItemFrom.equals("GBP:British Pound Sterling") && selectedItemTo.equals("GBP:British Pound Sterling"))
				{
					int output=(int) (input*1);
					System.out.println(output);
					label2.setText(input+"GBP="+output+"GBP");
					
				}else if(selectedItemFrom.equals("GBP:British Pound Sterling") && selectedItemTo.equals("CNY:Chinese Yuan"))
				{
					int output=(int) (input*8.786616);
					System.out.println(output);
					label2.setText(input+"GBP= "+output+"CNY");
					
				}else if(selectedItemFrom.equals("GBP:British Pound Sterling") && selectedItemTo.equals("JPY:Japanese Yen"))
				{
					int output=(int) (input*139.3053);
					System.out.println(output);
					label2.setText(input+"GBP= "+output+"JPY");
					
				}
				else if(selectedItemFrom.equals("GBP:British Pound Sterling") && selectedItemTo.equals("CAD:Canadian Dollar"))
				{
					int output=(int) (input*1.7127011);
					System.out.println(output);
					label2.setText(input+"GBP= "+output+"CAD");
					
				}else if(selectedItemFrom.equals("GBP:British Pound Sterling") && selectedItemTo.equals("AUD:Austrailian Dollar"))
				{
					int output=(int) (input*1.7750981);
					System.out.println(output);
					label2.setText(input+"GBP= "+output+"AUD");
					
				}else if(selectedItemFrom.equals("GBP:British Pound Sterling") && selectedItemTo.equals("EUR:Euro"))
				{
					int output=(int) (input*1.1052879);
					System.out.println(output);
					label2.setText(input+"GBP= "+output+"EUR");
					
				}
				System.out.println(input);
				System.out.println(selectedItemFrom);
				
			}
			
		});
		panel.add(button);
		frame.setVisible(true);
	}

}
