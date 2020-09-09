/**
*
* @author Furkan KOÇ - G171210303 - furkan.koc8@ogr.sakarya.edu.tr
* @author Muzaffer Haşim GEZGİN - G151210123 - muzaffer.gezgin@ogr.sakarya.edu.tr
* @since 16/03/2019
* <p>
* Programlama Dilleri Prensipleri dersi 2. ÖDEVİ
* </p>
*/
package testprogrami;
import RastgeleKarakter.RastgeleKarakter;
/**
 *
 * @author FURKAN
 */
public class TestProgrami {

  
    public static void main(String[] args) {
        
        RastgeleKarakter random = new RastgeleKarakter(); //Sınıftan nesne üretiyoruz.
        System.out.println("Rastgele Karakter : "); //rastgele karakter oluşturma.
        for (int i = 0; i < 100; i++) {
            System.out.print(random.rastgeleKarakter() + " ");
        }
        
        System.out.println("\n\n Rastgele 3 Karakter : "); //istenen adet kadar yan yana rastgele karakter oluşturma.
        for (int i = 0; i < 100; i++) {
            System.out.print(random.rastgeleKarakter(3) + " ");
        }
        
        System.out.println("\n\n Verilen 2 Karakter Arasında : "); //verilen 2 karakter arasından rastgele karakter oluşturma.
        for (int i = 0; i < 100; i++) {
            System.out.print(random.rastgeleKarakter('a', 'k') + " ");
        }
        
        System.out.println("\n\n Verilen 2 Karakter Arasında İstenen Sayıda : "); //verilen 2 karakter arasından istenen adet kadar rastgele karakter oluşturma.
        for (int i = 0; i < 100; i++) {
            System.out.print(random.rastgeleKarakter('a', 'k',4) + " ");
        }
        
        System.out.println("\n\n Belirtilen Karakterler Arasından : "); //belirtilen karakterler arasından rastgele karakter oluşturma.
        for (int i = 0; i < 100; i++) 
        {
            System.out.print(random.belirtilenKarakterlerArasinda('m','a','t','g','f','e') + " ");
        }
        
         System.out.println("\n\n Belirtilen Karakterler Arasından İstenen Adet Kadar : "); //belirtilen karakterler arasından istenen adet kadar yan yana rastgele karakter oluşturma
        for (int i = 0; i < 100; i++) {
            System.out.print(random.belirtilenKarakterlerArasinda(2,'m','a','t','g','e','f') + " ");
        }
        
        System.out.println("\n\n Cümle : "); //istenen harf sayısı kadar kelimeli rastgele cümle oluşturma.
        for (int i = 0; i < 100; i++) {
            System.out.print(random.cumle(15) + " ");
        }
        
    }
    
}
