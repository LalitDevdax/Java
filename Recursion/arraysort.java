package Recursion;

public class arraysort {
    public static boolean isSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        // if(arr[index]<arr[index+1]){
        //     //array is sorted till now
        //     return isSorted(arr, index+1);
        // }else{
        //     return false;
        // }

        //opposite way

        if(arr[index]>=arr[index+1]){
                //array is unsorted till now
                return false;
        }
        return isSorted(arr, index+1);

    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        System.out.println(isSorted(arr, 0));
    }

}