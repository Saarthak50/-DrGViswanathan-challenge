class BasicSolution{
    static int addDigits(int num){
        int sum = 0;
        int sum2=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num = num/10;
            
        }
        while(sum!=0){
                int sumdigit=sum%10;
                sum2 += sumdigit;
                sum = sum/10;
            }
        return sum2;
    }

    class Solution{
        static int addDigits2(int num) {
        while (num >= 10) {  // more than one digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
    }
    public static void main(String[] args) {
        int num=199;
        int ans =addDigits2(num);
        System.out.println(ans);
    }
}