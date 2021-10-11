import java.sql.Array;

public class _8oct_array_questions {
    public static void main(String[] args) {

        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};

        int len;


        len = num2.length + num1.length;

        int[] ans = new int[len] ;
        int[] unique = new int[len] ;

        for(int i = 0; i< num1.length ; i++){
            for(int j = 0 ; j< num2.length ; j++){
                if(num1[i] == num2[j]){
                    ans[i] = num1[i];
//                    System.out.println(" num : " + ans[i]);
                }
            }
        }

//        number with intersection
        for(int i = 0; i< ans.length ; i++){
//            System.out.println(" ,"+ ans[i] );
            for(int j = i+1; j< ans.length ; j++){
                if(ans[i] == ans[j]){
                    unique[i] = ans[i];
                    break;
                }
            }
        }



//        print unique values
        System.out.println("unique____________");
        for(int i = 0; i< ans.length ; i++){
            if(unique[i]>0){
                System.out.println(" ,"+ unique[i] );
            }

        }


    }

}
