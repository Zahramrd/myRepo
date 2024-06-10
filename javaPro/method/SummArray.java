package method;

import java.util.Scanner;

public class SummArray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] num= new int[10];

        //lese 10 Zahlen ein
        for (int i = 0; i< num.length; i++){
            System.out.println("Enter a number: ");
            num[i] = sc.nextInt();
        }
        int sum= calcSum(num);
        System.out.print("The sum of array is: " + sum);
        sc.close();

    }
    public static int calcSum(int[] array){
        int sum= 0;
        for (int num : array){
            sum+= num;

        }
        return sum;
    }
}

