public class Calculator2{
    public static void main(String[] args){
        float zahl =  Float.parseFloat(args[0]);
        float number = Float.parseFloat(args[2]);
        String z = args[1]; //zeichen
        float result =0;
        /*
         - 1 = addition
         - 2 = substraktion
         . 3 = multiplication
         . 4 = division
         */
        switch(z) {
            case "+":
                 result = zahl + number;
                 break;
            case "-":
                 result = zahl - number;
                 break;
             case ".":
                 result = zahl * number;
                 break;
             case "/":
                 result = zahl / number;
                 break;
        }    
        System.out.println(result);
     }
} 