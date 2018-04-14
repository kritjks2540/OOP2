
package bookhome;
import java.util.Scanner;
public class BookHome extends Member {
    static int choose;
    static int amount;
    static int selectMenu;
   static int again;
    static String code;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Member mem = new Member();
        mem.loginMember();
     
            System.out.println(":::::::::::::::::::::::::: MENU :::::::::::::::::::::::::::");
            System.out.println("1.Book Product");
            System.out.println("2.Buy Point");
            System.out.println("3.Exit");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("-----------------------------------------------------------");
        do{
            do{    
                
                System.out.print("Please Enter Menu : ");
                selectMenu = input.nextInt();
            }while(selectMenu != 1 && selectMenu != 2 && selectMenu != 3);
            //--------------------------------------------------------//
            switch(selectMenu){
                case 1:{
                        bookInventory List = new bookInventory();
                        List.print();
                        System.out.print("Please Enter Product:");
                        choose = input.nextInt();
                        System.out.print("Amount of Product:");
                        amount = input.nextInt();
                        mem.ProcessOrder(choose,amount);
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Do you want Back to Menu [1]:Yes [0]:No");
                        System.out.print("Enternumber: ");
                        again = input.nextInt();
                        System.out.println("-----------------------------------------------------------");
                        break;
                }
                case 2:{
                    System.out.println("::::::::::::::::::::::::: TOPUP :::::::::::::::::::::::::::");
                    System.out.print("Enter Code:");
                    code = input.nextLine();
                    code = input.nextLine();
                    mem.topup(code);    
                    System.out.println("Do you want Back to Menu [1]:Yes [0]:No");
                    System.out.print("Enternumber: ");
                    again = input.nextInt(); 
                    System.out.println("-----------------------------------------------------------");
                    break; 
                }
                default:{
                    System.out.println("Error Value !!"); break;
                }
            }
            //--------------------------------------------------------//
        }while(again != 0);
    }
    
}
