public class _1oct_marks {

    public static void main(String[] args) {

        int marks = 99;

        if(marks<40){
            System.out.println("failed..");
        }
        if (  marks >=40 && marks <= 60 ){
            System.out.println("d grade");
        }
        if( marks >=60 && marks <=80){
            System.out.println("c grade");
        }
        if( marks >=80 && marks <=90){
            System.out.println("b grade");
        }
        if( marks > 90){
            System.out.println("a grade");
        }

    }
}
