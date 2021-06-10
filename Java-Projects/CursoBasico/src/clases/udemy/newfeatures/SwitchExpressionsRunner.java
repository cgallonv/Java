package clases.udemy.newfeatures;

public class SwitchExpressionsRunner {

	public static void main(String[] args) {
		System.out.println(SwitchExpressionsRunner.findDayOfWeekWithSwitch(1));
		System.out.println(SwitchExpressionsRunner.findDayOfWeekWithSwitchExpression(0));
		
	}

	//JDK 14
	public static String findDayOfWeekWithSwitchExpression(int day) {
		String dayOfWeek = switch(day) {
			case 0 -> {
				System.out.println("Codigo complejo");
				int i =0;
				i++;
				yield "Monday " + i;  //Indicates value to return.
				}
			case 1 -> "Tuesday";
			case 2 -> "Wednesday";
			case 3 -> "Thursday";
			default -> throw new IllegalArgumentException("Invalid input " + day);
		};
		return dayOfWeek;
	}

	public static String findDayOfWeekWithSwitch(int day) {
		String dayOfWeek = null;
		switch (day) {
		case 0:
			dayOfWeek = "Monday";
			break;
		case 1:
			dayOfWeek = "Tuesday";
			break;
		case 2:
			dayOfWeek = "Wednesday";
			break;
		case 3:
			dayOfWeek = "Thursday";
			break;
		default:
			throw new IllegalArgumentException("Invalid input " + day);
		}
		return dayOfWeek;
	}

}
