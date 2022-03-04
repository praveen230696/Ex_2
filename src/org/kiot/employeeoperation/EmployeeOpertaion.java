package org.kiot.employeeoperation;

import java.util.Scanner;

/**
 *	E1mployeeOpertaion class performs employee operations
 *	@version 04/03/2022
 *  @author praveen kandhan
 */
public class EmployeeOpertaion {
	Scanner scanner = new Scanner(System.in);
	public void doEmployeeOpertaion() {
		System.out.println("Enter your salary:");
		long salary = scanner.nextLong();
		int  houseLoanEMI;
		int educationLoanEMI;
		System.out.println("Are you having Housing loanEMI?"); 
		if(scanner.next() == "yes") {
			System.out.println("How much you having Housing loan?");
			houseLoanEMI = scanner.nextInt();
			System.out.println("Are you having Education loanEMI?");
			if (scanner.next() == "yes") {
				System.out.println("How much you having Education loan?");
				educationLoanEMI = scanner.nextInt();
				salary = salary - houseLoanEMI - educationLoanEMI;
				if(salary > 1000000 ) {
				System.out.println(salary * 0.3);
				} else if(salary > 500000) {
					System.out.println("Tax deducted" + salary * 0.2);
				}
				else {
					System.out.println("Tax deducted" + salary * 0.05);
				}
			}
			else {
				salary = salary - houseLoanEMI;
				if(salary > 1000000 ) {
					System.out.println("Tax deducted" + salary * 0.3);
				} else if(salary > 500000) {
					System.out.println("Tax deducted" + salary * 0.2);
				}
				else {
					System.out.println("Tax deducted" + salary * 0.05);
				}
			}
		}
		else {
			
			System.out.println("Are you having Education loanEMI?");
			if (scanner.next() == "yes") {
				System.out.println("How much you having Education loan?");
				educationLoanEMI = scanner.nextInt();
				salary = salary - educationLoanEMI;
				if(salary > 1000000 ) {
					System.out.println("Tax deducted" + salary * 0.3);
				} else if(salary > 500000) {
					System.out.println("Tax deducted" + salary * 0.2);
				} else {
					System.out.println("Tax deducted" + salary * 0.05);
				}
		   } else {
			   if(salary > 1000000 ) {
					System.out.println("Tax deducted" + salary * 0.3);
			   } else if(salary > 500000) {
					System.out.println("Tax deducted" + salary * 0.2);
			   } else {
					System.out.println("Tax deducted" + salary * 0.05);
			   }
		   }  
		}
	}
}

