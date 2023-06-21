package ejemplo;

public class P2 {
    /*
    Precondición: nums != null && nums.length>0

    Postcondición: el valor de retorno es  el número de clumps en el arreglo.

    El programa devuelve 0 si se viola alguna pre-condición.

     */
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
