public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        int ans = linearSearch(arr,target);
        if(ans != -1){
            System.out.println("Element found at index " + ans);
        }else
            System.out.println("Element not found");
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}