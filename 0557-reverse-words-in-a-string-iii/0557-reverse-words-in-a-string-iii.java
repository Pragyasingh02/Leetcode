class Solution {
    public String reverseWords(String s) {
        StringBuilder st = new StringBuilder();
        String [] StringArr = s.split(" ");
        for (int i = 0; i < StringArr.length; i++) {
             char [] a = StringArr[i].toCharArray();
             int aLength = a.length-1;
             while (aLength>=0){
                 st.append(a[aLength--]);
             }
             st.append(" ");
        }
        return st.toString().trim();

    }
}