import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BagliListe bagliListe = new BagliListe();

        int secim = -1, sayi;
        while(secim != 0){
            System.out.println("1. Başa ekle");
            System.out.println("2. Sona ekle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();

            if(secim == 1){
                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                bagliListe.basaEkle(sayi);
            }

            if(secim == 2){
                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                bagliListe.sonaEkle(sayi);
            }

            bagliListe.yazdir();
        }

    }
}