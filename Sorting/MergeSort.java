import java.util.Arrays;

public class MergeSort{
    public static int[] mergeSort(int arr[]){
        if(arr.length<=1){
            return arr;
        }
        int mid = arr.length/2;
        int leftarray[] = Arrays.copyOfRange(arr, 0, mid);
        int rightarray[] = Arrays.copyOfRange(arr, mid, arr.length);

        int sortedleftarray[] = mergeSort(leftarray);
        int sortedrightarray[] = mergeSort(rightarray);

        return merge(sortedleftarray,sortedrightarray);
    }
    public static int[] merge(int left[],int right[]){
        int result[] = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                result[k++] = left[i++];
            }else{
                result[k++] = right[j++];
            }
        }
        while(i<left.length){
            result[k++] = left[i++];
        }
        while(j<right.length){
            result[k++] = right[j++];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,2,9,1,7,4,5,};
        int result[] = mergeSort(arr);
        for(int var : result){
            System.out.print(var+" ");
        }
    }
}