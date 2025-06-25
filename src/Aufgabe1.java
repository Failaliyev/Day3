import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in); // İstifadəçidən input almaq üçün Scanner

        System.out.print("Bitte eine Zahl eingeben: "); // İstifadəçiyə mesaj
        int zahl = eingabe.nextInt(); // Daxil edilən ədəd int dəyişənə yazılır

        // Əgər qalıq 0-dırsa, deməli cütdür
        if (zahl % 2 == 0) {
            System.out.println("Gerade Zahl."); // Cüt ədəd
        } else {
            System.out.println("Ungerade Zahl."); // Tək ədəd
        }
    }
}