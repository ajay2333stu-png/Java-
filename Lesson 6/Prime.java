import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number to test : ");
        int n = scn.nextInt();
        int count = 0;
        for (int div = 2; div*div <= n; div++) {
            if (n % div == 0) {
                count++;
                break;

            }
        }

        if (n<1) {
            System.out.println(" Not Prime");
        } else if (count == 0) {
            System.err.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}