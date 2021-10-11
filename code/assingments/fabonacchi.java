public class fabonacchi {

    public static void main(String[] args) {

        int f = 0, s = 1  , count = 10;

        while(count>0){
            if(f==0){
                f +=1;
            }
            if(f==1){
                f+=1;
            }

            f = f;//first
            s = f + s;//second



            System.out.println(s);
            count--;
        }



    }
}
