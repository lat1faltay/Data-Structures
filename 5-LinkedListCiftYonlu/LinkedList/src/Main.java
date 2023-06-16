import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BagliListe bagliListe = new BagliListe();

        int secim = -1, sayi, indis;
        while(secim != 0){
            System.out.println("1. Başa ekle");
            System.out.println("2. Sona ekle");
            System.out.println("3. araya ekle");
            System.out.println("4. Sondan başa yazdır");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();
            
            if(secim == 1){
                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                bagliListe.basaEkle(sayi);
            }else if(secim == 2){
                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                bagliListe.sonaEkle(sayi);
            }else if(secim == 3){
                System.out.println("İndis: ");
                indis =  scanner.nextInt();

                System.out.println("Sayı: ");
                sayi = scanner.nextInt();
                bagliListe.arayaEkle(indis,sayi);
            }else if(secim == 4){
                bagliListe.sondanYazdir();
            }

            bagliListe.yazdir();
        }

    }
}
