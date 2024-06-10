package method;

public class Prime {
public static void main(String[] args){
    for (int i= 1; i<= 100; i++){
        if (isPrime(i)){
            System.out.println(i + "is a prime number");

        }
    }
}

//Methode prüft ob ein Zahl Prirm ist
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i= 2; i<= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
