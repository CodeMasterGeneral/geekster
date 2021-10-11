import java.util.Scanner;

public class _10oct_decimal_to_binary_test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        sc.nextLine();

        System.out.println(getDecimal(n));

    }

    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
}
