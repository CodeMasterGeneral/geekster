public class _26sep_hackerrank {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        System.out.print("enter:  ");
//        String str = sc.nextLine();
//
//        for (int i = 0; i < str.length(); i++) {
//                char ch = str.charAt(i);
//                if (Character.isUpperCase(ch)) {
//                    System.out.println(1);
//                } else if (Character.isLowerCase(ch)) {
//                    System.out.println(0);
//                } else if (Character.isDigit(ch)) {
//                    int a = ch - '0';
//                    if (a == 0) {
//                        System.out.println(0);
//                    }
//                }else {
//                    System.out.println(-1);
//                }
//        }
//    }

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("enter number of lines for star pattern: ");
//
//        int num = sc.nextInt();
//
//        System.out.println( "entered number : "+num + "\n");
//
//        for(int i = 0; i<=num-1; i++){
//
//            for(int j = 0;j<=num-1; j++){
//
//
//                if(j==num-1){
//                    System.out.println(num);
//                }else{
//                    System.out.print(num);
//                }
//            }
////            System.out.println("\n");
//        }
//    }
//    --------------------------
//
//    public static void main(String[] args)
//    {
//        int i, number, count, sum = 0;
//
//        Scanner sc = new Scanner(System.in);
//        // System.out.print("enter the sequence: ");
//        String numStr = sc.next();
//        int max = Integer.parseInt(numStr);
//
//        for(number = 1; number <= max; number++)
//        {
//            count = 0;
//            for (i = 2; i <= number/2; i++)
//            {
//                if(number % i == 0)
//                {
//                    count++;
//                    break;
//                }
//            }
//            if(count == 0 && number != 1 )
//            {
//                System.out.println(number);
//                sum = sum + number;
//            }
//        }
//        // System.out.println(sum);
//    }

//    -----------------------------------

//    public static void main(String[] args)
//    {
//        int i, number, count, sum = 0;
//
//        for(number = 1; number <= 100; number++)
//        {
//            count = 0;
//            for (i = 2; i <= number/2; i++)
//            {
//                if(number % i == 0)
//                {
//                    count++;
//                    break;
//                }
//            }
//            if(count == 0 && number != 1 )
//            {
//                sum = sum + number;
//            }
//        }
//        System.out.println("Sum of Prime Numbers from 1-100 : " + sum);
//    }


//    -------------------------------------sum of even and odd

//    public static void main(String[] args) {
//        int number = 552245;
//        int even = 0;
//        int odd = 0;
//        while (number > 0)
//        {
//            if ((number % 10) % 2 == 0)
//                even = even + number % 10;
//            else
//                odd = odd + number % 10;
//            number = number / 10;
//        }
//        System.out.print("sum even : " + even + " sum odd : " + odd);
//    }
//----------------------------------------------------------
//    public static void main(String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the sequence: ");
//        String numStr = sc.next();
//        int n = Integer.parseInt(numStr);
//        getSum(n);
//    }
//
//    static void getSum(int n)
//    {
//        int sumOdd = 0, sumEven = 0, c = 1;
//        while (n != 0) {
//            // If c is even number then it means
//            // digit extracted is at even place
//            if (c % 2 == 0)
//                sumEven += n % 10;
//            else
//                sumOdd += n % 10;
//            n /= 10;
//            c++;
//        }
//
//        System.out.println("Sum odd = " + sumOdd);
//        System.out.println("Sum even = " + sumEven);
//    }
//
//
}
