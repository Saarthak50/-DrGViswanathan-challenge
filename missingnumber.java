class missingnum{
    public int  missingnumber(int[] nums){

        int n = nums.length;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        for(int num:nums){
            actualSum+=num;
        }
        return  expectedSum-actualSum;
    }
}

public class missingnumber{
      public static void main(String[] args) {
        int[] nums = {2,4,1,0};

        missingnum ans= new missingnum();
        int result = ans.missingnumber(nums);
        System.out.println("missing no is  : " + result);
    }
}