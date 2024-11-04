package BankaOtomasyonu;
import java.util.ArrayList;
import java.util.HashMap;

public class BankaOtomasyonu {
    private HashMap<String, Kullanici> kullanicilar = new HashMap<>();
    private HashMap<String, KrediKarti> krediKartlari = new HashMap<>();
    private static ArrayList<Musteri> musteriler = new ArrayList<>();
    private static ArrayList<Personel> personeller = new ArrayList<>();
    private static ArrayList<Yonetici> yoneticiler = new ArrayList<>();

    public void kullaniciEkle(Kullanici kullanici) {
        kullanicilar.put(kullanici.getKullaniciAdi(), kullanici);
    }

    public void islemYap(String kullaniciAdi, String sifre, double miktar) {
        Kullanici kullanici = kullanicilar.get(kullaniciAdi);
        if (kullanici != null && kullanici.getSifre().equals(sifre)) {
            kullanici.paraCek(miktar); 
        } else {
            System.out.println("Kullanıcı bulunamadı veya şifre hatalı!");
        }
    }

    public void krediKartiBasvuru(String kullaniciAdi) {
        Kullanici kullanici = kullanicilar.get(kullaniciAdi);
        if (kullanici instanceof Musteri) {
            Musteri musteri = (Musteri) kullanici;
            KrediKarti kart = new KrediKarti(musteri, 1000.0); 
            krediKartlari.put(kullaniciAdi, kart);
            System.out.println(musteri.getAd() + " " + musteri.getSoyad() + " için kredi kartı başvurusu yapıldı.");
        } else {
            System.out.println("Kredi kartı başvurusu sadece müşteriler için geçerlidir.");
        }
    }
}
