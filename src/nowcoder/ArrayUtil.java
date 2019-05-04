package nowcoder;

import java.util.Arrays;

public class ArrayUtil {
    public static int[] genetateRandomArray(int size, int value) {
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random()) - (int) (value * Math.random());
        }
        return arr;
    }

    private static int[] bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    private static int[] rightMethod(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int testtime = 500;
        int size = 100;
        int value = 100;
        boolean succeed = true;
        for (int i = 0; i < testtime; i++) {
            int[] arr1 = genetateRandomArray(size, value);
            int[] arr2 = arr1.clone();
            bubbleSort(arr1);
            rightMethod(arr2);
            if (!isEqual(arr1,arr2)){
                succeed = false;
                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2));
                break;
            }
//            System.out.println(succeed ? "NICE" : "Opps");
        }
    }



    public  static boolean isEqual(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
