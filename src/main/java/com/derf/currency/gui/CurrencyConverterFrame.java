package com.derf.currency.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.derf.currency.converter.CurrencyConverter;

public class CurrencyConverterFrame {
	
	public static final String caption = "Derf's Currency Converter";
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	// Currency Converter
	private CurrencyConverter converter;
	
	// Currency Names...
	private List<String> currencyName;
	
	// Frame...
	private JFrame mainFrame;
	private JPanel controlPanel;
	private JLabel answer;
	@SuppressWarnings("rawtypes")
	private JComboBox fromCB;
	@SuppressWarnings("rawtypes")
	private JComboBox toCB;
	private JTextField amount;
	private JButton convert;
	
	public CurrencyConverterFrame() {
		converter = new CurrencyConverter();
		converter.init();
		this.currencyName = converter.getCurrencyNames();
		Collections.sort(this.currencyName);
		prepareGUI();
	}

	private void prepareGUI() {
		mainFrame = new JFrame(caption);
		mainFrame.setSize(512, 200);
		mainFrame.setLayout(new GridLayout(2, 1));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		answer = new JLabel("", JLabel.CENTER);
		
		this.fromCB = this.createComboBox();
		this.toCB = this.createComboBox();
		
		this.amount = new JTextField("0", 5);
		
		this.convert = new JButton("Convert");
		
		this.convert.addActionListener(this::handleConversion);
		
		controlPanel.add(new JLabel("From: "));
		controlPanel.add(fromCB);
		controlPanel.add(new JLabel("To: "));
		controlPanel.add(toCB);
		controlPanel.add(new JLabel("Amount: "));
		controlPanel.add(this.amount);
		controlPanel.add(this.convert);
		mainFrame.add(controlPanel);
		mainFrame.add(answer);
		mainFrame.setVisible(true);
	}
	
	@SuppressWarnings("rawtypes")
	private JComboBox createComboBox() {
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		
		currencyName.forEach(s -> model.addElement(s));
		
		@SuppressWarnings("unchecked")
		JComboBox temp = new JComboBox(model);
		
		return temp;
	}
	
	private void handleConversion(ActionEvent listener) {
		String from = (String) fromCB.getSelectedItem();
		
		String to = (String) toCB.getSelectedItem();
		
		double amount = Double.parseDouble(this.amount.getText());
		
		double answer = converter.convert(from, to, amount);
		
		this.answer.setText("Answer is: " + answer + " " + to);
	}
}
