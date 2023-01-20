class test2{
        public static String Helper(String str){
                int max=0;
               char Myarray[]=str.toCharArray();
               int counter[]=new int[26]; 
               for(int i=0;i<str.length();i++){
                        char current_char=Myarray[i];
                        int index=current_char-'a';
                        counter[index]++;
               }
               for(int i=0;i<Myarray.length;i++){
                        char current_char=Myarray[i];
                        max=Math.max(max, counter[current_char-'a']);
               }
               for(int i=0;i<Myarray.length;i++){
                        char current_char=Myarray[i];
                        if(counter[current_char-'a']==max){
                                return Character.toString(current_char);
                        }
               }
               return "";
        }
        public static void main(String[] args) {
               String str="java";
               System.out.println(Helper(str));
        }
}