class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";

        for(int i=2;i<=n;i++){
            StringBuilder temp = new StringBuilder();

            for(int j=s.length()-1;j>=0;j--){
            temp.append(s.charAt(j) == '0' ? '1' : '0');
            }

            s=s+"1"+temp.toString();
        }

        return s.charAt(k-1);
        
    }
}