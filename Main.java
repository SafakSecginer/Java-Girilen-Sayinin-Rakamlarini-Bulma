import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz...");

        String girilenSayi = input.next();

        rakamBul(girilenSayi);

    }

    public static void rakamBul(String sayi) {

        char[] rakamlar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        List<Character> bulunanRakamlar = new ArrayList<Character>();

        for (char rakam : rakamlar) {

            for (int index = 0; index < sayi.length(); index++)

                if (sayi.charAt(index) == rakam) {

                    if (!bulunanRakamlar.contains(rakam))

                        bulunanRakamlar.add(rakam);

                }

        }

        for (char rakam : bulunanRakamlar)
            System.out.println(rakam);
    }
}
