class ArmstrongNumber {
    static int sum=0;
    static boolean isArmstrong(int n)
    {
        int temp=n;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==temp)
            return true;
        return false;
    }
    public static void main(String[] args){

        System.out.println(isArmstrong(153));
    }
}
