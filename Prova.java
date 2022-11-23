import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;



public class Prova {
    public static void main(String[] args){
      
        try {
            File file = new File("test.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       
    }

    public static void scrivi() {
        try {
            FileWriter scrittore = new FileWriter("test2.txt");
            scrittore.write("Hi");
            scrittore.close();
        } catch(IOException errore) {
            System.out.println("Errore: " + errore.getMessage());
        }
    }

}

