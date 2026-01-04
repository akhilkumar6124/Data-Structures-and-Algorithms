public class MergeSort{
    public static void mergeSort(int arr[]){
        int length = arr.length;
        if(length<=1) return;
        int middle = length/2;
        int leftarray[] = new int[middle];
        int rightarray[] = new int[length - middle];
        int leftindex=0;
        int rightindex=0;
        for(int i=0; i<length;i++){
            if(i<middle){
                leftarray[leftindex++] = arr[i];
            }else{
                rightarray[rightindex++] = arr[i];
            }
        }
        mergeSort(leftarray);
        mergeSort(rightarray);
        merge(leftarray, rightarray, arr);
    }
    public static void merge(int[] leftarray, int[] rightarray, int[] arr){
        int leftsize = leftarray.length;
        int rightsize = rightarray.length;
        int i=0,l=0,r=0;
        while(l<leftsize && r<rightsize){
            if(leftarray[l]<rightarray[r]){
                arr[i] = leftarray[l];
                i++;
                l++;
            }else{
                arr[i] = rightarray[r];
                i++;
                r++;
            }
        }
        while(l<leftsize){
            arr[i] = leftarray[l];
            i++;
            l++;
        }
        while(r<rightsize){
            arr[i] = rightarray[r];
            i++;
            r++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,2,9,1,7,4,5,};
        mergeSort(arr);
        for(int var : arr){
            System.out.print(var+" ");
        }
    }
}