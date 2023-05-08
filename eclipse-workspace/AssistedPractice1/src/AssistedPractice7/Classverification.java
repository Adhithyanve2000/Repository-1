package AssistedPractice7;
//outer class
public class Classverification {
	    private int x = 17;

	    // Inner class
	    class InnerClass {
	        public int getOuterX() {
	            return x;
	        }
	    }

	    public static void main(String[] args) {
	        // Creating an instance of the OuterClass
	    	Classverification outerObject = new Classverification();

	        // Creating an instance of the InnerClass
	        InnerClass innerObject = outerObject.new InnerClass();

	        // Accessing the getOuterX() method of the InnerClass to retrieve the value of x from the OuterClass
	        System.out.println("Value of x from innerObject: " + innerObject.getOuterX());
	    }
	}


