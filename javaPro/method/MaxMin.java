package method;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i< num.length; i++){
            System.out.print("enter a numebr: ");
            num[i]= sc.nextInt();
        }
        int min= num[0];
        int max= num[0];
        for(int i=1; i< num.length; i++){
            if (num[i]> max){
                max= num[i];
            }
            if (num[i]< min){
                min= num[i];
            }
        }
        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " +min);
        sc.close();

    }
}
