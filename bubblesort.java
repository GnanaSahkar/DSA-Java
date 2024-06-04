public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {-1,0,9,11,18};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){     // < asscending Order > desscending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
