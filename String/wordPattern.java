class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        

        if (pattern.length() != words.length) {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            int firstCharIndex = pattern.indexOf(c);
            
            int firstWordIndex = findFirstWordIndex(words, word);
            
            if (firstCharIndex != firstWordIndex) {
                return false;
            }
        }
        
        return true;
    }
    
    private int findFirstWordIndex(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
