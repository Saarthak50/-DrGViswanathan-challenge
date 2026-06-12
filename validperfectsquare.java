class Solution{ //approach 1 .
    public boolean isPerfectSquare(int num) {
        int odd =1 ;
        while(num>0){
            num = num - odd;
            odd+=2; 
        }
        return num==0;
    }
}
