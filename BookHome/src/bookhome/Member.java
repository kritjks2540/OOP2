
package bookhome;
import java.util.Scanner;
public class Member {
    //กำหนดไอดี 3 ไอดี
    String name,lastname,regisdate;
    int age;
    String Evented;
    int price;
    double point;
    String user;
    String pass;
    int day;
    int countRent = 0,countSell = 0;
    Scanner input= new Scanner(System.in);
    String userCheck1 = "abc";
    String passCheck1 = "123456";
    String userCheck2 = "krit";
    String passCheck2 = "0812345678";
    String userCheck3 = "aun";
    String passCheck3 = "0898765432";
   
    public void loginMember(){
          
            System.out.println("           ::::: KA Book Stroe Login System ::::");
            do{
            System.out.println("-----------------------------------------------------------");
            System.out.print("Username: ");
            user = input.nextLine();
            System.out.print("Password: ");
            pass = input.nextLine();     
            }while(!(user.equals(userCheck1) && pass.equals(passCheck1))
                    && !(user.equals(userCheck2)&& pass.equals(passCheck2))
                    && !(user.equals(userCheck3) && pass.equals(passCheck3)));
            DatabaseLogin(user,pass);
            System.out.println("-----------------------------------------------------------"); 
    }
    public void DatabaseLogin(String user1,String pass1){
        if(user1.equals("krit") && pass.equals("0812345678")){
            name = "Jakkrit";
            lastname = "Singsat";
            age = 21;
            regisdate = "15/4/2561";
            point = 50;
            System.out.println("Your Account >> "+"Fistname:"+name +" Lastname:"+lastname +" Point:"+point);
        }
        if(user1.equals("aun") && pass.equals("0898765432")){
            name = "Peamadath";
            lastname = "Chopragan";
            age = 20;
            regisdate = "16/4/2561";
            point = 50;
            System.out.println("Your Account >> "+"Fistname:"+name +" Lastname:"+lastname +" Point:"+point);
        }
        if(user1.equals("abc") && pass.equals("123456")){
            name = "Somsak";
            lastname = "Pakdee";
            age = 50;
            regisdate = "10/4/2561";
            point = 50;
            System.out.println("Your Account >> "+"Fistname:"+name +" Lastname:"+lastname +" Point:"+point);
        }
    }
      public void showStatus(String user1,String pass1){
        if(user1.equals("krit") && pass.equals("0812345678")){
            System.out.println(":::::::::::::::::::::::::: MENU :::::::::::::::::::::::::::");
            System.out.println("FirstName: "+name +" Lastname:"+lastname);
            System.out.println("Age: "+age +" Point:"+point);
            System.out.println("Book[Rent]: "+countRent+"Book[Buy]"+countSell);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }
        if(user1.equals("aun") && pass.equals("0898765432")){
            System.out.println("aun");
        }
        if(user1.equals("abc") && pass.equals("123456")){
            System.out.println("abc");
        }
    }
    public void ProcessOrder(int choosed,int amounted,int typed){
        bookInventory inven = new  bookInventory ("Empty");
        if(choosed == 1){
            if(typed == 1){ //เช่า
               System.out.print("Enter Days of Rent: ");
               day = input.nextInt();
               price = 10*day*amounted;
               countRent+=amounted;
            }else{ // ซื้อ
               price = 300*amounted;
               countSell+=amounted;
            }
            if(point < price){
                 System.out.println("Not enought money please topup !!"); 
            }else{
            point = point-price;
            if(typed == 1){
            System.out.println("[System]: You Rent Book: BubpaeSaniwad Price: 1:10 Days/Point  Amount: "+amounted+" Days: "+day+" Total: "+price+" Point");
            }
            if(typed == 2){
            System.out.println("[System]: You buy Book: BubpaeSaniwad Price: 5 Point Amount:"+amounted+" Total: "+price+" Point");
            }
            System.out.println("Current Your Point: "+point);
            }
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
