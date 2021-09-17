public class A {
    public static void main(String args[]) {

        A_greeting();

        System.out.println("creating class B object in class A.");
        B b_obj = new B();
//        b_obj.sum();//print pre-defined numbers of B

        b_obj.addScan();//scan numbers first, add them and print them
    }

    public static void A_greeting() {
        System.out.println("welcome to class Aye....");
    }
}
