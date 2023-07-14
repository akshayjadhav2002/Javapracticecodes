import java.sql.SQLOutput;

public class Arraypractice {
    public static void main(String[] args) {
        //PP1
      /*float a [] = new float [] {1.1f,1.2f,1.3f,1.4f,1.5f};
      float b = 0;
      for (float value:a){
          b = b + value;
          System.out.println(b);
      }
       */
        //PP2
        /*int A [] = {1,2,3,4,5};
        int value = 2;
        boolean isInArray = false;
        for (int elements:A){
            if(value==elements) {
            isInArray = true;
           break; }

        }
        if(isInArray ){
            System.out.println("The Value is Present in Array");
        }
        else{
            System.out.println("The Value is not Present in Array ");
            }*/
        //PP3
        /*float a[] = new float[]{1.1f, 1.2f, 1.3f, 1.4f, 1.5f};
        float sum = 0;
        for (float value : a) {
            sum = sum + value;
            System.out.println("The average of marks is " +sum/a.length);
        }*/
        //PP4
       /* int matrix[][] = {{ 2,3,4},
                            {5,6,7}};
        int matrix1 [][] = { { 1,3,5},
                            {6,8,10}};
        for (int i=0;i<matrix.length;i++ ){
            for( int j = 0;j< matrix1.length;j++){
                System.out.print("Setting value for i=%d and j=%d\n"+i+j);
                 result[i] [j] = matrix [i] [j] + matrix [i] [j];
            }

        }*/
        //PP5
        // Reverse the given Array
       /* int a [] = new int []{2,3,4,5,6,7};
        for (int i = 0; i < a.length; i++ ){
            int temp = a[i];
             a[i]= a [a.length- i-1];
            a [a.length- i-1] = temp;
            System.out.print(a[i]);
        }

        for( int element: a){
            System.out.print(element + " ");
        }*/
        //PP6
       /* int a [] = new int []{2,3,4,5,6,7};
        int max = 0;
        for ( int e:a){
             if( e > max){
                 max = e;
             }
        }
        System.out.print("The maximum element of Array is " + max);*/
 

    }
}


