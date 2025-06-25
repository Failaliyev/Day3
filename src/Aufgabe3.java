public class Aufgabe3 {

    public static void main(String[] args) {

        // Iki fərqli məhsul üçün hesab yaradılır

        Rechnung rechnung1 = new Rechnung(12.5, 3);

        Rechnung rechnung2 = new Rechnung(8.0, 5);

        // Ümumi qiymətlər hesablanacaq
        rechnung1.berechneGesamtpreis();
        rechnung2.berechneGesamtpreis();
    }
}

// Rechnung sinifi – məhsul qiyməti və miqdarı saxlayır


class Rechnung {

    double preis; // Qiymət (məsələn: 12.5)
    int anzahl;    // Miqdar (məsələn: 3 ədəd)


// Konstruktor – obyekt yaradılarkən qiymət və say verilir

    public Rechnung(double preis, int anzahl) {

        this.preis = preis;

        this.anzahl = anzahl;


    }
    // Ümumi qiyməti hesablayan metod

    public void berechneGesamtpreis() {

        double gesamt = preis * anzahl;

        System.out.println("Gesamtpreis: " + gesamt + " € " );
    }

}
