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

    void ekle() {
        System.out.println("Bilgisayar bölümüne kayıt olacak öğrenci bilgilerini giriniz: ");
        System.out.println("numara : ");
        numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ad : ");
        ad = scanner.nextLine();
        System.out.println("soyad : ");
        soyad = scanner.nextLine();
        System.out.println("vize : ");
        vize = scanner.nextInt();
        System.out.println("final : ");
        fin = scanner.nextInt();


        OgrNode eleman = new OgrNode(numara, ad, soyad, vize, fin);

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Bilgisayar bölümüne kayıt olacak öğrencilerin liste yapısı oluşturuldu, ilk öğrenci kayıt edildi");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println(numara + " numaralı öğrenci kayıt edildi");
        }

    }

}
