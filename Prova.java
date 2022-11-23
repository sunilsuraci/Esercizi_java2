import java.io.FileNotFoundException;
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       
    }


    




}

