package exercitiul1;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class pb2 {
    public static void main(String[] args) {
        int ma=1, minim=9999;
        try{
            File myObj= new File("src/exercitiul1/in.txt");
            Scanner myReader= new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data= myReader.nextLine();
                int data_int= Integer.parseInt(data);
                ma=(ma + data_int);

                if(data_int<minim){minim=data_int;}

            }
            ma=ma/2;
            System.out.println(ma + " "+ minim);
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("A aparut o eroare.");
            e.printStackTrace();

        }

        String destination = "out.txt";

        try(PrintStream ps= new PrintStream(destination)){
            ps.println("media aritmetica este: "+ ma +"Minimul este: "+minim);
            ps.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
