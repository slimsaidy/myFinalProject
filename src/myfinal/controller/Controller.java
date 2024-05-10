package myfinal.controller;

import javax.swing.JOptionPane;
import myfinal.view.FinalFrame;

public class Controller 
{
	public FinalFrame frame;
	
	public Controller()
	{
		
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(frame, "Welcome to my final project!");
	}
	
	public void handleError(Exception error)
	{
		JOptionPane.showMessageDialog(frame, error.getMessage(), "final project Error!", JOptionPane.ERROR_MESSAGE);
	}
}
