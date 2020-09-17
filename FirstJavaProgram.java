import java.util.Scanner;

public class FirstJavaProgram {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    while (!input.hasNextInt( )) {
      input.nextLine( );
      System.out.print("Invalid integer; please enter an integer: ");
    }

    int i = input.nextInt( );
    System.out.println("This is my first program in java " + i );
  }//End of main
}//End of FirstJavaProgram Class