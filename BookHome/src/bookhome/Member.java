
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
    int countHot1=0;
    int countHot2=0;
    int countHot3=0;
    int countHot4=0;
    int countHot5=0;
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
          
            System.out.println(":::::::::::::: KA Book Stroe Login System :::::::::::::::::");
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
            System.out.println(":::::::::::::::::::::::: SHOW STATUS ::::::::::::::::::::::");
            System.out.println("FirstName: "+name +" Lastname:"+lastname);
            System.out.println("Age: "+age +" Point:"+point);
            System.out.println("Book[Rent]: "+countRent+" Book[Buy]: "+countSell);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }
        if(user1.equals("aun") && pass.equals("0898765432")){
            System.out.println(":::::::::::::::::::::::: SHOW STATUS ::::::::::::::::::::::");
            System.out.println("FirstName: "+name +" Lastname:"+lastname);
            System.out.println("Age: "+age +" Point:"+point);
            System.out.println("Book[Rent]: "+countRent+" Book[Buy]: "+countSell);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }
        if(user1.equals("abc") && pass.equals("123456")){
            System.out.println(":::::::::::::::::::::::: SHOW STATUS ::::::::::::::::::::::");
            System.out.println("FirstName: "+name +" Lastname:"+lastname);
            System.out.println("Age: "+age +" Point:"+point);
            System.out.println("Book[Rent]: "+countRent+" Book[Buy]: "+countSell);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }
    }
    public void ProcessOrder(int choosed,int amounted,int typed){
        //---------------------------------------------------------------------//
        if(choosed == 1){ //สินค้าตัวที่ 1
            if(typed == 1){ //เช่า
               System.out.print("Enter Days of Rent: ");
               day = input.nextInt();
               price = 10*day*amounted;
               countRent+=amounted;
               countHot1+=amounted; //นับยอดการใช้งาน
            }else{ // ซื้อ
               price = 300*amounted;
               countSell+=amounted;
               countHot1+=amounted; //นับยอดการใช้งาน
            }
            if(point < price){
                 System.out.println("Not enought money please topup !!"); 
            }else{
            point = point-price;
            if(typed == 1){
            System.out.println("[System]: You Rent Book: BubpaeSaniwad Price: 1:10 Days/Point  Amount: "+amounted+" Days: "+day+" Total: "+price+" Point");
            }
            if(typed == 2){
            System.out.println("[System]: You buy Book: BubpaeSaniwad Price: 300 Point Amount:"+amounted+" Total: "+price+" Point");
            }
            System.out.println("Current Your Point: "+point);
            }
        }
        //---------------------------------------------------------------------//
        if(choosed == 2){ //สินค้าตัวที่ 2
            if(typed == 1){ //เช่า
               System.out.print("Enter Days of Rent: ");
               day = input.nextInt();
               price = 10*day*amounted;
               countRent+=amounted;
               countHot2+=amounted; //นับยอดการใช้งาน
            }else{ // ซื้อ
               price = 350*amounted;
               countSell+=amounted;
               countHot2+=amounted; //นับยอดการใช้งาน
            }
            if(point < price){
                 System.out.println("Not enought money please topup !!"); 
            }else{
            point = point-price;
            if(typed == 1){
            System.out.println("[System]: You Rent Book: Origin Price: 1:10 Days/Point  Amount: "+amounted+" Days: "+day+" Total: "+price+" Point");
            }
            if(typed == 2){
            System.out.println("[System]: You buy Book: Origin Price: 350 Point Amount:"+amounted+" Total: "+price+" Point");
            }
            System.out.println("Current Your Point: "+point);
            }
        }
        //---------------------------------------------------------------------//
        if(choosed == 3){ //สินค้าตัวที่ 3
            if(typed == 1){ //เช่า
               System.out.print("Enter Days of Rent: ");
               day = input.nextInt();
               price = 10*day*amounted;
               countRent+=amounted;
               countHot3+=amounted; //นับยอดการใช้งาน
            }else{ // ซื้อ
               price = 500*amounted;
               countSell+=amounted;
               countHot3+=amounted; //นับยอดการใช้งาน
            }
            if(point < price){
                 System.out.println("Not enought money please topup !!"); 
            }else{
            point = point-price;
            if(typed == 1){
            System.out.println("[System]: You Rent Book: Ready Player One Price: 1:10 Days/Point  Amount: "+amounted+" Days: "+day+" Total: "+price+" Point");
            }
            if(typed == 2){
            System.out.println("[System]: You buy Book: Ready Player One Price: 500 Point Amount:"+amounted+" Total: "+price+" Point");
            }
            System.out.println("Current Your Point: "+point);
            }
        }
        //---------------------------------------------------------------------//
        if(choosed == 4){ //สินค้าตัวที่ 4
            if(typed == 1){ //เช่า
               System.out.print("Enter Days of Rent: ");
               day = input.nextInt();
               price = 10*day*amounted;
               countRent+=amounted;
               countHot4+=amounted; //นับยอดการใช้งาน
            }else{ // ซื้อ
               price = 400*amounted;
               countSell+=amounted;
               countHot4+=amounted; //นับยอดการใช้งาน
            }
            if(point < price){
                 System.out.println("Not enought money please topup !!"); 
            }else{
            point = point-price;
            if(typed == 1){
            System.out.println("[System]: You Rent Book: Miracle Morning Price: 1:10 Days/Point  Amount: "+amounted+" Days: "+day+" Total: "+price+" Point");
            }
            if(typed == 2){
            System.out.println("[System]: You buy Book: Miracle Morning Price: 400 Point Amount:"+amounted+" Total: "+price+" Point");
            }
            System.out.println("Current Your Point: "+point);
            }
        }
        //---------------------------------------------------------------------//
        if(choosed == 5){ //สินค้าตัวที่ 5
            if(typed == 1){ //เช่า
               System.out.print("Enter Days of Rent: ");
               day = input.nextInt();
               price = 10*day*amounted;
               countRent+=amounted;
               countHot5+=amounted; //นับยอดการใช้งาน
            }else{ // ซื้อ
               price = 250*amounted;
               countSell+=amounted;
               countHot5+=amounted; //นับยอดการใช้งาน
            }
            if(point < price){
                 System.out.println("Not enought money please topup !!"); 
            }else{
            point = point-price;
            if(typed == 1){
            System.out.println("[System]: You Rent Book: Business Model Generation Workbook Price: 1:10 Days/Point  Amount: "+amounted+" Days: "+day+" Total: "+price+" Point");
            }
            if(typed == 2){
            System.out.println("[System]: You buy Book: Business Model Generation Workbook Price: 250 Point Amount:"+amounted+" Total: "+price+" Point");
            }
            System.out.println("Current Your Point: "+point);
            }
        }
        
    }
    public void topup(String coded){
        if(coded.equals("tudjgog5bonmy")){
            point+= 100;
            System.out.println("[System] : You buy point: 100 Point Success !!");
            System.out.println("[System] : Current Your Point: "+point);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }else if(coded.equals("qw178wr20rtgh")){
            point+= 300;
            System.out.println("[System] : You buy point: 300 Point Success !!");
            System.out.println("[System] : Current Your Point: "+point);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }else if(coded.equals("aws02tyhyursx")){
            point+= 500;
            System.out.println("[System] : You buy point: 500 Point Success !!");
            System.out.println("[System] : Current Your Point: "+point);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }else{
            System.out.println("[System] : Error ");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        }
    }

}
