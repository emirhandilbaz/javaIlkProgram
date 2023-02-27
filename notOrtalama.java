/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
*/


package Java.ilKonu.egzersizler;

import java.util.Scanner;

public class notOrtalama {
    public static void main(String[] args){
        //Değişkenleri oluştur.
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        //Scanner sınıfımızı tanımladık.
        Scanner a = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Matematik notunuz: ");
        mat = a.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = a.nextInt();
        
        System.out.print("Kimya notunuz: ");
        kimya = a.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = a.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = a.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = a.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

        System.out.print("Not ortalamanız: " + sonuc);

        boolean kosul = sonuc >= 60;
        String str = kosul ? " Tebrikler, sınıfı geçtiniz!" : " Maalesef, sınıfta kaldınız...";
        System.out.println(str);


        
    }
    
}
