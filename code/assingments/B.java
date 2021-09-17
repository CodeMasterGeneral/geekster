import java.util.Scanner;

public class B {

    public void B_greeting(){
        System.out.println("welcome to class B");
    }

    public void sum() {
        int x = 34;
        int y = 2;
        int sum = x + y;
        System.out.print("sum of x and y is : " + sum);

    }

    public void addScan() {
        B_greeting();

        int p,q,t;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number : ");
            p = sc.nextInt();
        System.out.print("enter second number : ");
            q = sc.nextInt();
            sc.close();
        t = p + q;

        System.out.println("Total = " + t );

    }
}
