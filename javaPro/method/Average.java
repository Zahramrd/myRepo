package method;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] num= new int[10];

    for(int i = 0; i< num.length; i++){
        System.out.println("Enter a number: ");
        num[i]= sc.nextInt();
        }

    double calc= calcAvg(num);
    System.out.println("The avg of array is: "+ calc);
    sc.close();
    }

    public static double calcAvg(int[] array){
        int sum= 0;
        for(int num: array) {
            sum += num;
        }
        return (double) sum/ array.length;
    }

}

