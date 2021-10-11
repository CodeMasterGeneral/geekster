import java.util.Scanner;

public class NameLength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = scan.nextLine();
        scan.close();
        name += '\n';
        char c;
        int length = 0;
        while (name.charAt(length) != '\n') {
            length++;
        }
        if (length < 4) {
            System.out.println("less");
        } else {
            System.out.println("more");
        }

    }

}
