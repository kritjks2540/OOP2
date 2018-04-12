
package bookhome;
import java.util.Scanner;
public class Member{
    //กำหนดไอดี 3 ไอดี
    String user;
    String pass;
    Scanner input= new Scanner(System.in);
    String userCheck1 = "abc";
    String passCheck1 = "123456";
    String userCheck2 = "krit";
    String passCheck2 = "0812345678";
    String userCheck3 = "Aun";
    String passCheck3 = "0898765432";
    public void loginMember(){
          
            System.out.println("::::: KA Book Stroe Login System ::::");
            do{
            System.out.println("--------------------------------------");
            System.out.print("Username: ");
            user = input.nextLine();
            System.out.print("Password: ");
            pass = input.nextLine();
            System.out.println("--------------------------------------");         
            }while(!(user.equals(userCheck1) && pass.equals(passCheck1)));
            
    }

}
