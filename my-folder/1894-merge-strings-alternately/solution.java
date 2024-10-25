class Solution {
    public String mergeAlternately(String word1, String word2) {
        // String word3;
        int len=word1.length()+word2.length();
        char[] word3=new char[len];
        if(word1.length()>word2.length()){
            for(int i=0;i<word2.length();i++){
                word3[i*2]=word1.charAt(i);
                word3[i*2+1]=word2.charAt(i);
            }
            for(int i=word2.length()*2;i<len;i++){
                word3[i]=word1.charAt(i-word2.length());
            }
        }else if(word1.length()<word2.length()){
            for(int i=0;i<word1.length();i++){
                word3[i*2]=word1.charAt(i);
                word3[i*2+1]=word2.charAt(i);
            }
            for(int i=word1.length()*2;i<len;i++){
                word3[i]=word2.charAt(i-word1.length());
            }
        }else{
             for(int i=0;i<word1.length();i++){
                word3[i*2]=word1.charAt(i);
                word3[i*2+1]=word2.charAt(i);
            }
        }
        return new String(word3);
    }
}
