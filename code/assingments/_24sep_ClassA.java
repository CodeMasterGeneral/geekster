public class _24sep_ClassA {

//    1.Create class A call class B from A and print sum using method overloading
//    1. int, int
//    2. int, int ,int
//    3. double, double

    public static void main(String[] args) {

        _24sep_ClassB B = new _24sep_ClassB();
        B.B_greetings();

        B.Sum(2,4);

        B.Sum(2,6,3);

        B.Sum(3.4,4.5);
    }



}
