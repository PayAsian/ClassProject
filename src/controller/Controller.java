package controller;

import model.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Controller 
{
	private Stack<Plates> Plates;
	private Queue<Customer> Customer;
	
	public void Plates(Stack plate, int all)
	{
		plate.push(new Integer(all));
		plate.pop();
		plate.peek();
	}
	
	public void Customer()
	{
		Customer = new LinkedList<Customer>();
		Customer.addAll(Customer);
		Customer.remove();
	}
	
	public void start()
	{
		
	}
	
	
	
}
