package JavaProjects.Projects_02.Projects_02;

public class maxNumber {


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden max number print et

     */


    public static void main(String[] args) {

     /*
        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan

      */

        int array[][] =  {{1,2,3}, {2,3,1} , {50,5,5} , {2,10,3}};

        int maxNum= Integer.MIN_VALUE;

        for (int[] arr:array){
            for (int each:arr){
                if (each>maxNum){
                    maxNum = each;
                }
            }
        }
        System.out.println(maxNum);

    }

}
