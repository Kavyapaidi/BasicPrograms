public class sumofdigits {
    static int sum=0;
    static int sum(int n)
    {
        while(n!=0)
        {
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(456));
    }
}
