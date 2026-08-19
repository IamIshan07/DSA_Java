/*
Question 1 : Print the sum, difference and product of two complex numbers by creating a
class named 'Complex' with separate methods for each operation whose real and imaginary
parts are entered by the user.
 */

import java.util.Scanner;

public class PQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part for complex number 1 : ");
        int real1 = sc.nextInt();
        System.out.print("Enter imaginary part for complex number 1 : ");
        int imag1 = sc.nextInt();

        Complex a = new Complex(real1, imag1);

        System.out.print("Enter real part for complex number 2 : ");
        int real2 = sc.nextInt();
        System.out.print("Enter imaginary part for complex number 2 : ");
        int imag2 = sc.nextInt();

        Complex b = new Complex(real2, imag2);

        Complex c = Complex.add(a, b);
        Complex d = Complex.diff(a, b);
        Complex e = Complex.multi(a, b);

        c.print();
        d.print();
        e.print();

    }
}

class Complex {

    int real;
    int imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public static Complex add(Complex a, Complex b) {
        // return new Complex(a.real + b.real, a.imag + b.imag);

        Complex c = new Complex(a.real + b.real, a.imag + b.imag);

        return c;
    }

    public static Complex diff(Complex a, Complex b) {

        Complex c = new Complex(a.real - b.real, a.imag - b.imag);

        return c;
    }

    public static Complex multi(Complex a, Complex b) {
        Complex c = new Complex((a.real * b.real) - (a.imag * b.imag), (a.real * b.imag) + (a.imag * b.real));

        return c;
    }

    public void print() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }

}
