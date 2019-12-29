class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb=new StringBuilder();
        int carry = 0;
        
        while(a.length() != b.length()){
            if(a.length()<b.length()){
                a = "0"+ a;
            }else{
                b = "0" + b;
            } 
        }
               
        char[] arraya = a.toCharArray();
        char[] arrayb = b.toCharArray();
        
        for(int i=arraya.length-1;i>=0;i--){
            int x = arraya[i] - '0';
            int y = arrayb[i] - '0';
            int temp = x + y + carry;
            if(temp>=2){
               carry = 1;
               sb.append(temp-2);
            }else{
               sb.append(temp);
               carry = 0;
            }
        }
        
        if(carry == 1){
            sb.append("1");
        }
        
        return sb.reverse().toString();
}
}
