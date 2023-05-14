import java.util.Scanner;

public class OgrListe {
    OgrNode head = null;
    OgrNode tail = null;
    OgrNode temp = null;
    OgrNode temp2 = null;

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;

    Scanner scanner = new Scanner(System.in);

    void OgrenciEkle() {
        System.out.println("Kayıt yapılacak öğrenci bilgilerini giriniz");
        System.out.print("Öğrencinin numarası: ");
        numara = scanner.nextInt();
        System.out.print("Öğrencinin adı: ");
        ad = scanner.nextLine();
        System.out.print("Öğrencinin soyadı: ");
        soyad = scanner.nextLine();
        System.out.print("Öğrencinin vize notu: ");
        vize = scanner.nextInt();
        System.out.print("Öğrencinin final notu: ");
        fin = scanner.nextInt();

        OgrNode ogrenci = new OgrNode(numara,ad,soyad,vize,fin);

        if(head == null){
            head = ogrenci;
            tail = ogrenci;
            System.out.println("Öğrenci sisteme başarıyla eklenmiştir");
        } else if (head != null) {

        }

    }

}
