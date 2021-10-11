public class pyramid {
    public static void main(String[] args) {
//        pyramid pattern

        int num;

        num = 5;
        for(int i = 0;i<num;i++){//for rows
            for(int j = 0; j<num;j++){//for cols

                for(int k = j-2; k>0;k--){
                    System.out.print(" ");

                }
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
