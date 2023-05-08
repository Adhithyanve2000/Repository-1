package AssistedProject2;

import java.util.Scanner;

public class VerificationEmail 
{
	public static void main(String[] args) {
	    String[] emailIDs = { "john@example.com", "jane@example.com", "bob@example.com", "alice@example.com" };
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter email ID to search: ");
	    String searchEmailID = scanner.nextLine();
	    
	    boolean found = false;
	    
	    for (String emailID : emailIDs) {
	      if (emailID.equals(searchEmailID)) {
	        found = true;
	        break;
	      }
	    }
	    
	    if (found) {
	      System.out.println("Email ID found.");
	    } else {
	      System.out.println("Email ID not found.");
	    }
	  }
	}