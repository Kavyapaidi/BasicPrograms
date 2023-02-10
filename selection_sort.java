import java.util.*;
public class selection_sort {
    //find max element and swap with last element
    //last position is correct and ignore in future steps
    static void selection(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-1-i;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end)
    {
        int max=start;
        for(int i=0;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
