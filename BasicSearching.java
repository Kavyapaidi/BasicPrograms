import java.util.Scanner;

public class BasicSearching {
    static boolean search(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key;
        System.out.print("Enter key:");
        key=sc.nextInt();
        System.out.println(search(arr,key));
    }
}
