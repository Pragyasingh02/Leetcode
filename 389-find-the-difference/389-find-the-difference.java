class Solution {
    public char findTheDifference(String s, String t) {
       char[] sorteds=s.toCharArray();
       char[] sortedt=t.toCharArray(); 
        Arrays.sort(sorteds);
        Arrays.sort(sortedt);
        for(int i=0;i<s.length();i++){
            if(sorteds[i]!=sortedt[i]){
                return sortedt[i];
            }
        }
        return sortedt[s.length()];
    }
}