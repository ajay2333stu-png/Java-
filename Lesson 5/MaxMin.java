import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in);
        int number;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        char choice;


        do { 
            System.out.println("Enter The Number");
            number = scn.nextInt();
            if(number > max)
            {
                max = number;

            }
            if(number < min){

                min = number; 
            }
            System.out.print("Do You want to Continue y/n?");
            choice = scn.next().charAt(0);
        }
        while(choice=='y' || choice=='Y');
        System.out.println("Largest Number:" + max);
        System.out.println("Smallest Number:" + min);

        
    }
    
}
