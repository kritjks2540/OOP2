/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookhome;
public class bookInventory extends Information implements Information1,Information2,Information3,Information4,Information5 {
    private int idProduct;
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
    public  void listhotProduct(int check1,int check2,int check3,int check4,int check5){
        System.out.println(":::::::::::::::::::::: PRODUCT HOTS :::::::::::::::::::::::");
        System.out.println("Name: BubpaeSaniwad : "+check1 +" Book");
        System.out.println("Name: Origin : "+check2 +" Book");
        System.out.println("Name: Ready Player One : "+check3 +" Book");
        System.out.println("Name: Miracle Morning: "+check4 +" Book");
        System.out.println("Name: Business Model Generation Workbook: "+check5 +" Book");
        System.out.println("-----------------------------------------------------------");
    }
    public void InformationBook1(){
        idProduct = 1;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName1);
        System.out.println("Author: "+Author1);
        System.out.println("Price for rent: "+priceRent+" Point (** 1:10 Days/Point **)");
        System.out.println("Price for sell: "+priceSell+" Point");
    }
    public void InformationBook2(){
        idProduct = 2;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName2);
        System.out.println("Author: "+Author2);
        System.out.println("Price for rent: "+priceRent2+"Point (** 1:10 Days/Point **)");
        System.out.println("Price for sell: "+priceSell2+" Point");
    }
    public void InformationBook3(){
        idProduct = 3;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName3);
        System.out.println("Author: "+Author3);
        System.out.println("Price for rent: "+priceRent3+" Point (** 1:10 Days/Point **)");
        System.out.println("Price for sell: "+priceSell3+" Point");
    }
    public void InformationBook4(){
        idProduct = 4;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName4);
        System.out.println("Author: "+Author4);
        System.out.println("Price for rent: "+priceRent4+" Point (** 1:10 Days/Point **)");
        System.out.println("Price for sell: "+priceSell4+" Point");
    }
    public void InformationBook5(){
        idProduct = 5;
        System.out.println("Order ID: "+idProduct);
        System.out.println("BookName: "+bookName5);
        System.out.println("Author: "+Author5);
        System.out.println("Price for rent: "+priceRent5+" Point (** 1:10 Days/Point **)");
        System.out.println("Price for sell: "+priceSell5+" Point");
    }
    

}
