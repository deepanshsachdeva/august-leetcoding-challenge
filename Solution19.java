class Solution {
    public String toGoatLatin(String S) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        String goat = "";
        int i = 0, j = 0;
        
        for (String word : S.split("\\s")) {
            goat += (vowels.contains(word.charAt(0)) ? word : word.substring(1) + word.charAt(0)) + "ma";
            for (j = 0, ++i; j < i; ++j) {
                goat += "a";
            }
            
            goat += " ";
        };
        
        return goat.trim();
    }
}
