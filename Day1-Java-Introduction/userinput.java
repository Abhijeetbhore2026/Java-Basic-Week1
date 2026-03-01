//Taking User Input Program

import java.util.*;

public class userinput {

  public static void main(String[] args) {

    Scanner Sc = new Scanner(System.in);

    int num1, num2;

    System.out.println("Enter Num1:-");
    num1 = Sc.nextInt();

    System.out.println("Enter Num2:- ");
    num2 = Sc.nextInt();

    int result = num1 * num2;

    System.out.println(result);

  }

}
