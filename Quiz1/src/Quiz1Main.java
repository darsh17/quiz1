import java.util.Scanner;

public class Quiz1Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter touchdowns thrown: ");
		int TD = scanner.nextInt();
		System.out.print("Enter passing yards: ");
		int YDS = scanner.nextInt();
		System.out.print("Enter interceptions thrown: ");
		int INT = scanner.nextInt();
		System.out.print("Enter number of completed passes: ");
		int COMP = scanner.nextInt();
		System.out.print("Enter number of attempted passes: ");
		int ATT = scanner.nextInt();
		
		double pass_rate = equation(TD, YDS, INT, COMP, ATT);
		System.out.println("The passer rating is: " + pass_rate);
		
	}	

	private static double equation(int TD, int YDS, int INT, int COMP, int ATT) {
		
		double a = (((COMP/ATT)-.3)*5);
		if (a > 2.375){
			a = 2.375;
		}
		double b = (((YDS/ATT)-3)*.25);
		if (b > 2.375){
			b = 2.375;
		}
		double c = ((TD/ATT)*20);
		if (c > 2.375){
			c = 2.375;
		}
		double d = 2.375-((INT/ATT)*25);
		if (d > 2.375){
			d = 2.375;
		}
		double pass_rate = (((a+b+c+d)/6)*100);
		if (pass_rate < 0){
			pass_rate = 0;
		}
		return pass_rate;
	}

}
