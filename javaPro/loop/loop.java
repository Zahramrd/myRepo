import java.util.Scanner;

public class loop {
        public static void main(String[] args){
            Scanner sc= new Scanner (System.in);
            int[] num= new int[5];
            int summe= 0;


            //lese fünf zahlen ein

            for(int i = 0; i< num.length; i++){
                System.out.println("enter a number: ");
                num[i]= sc.nextInt();
                summe += num[i];

            }
            double median= (double) summe / num.length;
            System.out.println("the sum is: " + summe);
            System.out.println("the median is: " + median);
            sc.close();

        }
    }
