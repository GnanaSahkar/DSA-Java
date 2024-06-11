package Tests;
import java.util.*;

public class TargetNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target:");
        int target = sc.nextInt();
        int [] arr = {3,2,4};
        int [] result = twoSum(arr,target);
        System.out.println(result[0]+"  "+result[1]);
    }
    public static int[] twoSum(int[]arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int[] result =  {-1,-1};
        while(left<right){
            int Csum = arr[left]+arr[right];
            if(Csum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                break;
            }
            else if(Csum<target){
                left++;
            }
            else {
                right--;
            }
            
        }
        return result;
    }
}
