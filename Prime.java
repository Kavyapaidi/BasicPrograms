public class Prime {//1 means prime,0 means not a prime
        static int prime(int n)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                    return 0;
            }
            return 1;
        }
        public static void main(String[] args) {
            System.out.println(prime(10));
        }
    }

