package project;

public class Typecast1 {
	public static void main(String[] args) {
        // Implicit type casting
        int x = 10;
        double y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // explicit type casting
        double a = 3.14;
        int b = (int) a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

