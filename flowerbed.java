import java.util.*;
public class flowerbed {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println(" enter the number of flower to be planted");

        int n= sc.nextInt();
        int []arr={1,0,0,0,1};
        boolean result= flowerbed(arr,n);
        System.out.println(result);

    }
    static public boolean flowerbed(int []arr, int n){
        int k= arr.length;
        int count=0;
        if(n==0)return  true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0&&(i==0||arr[i-1]==0)&&( k==0||arr[i+1]==0)){
                //return true;
                count++;
                if(count==n){
                    return true;
                }
                i++;
            }
        }
        return false;
    }

}
