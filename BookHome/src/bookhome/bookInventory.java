/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookhome;
public class bookInventory extends Information implements Information1,Information2,Information3,Information4,Information5 {
    protected int totalBooks1;
    protected int totalBooks2;
    protected int totalBooks3;
    protected int totalBooks4;
    protected int totalBooks5;
    int idProduct;
     bookInventory(String Empty){
      
    }
    bookInventory(){
       super.ShowNameStroe();
    }
    public void print(){ //ปริ้นรายชื่อหนังสือ
        System.out.println("-----------------------------------------------------------");
        this.InformationBook1();
        System.out.println("-----------------------------------------------------------");
        this.InformationBook2();
        System.out.println("-----------------------------------------------------------");
        this.InformationBook3();
        System.out.println("-----------------------------------------------------------");
        this.InformationBook4();
        System.out.println("-----------------------------------------------------------");
        this.InformationBook5();  
        System.out.println("-----------------------------------------------------------");
        
    }
    public void InformationBook1(){
        idProduct = 1;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName1);
        System.out.println("Author: "+Author1);
        System.out.println("Price for rent: "+priceRent+"Point (** 1:10 Days/Point **)");
        System.out.println("Price for sell: "+priceSell+"Point");
    }
    public void InformationBook2(){
        idProduct = 2;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName2);
        System.out.println("Author: "+Author2);
        System.out.println("Price for rent: "+priceRent2+"Point");
        System.out.println("Price for sell: "+priceSell2+"Point");
    }
    public void InformationBook3(){
        idProduct = 3;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName3);
        System.out.println("Author: "+Author3);
        System.out.println("Price for rent: "+priceRent3+"Point");
        System.out.println("Price for sell: "+priceSell3+"Point");
    }
    public void InformationBook4(){
        idProduct = 4;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName4);
        System.out.println("Author: "+Author4);
        System.out.println("Price for rent: "+priceRent4+"Point");
        System.out.println("Price for sell: "+priceSell4+"Point");
    }
    public void InformationBook5(){
        idProduct = 5;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName5);
        System.out.println("Author: "+Author5);
        System.out.println("Price for rent: "+priceRent5+"Point");
        System.out.println("Price for sell: "+priceSell5+"Point");
    }
    

}
