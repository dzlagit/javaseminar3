import java.util.Scanner;

public class Main {
    public static String getMonthName(int month) {
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
            }
            return monthName;
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month (1-12): ");
		
		if (input.hasNextInt()){
		    int month = input.nextInt();
		    if (month >= 1 && month <= 12) {
		        String monthName = getMonthName(month);
		        System.out.println("The name of the month is: " + monthName);
		    }
		    else {
		        System.out.println("Invalid input. Please enter a number between 1 and 12.");
		    }
		}
	}
}
