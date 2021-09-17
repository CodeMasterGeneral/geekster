public class TypeCasting {

    public static void main(String[] args) {

//    left to right -->    byte>short>char>int>long>float>double  --> widening casting
//    <-- narrowing casting    byte<short<char<int<long<float<double   <--right to left     mannually done

//      widening casting
        int a = 5;
        double a_double = a;

        System.out.println(a);
        System.out.println(a_double);

//      narrowing casting
        float f = 4f;
        int i = (int)f;

        System.out.println(f);
        System.out.println(i);


    }
}
