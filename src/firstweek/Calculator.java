package firstweek;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		String option="new";
		do
		{
			System.out.print("enetr 1st number : ");
			int num1 = Scan.nextInt();
			System.out.print("enetr 2nd number : ");
			int num2 = Scan.nextInt();
			System.out.print("pick an operator from +,-,*,/,% : ");
			String Operator=Scan.next();
		
			if(Operator.equals("+")) {
				int add= num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + add );
			}
			else if(Operator.equals("-")) {
				int sub= num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + sub);
				}
			else if(Operator.equals("*")) {
				int mul= num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + mul );
				}
			else if(Operator.equals("/")) {
				int div= num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + div);
				}
			else if(Operator.equals("%")) {
				int mod= num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + mod);
				}
			else {
				System.out.println("Invalid operator");
			}
			System.out.println("Type yes to continue and no to Stop : ");
			option=Scan.next();
		}while(option.equals("yes"));
			System.out.println("end of program");
}
}
