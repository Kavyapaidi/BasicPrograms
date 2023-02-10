public class Palindrome {
    public static void main(String[] args) {
        int sum=0,num=12321;
        int temp=num;
        while(num!=0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if(temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("not palindrome");
}
}
