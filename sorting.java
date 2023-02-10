import java.util.Arrays;
//Basic Sorting
public class sorting {
    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,3,1,7,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
