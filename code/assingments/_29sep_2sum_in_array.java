public class _29sep_2sum_in_array {
    public static void main(String[] args) {

        int[] arr = {4,5,3,3,5,2,1,0,6};
        int target = 8;
        for(int i = 0; i<arr.length; i++){
            for(int j=i+1;j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println(arr[i] + " + "+ arr[j]);
                }
            }
            System.out.println();
        }
    }
}
