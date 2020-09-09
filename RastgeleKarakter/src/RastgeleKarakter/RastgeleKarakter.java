/**
*
* @author Furkan KOÇ - G171210303 - furkan.koc8@ogr.sakarya.edu.tr
* @author Muzaffer Haşim GEZGİN - G151210123 - muzaffer.gezgin@ogr.sakarya.edu.tr
* @since 16/03/2019
* <p>
* Programlama Dilleri Prensipleri dersi 2. ÖDEVİ
* </p>
*/
package RastgeleKarakter;



/**
 *
 * @author FURKAN
 */
public class RastgeleKarakter {

    private int rastgeleSayi; //rastgeleSayi adında bir integer değişken oluşturuyoruz.

    /**
     * 
     * @return system.nanoTime'ı döndürdüğümüz fonksiyon.
     */

            
    private long sistemSaati() //Nanosaniye cinsinden tarihi döndürür.
    {
        return System.nanoTime(); //System.nanoTime'ı alıp döndürüyoruz.
    }
    
    /**
     * 
     * @return Rastgele Karakter oluşturmak için kullandığımız fonksiyon
     */
  
    public char rastgeleKarakter() //rastgele karakter ascii den yararlanarak.
    {
        while (true) //sonsuz döngü başlatıyoruz.
        {
            rastgeleSayi = (int) ((sistemSaati()) % 123); //nanosaniyeyi 123 e bölüp rastgele bir sayı oluşturuyoruz.
            if ((rastgeleSayi >= 65 && rastgeleSayi <= 90) || (rastgeleSayi >= 97 && rastgeleSayi <= 122)) //oluşturduğumuz sayı bir harfe denk geliyorsa if'in içine giriyoruz.
                break; //Eğer bir harfe denk gelirsek döngüyü sonlandırıyoruz.
        }

        return (char) rastgeleSayi; //harfi döndürüyoruz.
    }

    /**
     * 
     * @param adet
     * @return istenen adet kadar yan yana rastgele harf oluşturan fonksiyon.
     */
    
    public String rastgeleKarakter(int adet) // istenen adet kadar rastgele karakter oluşturma
    {
        String gecici = ""; //gecici adında bir string değişken oluşturuyoruz.
        for (int i = 1; i <= adet; i++) 
            gecici += rastgeleKarakter();; //Rastgele oluşan her harfi gecici'ye yan yana yazdırıyoruz.
        return gecici; //gecici'yi döndürüyoruz.
    }

    /**
     * 
     * @param minKarakter
     * @param maxKarakter
     * @return Verilen 2 harf arasında rastgele harf oluşturan fonksiyon.
     */
    
    public char rastgeleKarakter(char minKarakter, char maxKarakter) //verilen iki karakter arasında rastgele harf oluşturan fonksyon.
    {
        do 
        {
            rastgeleSayi = (int)rastgeleKarakter(); //rastgele bir harf oluşturuyoruz.
            if (rastgeleSayi >= (int)minKarakter && rastgeleSayi <= (int)maxKarakter) //oluşan harf istenilen harflerin arasında mı diye kontrol ediyoruz.
                break; //if'in içine girersek döngüyü kırıyoruz.

        } while (true);

        return (char) rastgeleSayi; // oluşan harfi döndürüyoruz.
    }

    /**
     * 
     * @param minKarakter
     * @param maxKarakter
     * @param adet
     * @return verilen iki karakter arasında rastgele harf oluşturan fonksyon.
     */
    
    public String rastgeleKarakter(char minKarakter, char maxKarakter, int adet) //verilen iki karakter arasında istenen adet kadar yan yana rastgele harf oluşturan fonksiyon.
    {
        String gecici = "";

        for (int i = 1; i <= adet; i++)  //istenen adet kadar bir for döngüsü oluşturuyoruz.
        {
            do 
            {
                rastgeleSayi = (int)rastgeleKarakter();
                if (rastgeleSayi >= (int)minKarakter && rastgeleSayi <= (int)maxKarakter) //oluşan harf istenilen harflerin arasında mı diye kontrol ediyoruz.
                    break; //if'in içine girersek döngüyü kırıyoruz.
                
            } while (true);

            gecici += (char)rastgeleSayi; //oluşturulan harfleri gecici değişkenine yan yana yazdırıyoruz.
        }

        return gecici; //geciciyi döndürüyoruz.
    }
    
    /**
     * 
     * @param karakterler
     * @return belirtilen karakterler arasından rastgele harf oluşturan fonksiyon.
     */
    
    public char belirtilenKarakterlerArasinda(char... karakterler) //belirtilen karakterler arasından rastgele harf oluşturan fonksiyon.
    {

        String gecici = "";
        int i = 0;

        for (; i < karakterler.length; i++) //belirtilen karakterlerin sayısı kadar bir for döngüsü oluşturuyoruz.
            gecici += karakterler[i]; //harfleri teker teker geciciye yazdırıyoruz.

        rastgeleSayi = (int)((rastgeleKarakter()) % i); //gelen toplam parametre sayısına bölümünden kalana göre rastgele sayı üretiyoruz.
        
        return gecici.charAt(rastgeleSayi); //gecicinin içinden rastgele bir tanesini döndürüyoruz.
    }
    
    /**
     * 
     * @param adet
     * @param karakterler
     * @return belirtilen karakterler arasından rastgele istenen adet kadar yan yana harf oluşturan fonksiyon.
     */
    
    public String belirtilenKarakterlerArasinda(int adet, char... karakterler) //belirtilen karakterler arasından rastgele istenen adet kadar yan yana harf oluşturan fonksiyon.
    {
        String geciciRastgeleSecilenKarakterler = "";
        String geciciKarakterler = "";

        int i = 0;

        for (int x = 0; x < adet; x++) //istenen adet kadar bir for açıyoruz.
        {
            for (int a = 0; a < karakterler.length; a++) //kaç tane karakter girildiyse o kadar uzunlukta bir for daha açıyoruz.
            {
                geciciKarakterler += karakterler[a];//karakterlerin hepsini teker teker geciciKarakterler değişkenine atıyoruz.
                i++;
            }

            rastgeleSayi = (int) ((rastgeleKarakter()) % i); //gelen toplam parametre sayısına bölümünden kalana göre rastgele sayı üretiyoruz..
            geciciRastgeleSecilenKarakterler += geciciKarakterler.charAt(rastgeleSayi); //rastgele karakterleri istenen adet kadar yan yana geciciRastgeleSecilenKarakterler değişkenine yazdırıyoruz.
        }

        return geciciRastgeleSecilenKarakterler; //geciciRastgeleSecilenKarakterler döndürüyoruz.
    }

    /**
     * 
     * @param harfSayisi
     * @return istenen harf sayısı kadar kelimelerle cümle oluşturan fonksiyon
     */
    
    public String cumle(int harfSayisi) 
    {
        String cumle = "";

        for (int i = 0; i < harfSayisi; i++) //istenen harf sayısı kadar bir for açıyoruz.
            cumle += rastgeleKarakter(); //oluşan harfleri cumle değişkenine atıyoruz.

        return cumle; //cumleyi döndürüyoruz.
    }
}
