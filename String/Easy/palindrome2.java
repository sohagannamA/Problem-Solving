/*

                                                                Problem Statement
                                                              ---------------------
                                                              
                                                              
       Problem id   : 680
       
       Problem name : Valid Palindrome II
       
       Problem Info : Given a string s, return true if the s can be palindrome after deleting at most one character from it.
       
                                                            
                                                            
                                                                Problem TestCase
                                                              --------------------
                                                            
        
        Example 1 :
                
                Input: s = "aba"
                Output: true
                
        Example 2 :
        
                Input: s = "abc"
                Output: false
                
        Example 3 : 
        
                Input: s = "abca"
                Output: true
                Explanation: You could delete the character 'c'.
                                                            
                                                              
                                                              

*/




class palindrome2{
        public static boolean IsPalindrome(String str, int i,int j){
            while(i<j){
              if(str.charAt(i)==str.charAt(j)){
                    i++;
                    j++;
              }
              else{
                    return false;
              }
            }
            return true;
        }
        public static boolean validPalindrome(String s){
              int i=0;
              int j=s.length()-1;
              while(i<j){
                    if(s.charAt(i)==s.charAt(j)){
                          i++;
                          j--;
                    }
                    else{
                          return IsPalindrome(s, i+1, j) || IsPalindrome(s, i, j-1);
                    }
              }
              return true;
        }
        public static void main(String[] args) {
              System.out.println(validPalindrome("abca"));
        }
  }
