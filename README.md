# PracticaCalificada3
#  Prueba 1
   Precondición: nums != null && nums.length>0

   Postcondición: el valor de retorno es  el número de clumps en el arreglo.

   El programa devuelve 0 si se viola alguna pre-condición.

   La firma del método es el siguiente  int countClumps(int[] nums)

   Realicé el siguiente código donde podemos observar la precondición dentro de la estructura condicional if-else dentro del
   método, también se puede observar lo que devuelve si cumple o no la precondicion, lo cual seria la postcondición, de la
   siguiente manera:

     public static int countClumps(int[] nums) {
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

   Al estar presente el método countClumps dentro de la misma clase que pertence el método main, se observar rapidamente la precondicion 
   y el resultado.

      public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5,4,4,4,4};
        System.out.println(countClumps(array));

    }

   Al ejecutar el resultado es : 2

    
  #  Pregunta 1 

  Escriberé una implementación del problema dado. Supongamos que decidimos no mirar los requisitos.
  Para ello separamos el codigo en paquete y clases.
  
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

Y vemos los resultado en la siguiente clase:

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
El resultado es :

  3
  1
  0
  0
  0

#  Pregunta 2

 El codigo es relativamente sencillo de entender, ver el codigo y ejecutarlo por favor.

 
#  Pregunta 3

La explicación se muestra en un archivo pdf.
  
    
      
