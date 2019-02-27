import java.util.*;
import java.text.*;

public class A {
    
    public static void main(String[] args) {
        String us,india,china,france;
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if( payment < 0 || payment > Math.pow(10,9))
            System.exit (1);
         us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        
        india = "Rs." + us.substring(1);
        
        china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        
        france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}