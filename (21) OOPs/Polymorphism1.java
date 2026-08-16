
public class Polymorphism1 {

    public static void main(String[] args) {
        Calculator ans = new Calculator();
        System.out.println(ans.sum((float)2.2, (float)2.2));
    }
}
// Method Overloading or, Compile Time Polymorphism or, Static Polymorphism
class Calculator {

    int sum(int a, int b) {
        int total = a + b;
        return total;
    }

    float sum(float a, float b) {
        float total = a + b;
        return total;
    }

    int sum(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }
}
