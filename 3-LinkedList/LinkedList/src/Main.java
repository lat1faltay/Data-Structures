public class Main {
    public static void main(String[] args) {

        TekYonluListeYapisi tekYonluListeYapisi = new TekYonluListeYapisi();

        tekYonluListeYapisi.basaEkle(11);
        tekYonluListeYapisi.sonaEkle(22);
        tekYonluListeYapisi.basaEkle(5);
        tekYonluListeYapisi.sonaEkle(33);
        tekYonluListeYapisi.sonaEkle(44);
        tekYonluListeYapisi.sonaEkle(55);

        tekYonluListeYapisi.arayaEkle(3,25);
        tekYonluListeYapisi.arayaEkle(6,50);
        tekYonluListeYapisi.arayaEkle(0,3);

        tekYonluListeYapisi.yazdir();

    }
}