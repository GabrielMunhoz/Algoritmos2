package escola;

import java.util.Scanner;

public class Console {

    public String dString(String str) {
    System.out.println(str);
    while(true) {
    try {	
            return new Scanner(System.in).nextLine();
    }catch(Exception exeception) {
            System.out.println("Voce deve digitar alguma frase!");
    }
    }//finel while

    }//final dString

    public int dInt(String str) {
            System.out.println(str);
            while(true) {
            try {	
                    return new Scanner(System.in).nextInt();
            }catch(Exception exeception) {
                    System.out.println("Voce deve digitar algum numero inteiro Decimal!");
            }
            }//finel while

            }//final dInt
    public double dDouble(String str) {
            System.out.println(str);
            while(true) {
            try {	
                    return new Scanner(System.in).nextDouble();
            }catch(Exception exeception) {
                    System.out.println("Voce deve digitar algum numero");
            }
            }//finel while

            }//final dInt
}// final console 
