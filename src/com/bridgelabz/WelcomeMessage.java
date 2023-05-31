package com.bridgelabz;

public class WelcomeMessage {
	
static final int FullTIme=1;
static final int PartTime=2;


 static void calculateWage(String company, int WAGEPerHour, int WorkingDaysPerMonth, int TotalWorkingHours  ) {
		        int fullDayHour = 8;
		        int dailyWage = 0;
		        int partTimeHour = 4;
		        int totalWorkingDays = 0;
		        int totalHour=0;
		        while (totalHour < TotalWorkingHours && totalWorkingDays < WorkingDaysPerMonth) {

		        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
		        totalWorkingDays++;
		        switch (employeeCheck) {
		        case 1:                    totalHour = totalHour + fullDayHour;

		            dailyWage = dailyWage+fullDayHour * WAGEPerHour;
		            System.out.println("Employee is present Full Time :" +dailyWage);
		            break;
		        case 2:
                    totalHour = totalHour + partTimeHour;

		        	 dailyWage = dailyWage+partTimeHour * WAGEPerHour;
		             System.out.println("Employee is present half time :" +dailyWage);
		             break;
default:		            System.out.println("Employee is absent");
		        }
		        System.out.println("Working days is : " + totalWorkingDays   +   " Hours: "  +totalHour);
		    }
		        System.out.println("Employee total wage is: " + dailyWage  + " of " +company );
}
public static void main(String[] args) {
	WelcomeMessage e =new WelcomeMessage();

	WelcomeMessage e1  = new WelcomeMessage();
	WelcomeMessage e2 = new WelcomeMessage();
    
	e.calculateWage("Tata",20,22, 100);
	e1.calculateWage("Mahindra",21,21,90);
	e2.calculateWage("Amazon",22,20, 85);

	   

		}
}