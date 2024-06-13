import java.util.Scanner;
public class Summ {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter firste number: ");
    int num1= sc.nextInt();

    System.out.println("Enter the second number: ");
    int num2 = sc.nextInt();

    int sum= sume (num1, num2);
    System.out.println("The sum is: "+ sum);
    sc.close();

  }
    public static int sume(int num1, int num2){
      return num1+num2;
    }
}
