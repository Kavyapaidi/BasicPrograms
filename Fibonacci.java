public class Fibonacci {//0,1,2,3,4,5=n
    static int fib(int n)//0,1,1,2,3,5=fib
    {
        if(n<2)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        //System.out.println(fib(5));
        int n=5;//first n fibonacci numbers
        for(int i=0;i<n;i++)
            System.out.print(fib(i)+" ");
    }
}
