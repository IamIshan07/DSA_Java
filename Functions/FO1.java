public class FO1{
    public static int Sum(int a, int b){
        return a+b;
    }
    public static int Sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        System.err.println("Sum od 2 numbers is : "+Sum(a, b));
        System.err.println("Sum od 3 numbers is : "+Sum(a, b, c));
        System.err.println("Sum od 2 numbers is : "+Sum(3, 3));
        System.err.println("Sum od 3 numbers is : "+Sum(3, 3, 3));
    }
}