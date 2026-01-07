class Calculator {

    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: " + calc.add(10, 20));
        System.out.println("Addition of 3 integers: " + calc.add(10, 20, 30));
        System.out.println("Addition of 2 doubles: " + calc.add(10.5, 20.3));
    }
}
