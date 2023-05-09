public class BagliListe {
    // çift yönlü doğrusal bağlı liste

    Node head = null;
    Node tail = null;

    void basaEkle(int data) {
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }

    void sonaEkle(int data) {
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }

    void yazdir() {
        Node temp = head;
        System.out.print("Baş -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" -> Son");
    }

}
