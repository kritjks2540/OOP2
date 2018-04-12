/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookhome;
public class bookInventory extends Information implements Information1,Information2,Information3,Information4,Information5 {
    int totalBooks;
    bookInventory(){
       super.ShowNameStroe();
    }
    public void print(){ //ปริ้นรายชื่อหนังสือ
        System.out.println("------------------------------------------");
        this.InformationBook1();
        System.out.println("------------------------------------------");
        this.InformationBook2();
        System.out.println("------------------------------------------");
        this.InformationBook3();
        System.out.println("------------------------------------------");
        this.InformationBook4();
        System.out.println("------------------------------------------");
        this.InformationBook5();  
        System.out.println("------------------------------------------");
        
    }
    public void InformationBook1(){
        this.totalBooks = 5;
        System.out.println("BookName: "+bookName1);
        System.out.println("Author: "+Author1);
        System.out.println("Price for rent: "+priceRent+"Point");
        System.out.println("Price for sell: "+priceSell+"Point");
        System.out.println("Total Books: "+this.totalBooks);
    }
    public void InformationBook2(){
        this.totalBooks = 10;
        System.out.println("BookName: "+bookName2);
        System.out.println("Author: "+Author2);
        System.out.println("Price for rent: "+priceRent2+"Point");
        System.out.println("Price for sell: "+priceSell2+"Point");
        System.out.println("Total Books: "+this.totalBooks);
    }
    public void InformationBook3(){
        this.totalBooks = 3;
        System.out.println("BookName: "+bookName3);
        System.out.println("Author: "+Author3);
        System.out.println("Price for rent: "+priceRent3+"Point");
        System.out.println("Price for sell: "+priceSell3+"Point");
        System.out.println("Total Books: "+this.totalBooks);
    }
    public void InformationBook4(){
        this.totalBooks = 10;
        System.out.println("BookName: "+bookName4);
        System.out.println("Author: "+Author4);
        System.out.println("Price for rent: "+priceRent4+"Point");
        System.out.println("Price for sell: "+priceSell4+"Point");
        System.out.println("Total Books: "+this.totalBooks);
    }
    public void InformationBook5(){
        this.totalBooks = 20;
        System.out.println("BookName: "+bookName5);
        System.out.println("Author: "+Author5);
        System.out.println("Price for rent: "+priceRent5+"Point");
        System.out.println("Price for sell: "+priceSell5+"Point");
        System.out.println("Total Books: "+this.totalBooks);
    }
    

}
