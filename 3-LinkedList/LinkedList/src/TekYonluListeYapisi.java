public class TekYonluListeYapisi {
    Node head = null;
    Node tail = null;

    void basaEkle(int x) {
        // Node sınıfından eleman adında bir obje türetilmiştir
        Node eleman = new Node();
        // eleman'ın data'sı x'tir
        eleman.data = x;

        if (head == null) {
            // elemanın next'i null değerine eşittir
            // yani sıradaki eleman eklenene kadar sondaki düğüm null değerini göstermektedir
            eleman.next = null;
            // ilk düğüm head'dir
            head = eleman;
            // aynı zamanda ikinci düğüm oluşana kadar ilk düğüm tail'dır
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu ilk eleman eklendi");
        } else {
            // Head'in önüne elemanı ekledik
            eleman.next = head;
            // head'i güncelledik
            head = eleman;
            System.out.println("Head kısmına eleman eklendi");
        }
    }

    void sonaEkle(int x) {
        // Node sınıfından eleman adında bir obje türetilmiştir
        Node eleman = new Node();
        // eleman'ın data'sı x'tir
        eleman.data = x;

        if (head == null) {
            // elemanın next'i null değerine eşittir
            // yani sıradaki eleman eklenene kadar sondaki düğüm null değerini göstermektedir
            eleman.next = null;
            // ilk düğüm head'dir
            head = eleman;
            // aynı zamanda ikinci düğüm oluşana kadar ilk düğüm tail'dır
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu ilk eleman eklendi");
        } else {
            // elemanın next'i null'u gösterecek
            eleman.next = null;
            // Tail'den sonra eleman ekledik
            tail.next = eleman;
            // tail'i güncelledik
            tail = eleman;
            System.out.println("Tail kısmına eleman eklendi");
        }
    }

    void arayaEkle(int indis, int x) {

        // Node sınıfından eleman adında bir obje türetilmiştir
        Node eleman = new Node();
        // eleman'ın data'sı x'tir
        eleman.data = x;

        if (head == null && indis == 0) {
            // elemanın next'i null değerine eşittir
            // yani sıradaki eleman eklenene kadar düğüm null değerini göstermektedir
            eleman.next = null;
            // ilk düğüm head'dir
            head = eleman;
            // aynı zamanda ikinci düğüm oluşana kadar ilk düğüm tail'dır
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu ilk eleman eklendi");
        } else if (head != null && indis == 0) {
            // Head'i bir ileri kaydırdık
            eleman.next = head;
            // head'i güncelleyip yeni değerini atadık
            head = eleman;
            System.out.println(indis + ". sıraya eleman eklendi");
        } else {
            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp.next != null) {
                n++;
                temp2 = temp;
                temp = temp.next;
            }
            if (n == indis) {
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("Eleman eklendi");
            } else {
                temp = head;
                temp2 = head;
                int i = 0;
                while (i != indis) {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }

                temp2.next = eleman;
                eleman.next = temp;
                System.out.println(indis + ". sıraya yeni eleman eklendi");

            }

        }
    }

    void yazdir() {
        if (head == null) {
            System.out.println("Liste yapisi bos!!!");
        } else {
            Node temp = head;
            System.out.print("Baş -> ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print(" Son ");
        }
    }

}
