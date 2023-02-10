public class Reverse_string {
        public static void main (String[] args) {

            String str= "Geeks", nstr="";
            char ch;

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                nstr= ch+nstr;//**
            }
            System.out.println("Reversed word: "+ nstr);
        }
    }
