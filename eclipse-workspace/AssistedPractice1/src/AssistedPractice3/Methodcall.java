package AssistedPractice3;

public class Methodcall {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

   
    public static double divide(double a, double b) {
        double result = a / b;
        return result;
    }


    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
	public static void main(String[] args) {
	        int result = add(6, 10);
	        System.out.println("The sum is: " + result);

	        double a = 12, b = 3.5;
	        double divisionResult = divide(a, b); 
	        System.out.println("The division is: " + divisionResult);

	        String str = "Yahoo";
	        String reversedString = reverse(str); 
	        System.out.println("The reversed string is: " + reversedString);
	    }


	
	}

