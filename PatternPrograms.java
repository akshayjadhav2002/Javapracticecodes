import java.util.Scanner;

public class PatternPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns");
        int n = sc.nextInt();
        //Pattern 1
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if(j==0||j==n-1||i==(n-1)/2){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //--------------------------------------------------------
        //Pattern 2
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if(i==0&&j>0&&j<(n-1)/2||j==0&& i>0||i==(n-1)/2&&j<=(n-1)/2||j==(n-1)/2 && i>0){
//                    System.out.print("*");
//               }
//               else{
//                    System.out.print(" ");
//                }
//           }
//            System.out.println();
//        }
        //-----------------------------------------------------------
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//               if(i==0&&j<(n-1)/2||j==0||i==n-1&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<n-1){
//                    System.out.print("*");
//               }
//             else{
//                   System.out.print(" ");
//                }
//          }
//          System.out.println();
//       }

    }
}
