public class ternary {
    public static void main(String[] args) {
        int a;
        int b;
        a= 100;
        b= 40;
        int c= 10;
        int result =(a<=b)?a:b;//syntax for ternary operator Datatype variablename = (condition)? if true print this  :if false condition to print
        System.out.println(result);
        int num = (a<b)?(a<c? a:b) :(b<c? b:c) ;
        System.out.println(num);
    }
}
