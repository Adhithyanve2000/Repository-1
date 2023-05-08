package AssistedPractice8;

public class Stringbuffandbuild {
	    public static void main(String[] args) {
	        // Creates a string
	        String str = "Hello, World!";

	        // Converts the string to StringBuffer
	        StringBuffer stringBuffer = new StringBuffer(str);

	        // Converts the string to StringBuilder
	        StringBuilder stringBuilder = new StringBuilder(str);

	        // Displays the original string and the converted versions
	        System.out.println("Original string: " + str);
	        System.out.println("StringBuffer version: " + stringBuffer);
	        System.out.println("StringBuilder version: " + stringBuilder);
	    }
	}

