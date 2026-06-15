class Solution {
    public int[] plusOne(int[] digits) {
        int sizeofn = digits.length;
        int[] newarr = new int[sizeofn+1];
        for(int i=sizeofn-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        newarr[0]=1;
        return newarr;

        
    }
}