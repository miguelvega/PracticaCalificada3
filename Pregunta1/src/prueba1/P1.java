package prueba1;

public class P1 {

    public int countClumps(int[] nums) {
        if (nums != null && nums.length>0) {
            int contgrup=0;
            boolean flag = true;
            for (int i=1;i<nums.length;i++){
                if (nums[i-1]==nums[i] ){
                    if(flag) contgrup++; //{1,1,1,2,2,3,4,5,4,4,4,4};
                    flag=false;
                }
                else {
                    flag = true;
                }
            }
            return contgrup;
        } else {
            return 0;
        }
    }
}

