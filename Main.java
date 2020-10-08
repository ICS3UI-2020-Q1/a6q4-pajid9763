import java.util.Scanner;
/**
 * program that calculates dot product
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double vectors1[] = new double[3];
    double vectors2[] = new double [3];

    // ask the user for 3 numbers for vector 1
    System.out.println("Please enter the 3 values for the first vector");
    for (int i = 0; i < vectors1.length; i++){
      vectors1[i] = input.nextDouble();
    }
    
    // ask the user for 3 numbers for vector 2
    System.out.println("Please enter the 3 values for the second vector");
    for (int i = 0; i < vectors2.length; i++){
      vectors2[i] = input.nextDouble();
    }

    int total = 0;

    // find the sum
    for (int i = 0; i < vectors1.length; i++){
      double sum = vectors1[i] * vectors2[i];
      total += sum;
    }
    System.out.println("The dot product is " + total);
  }
}
