package Sort;

public class Quick {

    public static int partition(int arr[],int low,int high){
        //choosing last element
        int pivot=arr[high];
        int i=low-1;
        //traversing array
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swapping
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            //now we want one more space for pivot because it is in end 
            //so bring it before the high element .....we will do swap
            
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
       
        
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);

            //for elements smaller than pivot
            quicksort(arr, low, pidx-1);
            //for elements larger tan pivot
            quicksort(arr, pidx+1, high);
        }

    }
    public static void main(String[] args) {
        int [] arr={6,3,9,5,2,8};
        int n=arr.length;
        quicksort(arr, 0, n-1);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
