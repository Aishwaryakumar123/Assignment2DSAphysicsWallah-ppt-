import java.util.*;
public class candyProblem {
    public static void main(String[] args) {
        int result=0;

        int []arr= {1,1,2,2,3,3};
        int n= arr.length;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
         result=Math.min(hs.size(),n/2 );
        System.out.println(result);

    }
}
