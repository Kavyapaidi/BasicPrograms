public class string1 {
    //search character in a string
        static boolean search(String str,char target)
        {
            for(int i=0;i<str.length();i++)
            {
                if(target==str.charAt(i))
                    return true;
            }
            return false;
        }
        public static void main(String[] args) {
            String str="kunal";
            char target='s';
            System.out.println(search(str,target));
        }
}
