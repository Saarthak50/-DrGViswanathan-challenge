class Solution {
    // static boolean isPalidrome(int x){
    //     if(x<0){
    //         return false;
    //     }
    //     int original =x;
    //     int revNo=0;
    //     while(x!=0){
    //         int digit = x%10;
    //         revNo=revNo*10+digit;
    //         x=x/10;
    //     }
    //     return revNo==original;
    // }

    //better solutiom
    static boolean isPali(int x){
        if(x<0 || (x%10==0) && x!=0){
            return false;
        }
        int revHalf=0;
        while(x>revHalf){
            revHalf=revHalf*10 + x%10;
            x/=10;
        }
        return x==revHalf || x==revHalf/10;
    }
    public static void main(String[] args) {
        System.out.println(isPali(12321));
    }
    
}
