
public class Binarysearch {
    public static void main(String[] args) {
        int []arr= { -1,0, 3,4,7};
        int low=0;
        int target =6;
        int high= arr.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]== target){
                System.out.println(mid);
                return;
            }
            else if(target>arr[mid]){
                low= mid+1;
            }
            else{
                high= mid-1;
            }
        }
        System.out.println(-1);
    }
}
