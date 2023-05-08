package AssistedPractice4;

public class Person {

	  private String name;
	    private int age;
	    private String gender;
	    
	 
	    //default constructor 
	    public Person() {
	        this.name = "John Doe";
	        this.age = 30;
	        this.gender = "Male";
	    }
	    
	   
	    //parameterized constructor 
	    public Person(String name, int age, String gender) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	    }
	    
	  
	  //copy constructor  
	    public Person(Person other) {
	        this.name = other.name;
	        this.age = other.age;
	        this.gender = other.gender;
	    }
	    
	  
	    public String getName() {
	        return name;
	    }
	    
	    public int getAge() {
	        return age;
	    }
	    
	    public String getGender() {
	        return gender;
	    }
	    
	    public static void main(String[] args) {

	        Person johnDoe = new Person();
	        Person janeDoe = new Person("Jane Doe", 25, "Female");
	        Person copyOfJohnDoe = new Person(johnDoe);
	        
	        System.out.println("John Doe: " + johnDoe.getName() + ", " + johnDoe.getAge() + ", " + johnDoe.getGender());
	        System.out.println("Jane Doe: " + janeDoe.getName() + ", " + janeDoe.getAge() + ", " + janeDoe.getGender());
	        System.out.println("Copy of John Doe: " + copyOfJohnDoe.getName() + ", " + copyOfJohnDoe.getAge() + ", " + copyOfJohnDoe.getGender());
	    }
	}