import java.util.Scanner;

public class Kdvtutari {
    public static void main (String[] args){
        double tutar, kdvliTutar, tutarToplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz:  ");
        tutar = input.nextDouble();

        //--------KOŞUL(İF-ELSE) İLE HESAPLAMA ALANI-------------------

        if (tutar > 0 && tutar < 1000)
        {
            kdvliTutar = tutar * 0.18;
            tutarToplam = tutar + kdvliTutar;
            System.out.println("Ücretiniz Kdv ile birlikte: "+tutarToplam);
        }

        if (tutar > 1000)
        {
            kdvliTutar = tutar * 0.08;
            tutarToplam = tutar + kdvliTutar;
            System.out.println("Ücretiniz Kdv ile birlikte: " + tutarToplam);
        }

        //--------------MANTIK OPERATÖRÜ İLE HESAPLAMA ALANI-----------------

        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        kdvliTutar = tutar * kdvOrani;
        tutarToplam = tutar + kdvliTutar;
        System.out.println("Ücretiniz Toplam: "+ tutarToplam);

        //ÖĞRENCİ NOTU: Çalıştırmak istediğnizde lütfen bir alanı deactive ediniz.


    }
}
