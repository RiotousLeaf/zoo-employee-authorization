import java.util.Scanner;

public class ZooEmployeeAuthorization(){
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    String userName = "";
    String userPassword = "";

    System.out.println("Please enter your username");
    userName = input.nextLine();

    System.out.println("Please enter your password");
    userPassword = input.nextLine();

    input.close()
  }
}
