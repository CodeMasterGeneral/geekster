import java.util.Scanner;

public class PalindromeAndReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.next();
        System.out.println("entered : "+ str);
        int length = 0;
        str += '\n';
//        for counting length
        while(str.charAt(length) != '\n'){
            length++;
        }
        System.out.println("length : " + length);
        sc.close();
        int l2 = length;
//        for reversing the string
        String reverseStr = "";
        while(length !=0){
            length--;
            reverseStr += str.charAt(length);
        }
        System.out.println("reversed : " + reverseStr);

//        for palindrome
        String palindrome = str;

        int palindromeReverse = 0;
        while(l2 !=0){
            l2--;
            palindromeReverse += str.charAt(l2);
        }

        String reverseMinusOne ="h";

    }
}
