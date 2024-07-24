package casting;

import java.util.Scanner;

public class Admission {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Engineering e;
		Graduation g;
		System.out.println("1. Engineering	2.Graduation");
		System.out.print("Enter your choice for admission:");
		int ch=sc.nextInt();
		
		switch(ch) {
			case 1:
				System.out.print("College name:");
				sc.nextLine();
				String cname=sc.nextLine();
				System.out.print("Number of dept:");
				int dept=sc.nextInt();
				System.out.print("College address:");
				sc.nextLine();
				String address=sc.nextLine();
				e=new Student();
				e.collegeInfo(cname, dept, address);
				Engineering.display();
			break;
			
			case 2:
				System.out.print("College name:");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.print("Branch name:");
				String branch=sc.nextLine();
				System.out.print("In which year you are:");
				String yr=sc.nextLine();
				System.out.print("Enter your fee:");
				int year=sc.nextInt();
				System.out.print("Year of admission:");
				int admyr=sc.nextInt();
				g=new Student();
				g.deptInfo(name, branch, yr, year,admyr);
				g.show();
			break;
			
			default:
				System.out.println("Wrong choice");
		}
	}
}
