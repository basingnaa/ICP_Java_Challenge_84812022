package essentialsstore;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StockItems{    
    public static void main(String[] args) throws InputMismatchException{
        Scanner numItems = new Scanner(System.in);
        System.out.println("Enter number of items to stock: ");
        int num = numItems.nextInt();


        for(int i = 0;i < num; i++){
            Scanner item = new Scanner(System.in);
            System.out.println("Enter name of item: ");

            String nItem = item.nextLine();
            

            Scanner price = new Scanner(System.in);
            System.out.println("Enter price of item: ");
            float nPrice = price.nextFloat();

            Scanner quantity = new Scanner(System.in);
            System.out.println("Enter quantity of item: ");
            int nQuant = quantity.nextInt();

            Essentials items = new Essentials(nItem, nPrice, nQuant);
            items.itemInfo();

            items.writingTextToFile();

            items.backup();
        }
        
    } 
}