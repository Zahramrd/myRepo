package method;

import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] num = new int[10];

    for (int i = 1; i< num.length;i++ ){
        System.out.println("Enter a number: ");
        num[i] = sc.nextInt();
    }
    System.out.println("The array reverse is: ");
    for (int i= num.length-1; i>=0; i--){
        System.out.println(num[i]);
    }
    sc.close();
    }
}
