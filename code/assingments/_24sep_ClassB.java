public class _24sep_ClassB {

    int total;

    public void B_greetings(){
        System.out.println("welcome to class B");
    }

    public int Sum(int a,int b){
        total = a + b;
        System.out.println("sum: " + total);
        return total;
    }

    public int Sum(int a,int b, int c){
        total = a + b + c;
        System.out.println("sum: " + total);
        return total;
    }

    public double Sum(double a, double b){
        double total;
        total = a + b;
        System.out.println("sum: " + total);
        return total;
    }
}
