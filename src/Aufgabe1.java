import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in); 

        System.out.print("Bitte eine Zahl eingeben: "); 
        int zahl = eingabe.nextInt(); 

       
        if (zahl % 2 == 0) {
            System.out.println("Gerade Zahl."); 
        } else {
            System.out.println("Ungerade Zahl."); 
        }
    }
}
