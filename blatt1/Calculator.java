import java.util.Scanner;

public class Calculator{
	public static void main(String[]args){
		int a=0;
		int b=0;
		Scanner scan = new Scanner(System.in);
		a= scan.nextInt();
		b= scan.nextInt();
		Scanner strscan = new Scanner(System.in);
		String op= strscan.nextLine();
		
		if (op.equals("+")){
			System.out.println(a+b);

		}

	}

}
