class Main {
  public static void main(String[] args) {

    // This program gives a letter grade for a mark out of 10
    int mark = 6; // sets mark to 6

    if (mark < 5) { // checks if mark is less than 5
      System.out.println("Sorry, you got an F, please try again");
    }

    else if (mark < 6) { // checks if mark is less than 6
      System.out.println("You got a D");
    }

    else if (mark < 7) { // checks if mark is less than 7
      System.out.println("You got a C");
    } 
    
        else if (mark<8){ // checks if mark is less than 8
      System.out.println("You got a B");
    }
    
    else if (mark<=10){ // checks if mark is less than or equal to 10
      System.out.println("You gota A");
    }

    else { // else statement
      System.out.println("The number you entered is invalid");
    }
  }
}