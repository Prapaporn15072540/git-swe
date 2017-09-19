package hum;

import java.util.Scanner;

public class Salary {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a ID_Employee: ");
		String id = input.nextLine();
		System.out.println("Enter a Name: ");
		String name = input.nextLine();
		System.out.println("Enter a Salary: ");
		double salary = input.nextDouble();
		System.out.println("Enter a Sale: ");
		double sale = input.nextDouble();
		ShowSum cal = new ShowSum();
		
		ccg a = new ccg();
		cal.show(name,a.cal(sale, salary));
	}

}
