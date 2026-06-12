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

class Solution2 {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}