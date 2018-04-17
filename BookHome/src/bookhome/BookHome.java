
package bookhome;
import java.util.Scanner;
public class BookHome extends Member {
    static int choose;
    static int amount;
    static int selectMenu;
    static int again;
    static String code;
    static int type;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Member mem = new Member();
        mem.loginMember();
     
            System.out.println(":::::::::::::::::::::::::: MENU :::::::::::::::::::::::::::");
            System.out.println("1.Book Product");
            System.out.println("2.Buy Point");
            System.out.println("3.Accout Status");
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
                        List.listhotProduct(mem.countHot1,mem.countHot2,mem.countHot3,mem.countHot4,mem.countHot5);
                        do{
                            System.out.print("Please Enter Order ID:");
                            choose = input.nextInt();
                        }while(choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5);
                        System.out.print("Amount of Product:");
                        amount = input.nextInt();
                        do{
                            System.out.print("Press[1]Rent [2]Buy: ");
                            type = input.nextInt();
                        }while(type != 1 && type != 2);               
                        mem.ProcessOrder(choose,amount,type);
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
                case 3:{   
                    clsScreen();
                    mem.showStatus(mem.user, mem.pass);
                    System.out.println("-----------------------------------------------------------");
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
    public static void clsScreen(){
        for(int i=0; i<50; i++){
            System.out.println("");
        }
    }

}
