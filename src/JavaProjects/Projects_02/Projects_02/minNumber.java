package JavaProjects.Projects_02.Projects_02;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */


    public static void main(String[] args) {
          /*
        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan

      */

        int array[][] =  {{1,2,3}, {2,3,1} , {5,5,-5} , {2,1,3}};
        int minNum = Integer.MAX_VALUE;

        for (int[] arr: array){
            for (int each:arr){
                if (each<minNum){
                    minNum=each;
                }
            }
        }
        System.out.println(minNum);
    }

}
