
import java.util.Scanner;

class Increase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number (n):");
         int sum = 0; 
         int n = scn.nextInt();
        for(int i=1; i<n; i++ ) {
            sum = sum + i;
            
        }
        System.out.println("The Sum of i is:"  + sum);
    }
}