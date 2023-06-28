import java.util.*;
public class monotonicArray {
    public static void main(String[] args) {
        int []arr= { 6,5,4,3,2,1};;;;;;
        boolean result= increasing(arr)||decreasing(arr);
        System.out.println(result);
    }
    static public boolean increasing(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }

        }
        return true;
    }
    static public boolean decreasing(int []arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                return false;
            }

        }
        return true;
    }
}
