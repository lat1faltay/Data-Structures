import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TekYonluListeYapisi tekYonluListeYapisi = new TekYonluListeYapisi();

        /*
        tekYonluListeYapisi.basaEkle(11);
        tekYonluListeYapisi.sonaEkle(22);
        tekYonluListeYapisi.basaEkle(5);
        tekYonluListeYapisi.sonaEkle(33);
        tekYonluListeYapisi.sonaEkle(44);
        tekYonluListeYapisi.sonaEkle(55);

        tekYonluListeYapisi.arayaEkle(3,25);
        tekYonluListeYapisi.arayaEkle(6,50);
        tekYonluListeYapisi.arayaEkle(0,3);


        tekYonluListeYapisi.basaEkle(10);
        tekYonluListeYapisi.basaEkle(30);
        tekYonluListeYapisi.basaEkle(40);
        tekYonluListeYapisi.basaEkle(50);
        tekYonluListeYapisi.basaEkle(60);

        //tekYonluListeYapisi.bastanSil();
        //tekYonluListeYapisi.sondanSil();

        tekYonluListeYapisi.aradanSil(3);

        tekYonluListeYapisi.yazdir();

         */

        int secim = 1;
        Scanner scanner = new Scanner(System.in);
        int sayi, indis;

        while (secim != 0) {
            System.out.println();
            System.out.println("1 başa ekle ");
            System.out.println("2 sona ekle ");
            System.out.println("3 araya ekle ");
            System.out.println("4 baştan sil");
            System.out.println("5 sondan sil ");
            System.out.println("6 aradan sil ");
            System.out.println("0 çıkış ");
            System.out.println("Seçiminiz: ");
            secim = scanner.nextInt();

            if (secim == 1) {
                System.out.println("sayi : ");
                sayi = scanner.nextInt();
                tekYonluListeYapisi.basaEkle(sayi);
            } else if (secim == 2) {
                System.out.println("sayi : ");
                sayi = scanner.nextInt();
                tekYonluListeYapisi.sonaEkle(sayi);
            } else if (secim == 3) {
                System.out.println("sayi : ");
                sayi = scanner.nextInt();
                System.out.println("indis : ");
                indis = scanner.nextInt();
                tekYonluListeYapisi.arayaEkle(indis, sayi);
            } else if (secim == 4) {
                tekYonluListeYapisi.bastanSil();
            } else if (secim == 5) {
                tekYonluListeYapisi.sondanSil();
            } else if (secim == 6) {
                System.out.println("indis : ");
                indis = scanner.nextInt();
                tekYonluListeYapisi.aradanSil(indis);
            } else if (secim == 0) {
                System.out.println("Program sonlandırıldı");
            } else {
                System.out.println("Hatalı seçim yaptınız ");
            }

            tekYonluListeYapisi.yazdir();

        }
    }
}