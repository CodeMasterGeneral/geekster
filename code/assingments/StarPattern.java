import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of lines for star pattern: ");

        int num = sc.nextInt();

        System.out.println( "entered number : "+num + "\n");

        for(int i = 0; i<=num-1; i++){

            for(int j = 0;j<=i; j++){

                System.out.print("*");

            }
            System.out.println("\n");
        }
    }
}
