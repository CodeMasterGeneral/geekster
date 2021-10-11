public class _27sep_nested_ifelse {

    public static void main(String[] args) {

        check(300);

        boolean value = validateAge(25);
        System.out.println(value);

    }

    public static void check(int n){


        if(n<100){
            if(n<50){
                System.out.println("num smaller than 50");
            }else{
                System.out.println("num is greater than 50");

            }
        }else {
//            no is greater than 100, check for 150
            if(n>150){
                System.out.println("num is greater than 150");
            }else {
                System.out.println("num is smaller then 150");
            }
        }
    }

    public static Boolean validateAge(int age){
        if(age > 18 && age>0){
            return true;
        }else{
            return false;
        }
    }
}
