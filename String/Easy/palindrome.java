package Easy;
class palindrome{
        public static boolean IsPalindrome(String mystring){
                for(int i=0;i<mystring.length()/2;i++){
                        if(mystring.charAt(i)!=mystring.charAt(mystring.length()-1-i)){
                               return false;
                        }
                }
                return true;
        }
        public static void main(String[] args) {
               System.out.println(IsPalindrome("abba"));
        }
}
