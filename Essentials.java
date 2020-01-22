package essentialsstore;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Essentials{
    String item;
    float price;
    int quantity;
    

    public Essentials(){
        String item = "";
        float price = 0;
        int quantity =  0; 
    }

    public Essentials(String item, float price, int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity; 
    }

    public String getItem(){
        return item;
    }

    public float getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setItem(String newItem){
        this.item = newItem;
    }

    public void setPrice(float newPrice){
        this.price = newPrice;
    }

    public void setQuantity(int newQuant){
        this.quantity = newQuant;
    }

    public void itemInfo(){
        System.out.println("Item: " + item + ", Quantity: " + quantity + ", Price: " + price);
    }

    public void writingTextToFile(){
        PrintWriter writer = null;
    		
    	try {
    		//Note that we are able to append to the file because of the "true" parameter
			writer = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));
		}catch(FileNotFoundException exception) {
			exception.getMessage();
        }
        
        writer.print(item + " "+ quantity + " " + "GHc" + price);
        writer.println();

        writer.close();
    }
    
    public void backup(){
        PrintWriter backUpWriter = null;

        try{
            backUpWriter = new PrintWriter(new FileOutputStream("backup_essentials_stock.txt", true));
        }catch(FileNotFoundException ex) {
            ex.getMessage();
        }

        backUpWriter.print(item + " "+ quantity + " " + "GHc" + price);
        backUpWriter.println();
        backUpWriter.close();
    }
}