public class Aufgabe3 {

    public static void main(String[] args) {

       

        Rechnung rechnung1 = new Rechnung(12.5, 3);

        Rechnung rechnung2 = new Rechnung(8.0, 5);

       
        rechnung1.berechneGesamtpreis();
        rechnung2.berechneGesamtpreis();
    }
}




class Rechnung {

    double preis; 
    int anzahl;   




    public Rechnung(double preis, int anzahl) {

        this.preis = preis;

        this.anzahl = anzahl;


    }


    public void berechneGesamtpreis() {

        double gesamt = preis * anzahl;

        System.out.println("Gesamtpreis: " + gesamt + " € " );
    }

}
