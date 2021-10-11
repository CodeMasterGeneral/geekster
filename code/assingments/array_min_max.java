public class array_min_max {
    public static void main(String[] args) {

        int[] x = {18,6,31,7,9,12,78,34,11,13,44};

        int min=x[0],max=x[0];

        for(int i=0; i<x.length;i++){
            if(min>x[i]){
                min=x[i];
            }
            if(max<x[i]){
                max=x[i];
            }
        }

        System.out.println("max: "+max);
        System.out.println("min : " + min);
    }
}
