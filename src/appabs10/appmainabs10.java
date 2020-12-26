package appabs10;

import java.util.Scanner;

import paretchildabs10.Employee;
import paretchildabs10.PermanentEmployee;

public class appmainabs10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter salaryu");
		float slaary=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enyter pf percent");
		float pfpercent=sc.nextFloat();
		sc.nextLine();
		float pfamount=0;
		float netsalary=0;
		PermanentEmployee permanentemployye=new PermanentEmployee(name,slaary,netsalary,pfpercent,pfamount);
		boolean valid=(boolean) (permanentemployye.validateinput(slaary, pfpercent));
		if(valid==false)
		{
			System.out.println("Unable to calculate net salary");
		}
		else
		{
			permanentemployye.findnetsalary();
	
		System.out.println("Employee Name:"+permanentemployye.getName());
		System.out.println("Pf amount:"+permanentemployye.getPfamount());
		System.out.println("netsalary:"+permanentemployye.getNetsalary());
		}
		
		

	}

}
