package generateBill;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * în această clasă se generează chitanța unei comenzi.
 * Are o singură metodă, generateBill, care face acest lucru, afișând datele comenzii într-un fișier text.
 */

public class generateBill {

    public void writeInFile(Integer clientID, Integer productID, Double price, Integer quantity) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Bill" + "\nClient id: " + clientID + "\nBought product: " + productID
            + "\nQuantity: " + quantity + "\nPrice: " + price);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
