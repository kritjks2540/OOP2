
package bookhome;
import java.util.Scanner;
public class Member {
    //กำหนดไอดี 3 ไอดี
    String name,lastname;
    String Evented;
    int price;
    double point;
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
          
            System.out.println("           ::::: KA Book Stroe Login System ::::");
            do{
            System.out.println("-----------------------------------------------------------");
            System.out.print("Username: ");
            user = input.nextLine();
            System.out.print("Password: ");
            pass = input.nextLine();     
            }while(!(user.equals(userCheck1) && pass.equals(passCheck1)));
            DatabaseLogin(user,pass);
            System.out.println("-----------------------------------------------------------"); 
    }
    public void DatabaseLogin(String user1,String pass1){
        if(user1.equals("abc") && pass.equals("123456")){
            name = "Somsak";
            lastname = "Pakdee";
            point = 50;
            System.out.println("Your Account >> "+"Fistname:"+name +" Lastname:"+lastname +" Point:"+point);
        }
    }
    public void ProcessOrder(int choosed,int amounted){
        if(choosed == 1){
            price = 5*amounted;
            point = point-price;
            System.out.println("[System]: You buy Book: BubpaeSaniwad Price: 5 Point Amount:"+amounted+" Total: "+price+" Point");
            System.out.println("Current Your Point: "+point);
 
            
        }
    }
    public void topup(String coded){
        if(coded.equals("tudjgog5bonmy")){
            point+= 50;
            System.out.println("[System] : You buy point: 50 Point Success !!");
            System.out.println("[System] : Current Your Point: "+point);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }else if(coded.equals("qw178wr20rtgh")){
            point+= 100;
            System.out.println("[System] : You buy point: 100 Point Success !!");
            System.out.println("[System] : Current Your Point: "+point);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }else if(coded.equals("aws02tyhyursx")){
            point+= 300;
            System.out.println("[System] : You buy point: 300 Point Success !!");
            System.out.println("[System] : Current Your Point: "+point);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }else{
            System.out.println("[System] : Error ");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }
    }

}
