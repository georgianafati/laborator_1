package exercitiul1;

import java.util.Scanner;

public class pb3 {
    static void findAndPrintDivisors(int n){
        if(n<=2)
        {
            System.out.println("Numarul este prim");
        }
        else {
            for(int i=1; i<=n; i++)
                if(n%1==0)
                    System.out.println("%d", i);
            else if(n==i)
                {
                    System.out.println("Numarul e prim");
                    break;
                }
        }
    }
}
