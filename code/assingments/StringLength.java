import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("enter your length limit(like 4,5,6): ");
        int limit = sc.nextInt();
        System.out.print("enter the name or any string: ");
        String userStr = sc.next();
        System.out.println("\n limit : " + limit + ", str: " + userStr);
        sc.close();

        userStr += '\n';
        int length = 0;
        while( userStr.charAt(length) != '\n'){
            length++;
        }

        if(length == limit){
            System.out.println("accepted, sting is in limit. ");
        }else if (length < limit){
            System.out.println("length is smaller.");
        }else {
            System.out.println("length is larger than limit.");
        }

    }
}
