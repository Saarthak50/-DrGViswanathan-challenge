class factorialtrailingZeros{
    static int trailingZeros(int n){
        int count =0 ;
        //logic is no of multiples of 5 will return trailing zeros
        while(n>0){
            n/=5;
            count += n;
        }
        return count;
    }
    public static void main(String[] args) {
        int n =8;
        System.out.println(trailingZeros(n));
    }
}
