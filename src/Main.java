// https://app.patika.dev/
// https://app.patika.dev/thendbranch


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev - Desene Göre Metot Oluşturma
            Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan
            döngü kullanmadan bir "Recursive" metot yazın.

        Kural :
            Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
            Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
            Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
            Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

        Örneğin :
            N Sayısı : 16
            Çıktısı : 16 11 6 1 -4 1 6 11 16
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sayı Giriniz");
        int n = input.nextInt();
        int x = n;
        metoteksi(n, x);
    }

    static void metoteksi(int a, int b) {
        if (a >= 0) {
            System.out.print(a + " ");
            metoteksi(a - 5, b);
        } else if (a<=b){

            metotarti(a, b);
        }

    }

    static void metotarti (int a, int b) {
        if (a<=b){
            System.out.print(a + " ");
            metotarti(a + 5,b);
        }

    }
}