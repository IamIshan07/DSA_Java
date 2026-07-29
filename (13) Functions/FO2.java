public class FO2{
    public static int Sum(int a, int b){
        return a+b;
    }
    public static float  Sum(float  a, float  b){
        return a+b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        float c = 10.2f;
        float d = 10.2f;
        System.err.println("Sum of int values is : "+Sum(a, b));
        System.err.println("Sum of int values is : "+Sum(c, d));
    }
}