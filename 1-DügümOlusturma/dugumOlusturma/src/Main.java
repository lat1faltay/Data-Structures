public class Main {
    public static void main(String[] args) {
       // ClassOne nesne1;  // bellekteki değeri = null
        ClassOne nesne1 = new ClassOne(); // new'lediğimizde düğüm oluşuyor
        ClassOne nesne2 = new ClassOne(); // ikinci düğüm
        ClassOne nesne3 = new ClassOne(); // üçüncü düğüm

        // Düğümlere değer atama işlemi
        nesne1.sayi = 10;
        nesne2.sayi=20;
        nesne3.sayi=30;

        // Düğümleri birbirine bağlama
        nesne1.next = nesne2;
        nesne2.next = nesne3;
        nesne3.next = null;

        // Düğümlerin içinde gezebilmek için geçici bir değişken oluşturduk ve değerine nesne1 verdik
        // çünkü temp bir değer tutmak zorunda ve bu tuttuğu değer ile döngüye koşul yazabilelim
        ClassOne temp = nesne1;

        // Düğümleri gezmek için döngü kurduk
        //bu döngünün mantığı temp değişkeninin değeri null değilse döngüyü çalıştır.
        while(temp != null){
            System.out.println(temp.sayi);
            // temp'in nexti ile bir sonraki düğüme geçeceğiz
            temp = temp.next;
        }

        // Döngü çalışma adımları
        // 1. adımda temp nesne1'e eşit nesne1'in değeri null olmadığı için döngü çalışacak ve ekrana yazdıracak
        // sonrasında temp'in next'i ile bir sonraki düğüme geçiyoruz
        // 2. adımda temp'in tuttuğu değer nesne2 yani değeri null değil
        // nesne2'nin değeri null olmadığı için döngü nesne2 için de çalışacak ve ekrana yazdıracak
        // sonra temp bir sonraki düğüm değerine geçiyor
        // 3. adımda temp'in tuttuğu değer nesne3 yani değeri null değil
        // nesne3'nin değeri null olmadığı için döngü nesne3 için de çalışacak ve ekrana yazdıracak
        // sonra temp geçebilecek farklı bir düğüm bulamayınca döngü kırılacak ve program bitmiş olacak
    }
}