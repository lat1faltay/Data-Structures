public class Main {
    public static void main(String[] args) {

        /*

        Bir önceki dersi hatırlatma

        // A düğüm (obje) oluşturuldu
        Node A = new Node();

        // B düğüm (obje) oluşturuldu
        Node B = new Node();

        // C düğüm (obje) oluşturuldu
        Node C = new Node();

        // D düğüm (obje) oluşturuldu
        Node D = new Node();

        A.data = 11; // Düğümlere (objelere) veri girildi
        B.data = 22;
        C.data = 33;
        D.data = 44;

        // Düğümleri birbirine bağladık
        A.next = B; // ilk düğüm A düğümüdür bu düğüm HEAD olarak adlandırılır
        B.next = C;
        C.next = D;
        D.next = null; // Son düğüm null değerini alıyor

         */

        ListeYapisi liste = new ListeYapisi();

        liste.ekle(11);
        liste.ekle(22);
        liste.ekle(33);
        liste.ekle(44);

        System.out.println();

        liste.yazdir();

    }
}