import java.util.Scanner;

public class MyProgram{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0; // number - введённое число
		int bitNumber = 0; // bitNumber - номер бита в number, значение которого будет 1
		int auxiliaryNumber = 1; // число, котороое будет в операции "или" с number
		try {
			number = sc.nextInt();
			bitNumber = sc.nextInt();
		}
		catch (Exception exc)
		{
			System.out.println(exc);
		};
		auxiliaryNumber <<= bitNumber;
		number |= auxiliaryNumber;
		System.out.println(number);
	}
}
 
