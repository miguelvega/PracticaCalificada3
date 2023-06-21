package pregunta1;

import prueba1.P1;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,1,2,2,3,6,5,4,4,4};
        int[] array2 = {1,1,1,1,1,1,1,1};
        int[] array3 = {1,2,3,4,5,6,7};
        int[] array4 = {};
        int[] array5 = null;
         P1 p1= new P1();
        System.out.println(p1.countClumps(array1));
        System.out.println(p1.countClumps(array2));
        System.out.println(p1.countClumps(array3));
        System.out.println(p1.countClumps(array4));
        System.out.println(p1.countClumps(array5));


    }
}