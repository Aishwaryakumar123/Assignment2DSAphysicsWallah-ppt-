import java.util.Arrays;

public class partition_OfArray {
    public static void main(String[] args) {
        int []arr={ 1,4,3,2};;;;;;;;

        Arrays.sort(arr);
        int max=0;
        for(int i=0; i<arr.length; i+=2){
            max+=arr[i];
        }
        System.out.println(max);

    }
}
