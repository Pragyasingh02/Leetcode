class Solution {
    public String fractionAddition(String expression) {
        List<Integer> num = new ArrayList<>();
        List<Integer> denom = new ArrayList<>();
        List<String> ope_ope_no_mi = new ArrayList<>();
        int n = expression.length();
        if(expression.charAt(0)!='-'){
            ope_ope_no_mi.add("+");
        }
        for(int i=0;i<n;i++){
            if(expression.charAt(i)=='-' || expression.charAt(i)=='+'){
                ope_ope_no_mi.add(expression.charAt(i)+"");
            }
        }
        expression = expression.replace('+','.');
        expression = expression.replace('-','.');
        String[] fraction = expression.split("\\.");
        for(String i: fraction){
            if(i.length()>1){
                String[] frac = i.split("/");
                num.add(Integer.valueOf(frac[0]));
                denom.add(Integer.valueOf(frac[1]));
            }
        }
        n = num.size();
        // System.out.println(num);
        // System.out.println(denom);
        // System.out.println(ope_ope_no_mi);
        // System.out.print(lcm(denom, 0)+ "\n");
        int denominator = lcm(denom,0);
        int numerator = 0;
        for(int i=0;i<n;i++){
            if(ope_ope_no_mi.get(i).equals("+")){
                numerator += num.get(i)*(denominator/denom.get(i));
            }else{
                numerator -= num.get(i)*(denominator/denom.get(i));
            }
        }
        
        int div = gcd(numerator,denominator);
        numerator /= div;
        denominator /= div;
        String sign = "";
        
        if(numerator<0 && denominator>0){
             numerator *=-1;
            sign = "-";
        }
        if(numerator>0 && denominator<0){
             denominator *= -1;
            sign = "-";
        }
        return sign+String.valueOf(numerator)+"/"+String.valueOf(denominator);
    }
    
    public int gcd(int a, int b) { 
        return b == 0? a:gcd(b, a % b);    
    }
    
    public int lcm(List<Integer> arr, int idx){
        if (idx == arr.size()- 1){
            return arr.get(idx);
        }
        int a = arr.get(idx);
        int b = lcm(arr, idx+1);
    return (a*b/gcd(a,b)); //
  }
}