public class Anagram {
    public static void main(String[] args) {
        
        String word1 = "abcd";
        String word2 = "dcgA";

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();


        int [] freq = new int[26];

        if(word1.length() != word2.length()){
            System.out.println("Not anagrams");
        }


        for(int i = 0 ; i < word1.length() ; i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);


            freq[c1 - 'a'] += 1;
            freq[c2 - 'a'] -= 1;
        }
         
        boolean isAnagram = true;

        for(int i = 0 ; i < 26 ; i++){
            if(freq[i] != 0){
                isAnagram = false;
                System.out.println("Not anagrams");
            }

        }


        if(isAnagram)
        System.out.println("Anagrams");

        
    }
    
}
