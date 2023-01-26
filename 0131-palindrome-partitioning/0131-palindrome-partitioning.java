class Solution {
     List<List<String>> res = new ArrayList<>();
    
    public List<List<String>> partition(String s) {
        backtrack(0, s, new ArrayList<>());
        return res;
    }

    private void backtrack(int i, String s, ArrayList<String> substrings) {
        // base case
        if(i == s.length()) {
            res.add(new ArrayList<>(substrings));
            return;
        }
        
        for(int j = i; j < s.length(); j++) {
            String sub = s.substring(i, j + 1);
            if(isPalindrome(sub)) {
                substrings.add(sub);
                backtrack(j + 1, s, substrings);
                substrings.remove(substrings.size() - 1);
            }
        }
        
    }

    private boolean isPalindrome(String s) {
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}