package exercitiul1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("L=");
        int L= scanner.nextInt();
        System.out.print("l=");
        int l= scanner.nextInt();

        System.out.println("Perimetru: "+(2*(L+l)));
        System.out.println("Aria: "+(L*l));
        scanner.close();

    }
}
