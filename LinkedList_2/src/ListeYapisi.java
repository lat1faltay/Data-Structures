public class ListeYapisi {

    // Head düğümü oluşturduk
    Node head = null; // Head düğümüne head adını verdik ve oluşturduk ancak bu düğüm bellekte herhangi bir yer kaplamıyor çünkü değeri null

    // tail adında son düğümümüzü oluşturduk
    Node tail = null; // bir düğüm son düğümse ona tail diyebiliriz ya da o düğüm null değerini gösteriyorsa o düğüm son düğümdür diyebiliriz

    // ekle fonksiyonu ListeYapisi'nın içerisine düğüm eklesin
    void ekle(int x) {

        Node eleman = new Node(); // Node tipinde eleman adında bir nesne oluşturduk, fonksiyon çalıştığında eklenecek olan düğüm (obje)
        eleman.data = x; // eleman nesnesinin tuttuğu değer x değeridir. bu x ekle fonksiyonunun parametresi olan x'tir
        eleman.next = null;

        // ilk düğümün oluşup oluşmadığını kontrol ediyoruz
        // eğer ilk düğüm yani head'in değeri null ise
        // eleman nesnesi head yani ilk düğüm oluyor
        if (head == null) {
            head = eleman;
            // eğer sadee ilk düğüm yani head oluşmuşsa o düğüm aynı zamanda tail'de olmaktadır
            tail = eleman;
            System.out.println("Liste oluşturuldu ve ilk düğüm (obje) eklendi");
        } else {
            // eğer head yani ilk düğüm oluşmuşsa
            tail.next = eleman; // son elemanın, düğümün devamına yeni düğümü ekliyor
            tail = eleman; // tail (son düğümü) güncelledim
            System.out.println("listenin sonuna yeni bir eleman eklendi");
        }
    }

    void yazdir() {
        if (head == null){
            System.out.println("Liste yapısı boştur");
        }else {
            // temp geçici bir düğümdür
            Node temp = head;

            System.out.print("\nBaş -> ");

            while (temp != null){
                System.out.print(temp.data + " -> " );
                temp=temp.next;
            }
            System.out.println("Son");

        }
    }

}
