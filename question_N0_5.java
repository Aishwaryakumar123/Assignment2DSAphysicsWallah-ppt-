import java.util.*;
public class question_N0_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int []arr= { 1,5,4,3,};
        int n=arr.length;
        Arrays.sort(arr);
        int result=0;
        result= Math.max(arr[0]*arr[1]*arr[n-1],arr[n-1]*arr[n-2]*arr[n-3]);
        System.out.println(result);
    }
}
