class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        int leftEnd = word1.length();
        int rightEnd = word2.length();
    
        while(left < leftEnd && right < rightEnd){
            sb.append(word1.charAt(left++));
            sb.append(word2.charAt(right++));
        }

        if(rightEnd > leftEnd){
            sb.append(word2.substring(right));
        }

        if(leftEnd > rightEnd)
           sb.append(word1.substring(left));
        
        return sb.toString();


        
    }
}