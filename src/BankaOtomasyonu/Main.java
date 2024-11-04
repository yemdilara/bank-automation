package BankaOtomasyonu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Kullanici> kullanicilar = new HashMap<>();
    private static ArrayList<Musteri> musteriler = new ArrayList<>();
    private static ArrayList<Personel> personeller = new ArrayList<>();
    private static ArrayList<Yonetici> yoneticiler = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean devam = true;

    
            Musteri musteri1 = new Musteri("Ali", "Yılmaz", "aliyilmaz", "1234", "1001", 750);
            Musteri musteri2 = new Musteri("Ayşe", "Kaya", "aysekaya", "5678", "1002", 800);
            musteriler.add(musteri1);
            musteriler.add(musteri2);

            Personel personel1 = new Personel("Ahmet", "Demir", "ahmetdemir", "9090", "P001", "IT");
            Personel personel2 = new Personel("Fatma", "Yıldız", "fatmayildiz", "7878", "P002", "HR");
            personeller.add(personel1);
            personeller.add(personel2);

            Yonetici yonetici1 = new Yonetici("Mehmet", "Şahin", "mehmetsahin", "1010", "Y001", "Finance");
            Yonetici yonetici2 = new Yonetici("Zeynep", "Kara", "zeynepkara", "3030", "Y002", "Marketing");
            yoneticiler.add(yonetici1);
            yoneticiler.add(yonetici2);

            while (devam) {
                System.out.println("Banka Otomasyonuna Hoş Geldiniz!");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                System.out.println("1. Müşteri Girişi");
                System.out.println("2. Personel Girişi");
                System.out.println("3. Yönetici Girişi");
                System.out.println("4. Çıkış");
                System.out.print("Seçiminiz: ");

                int secim = scanner.nextInt();
                scanner.nextLine(); 

                switch (secim) {
                    case 1:
                        musteriGirisi();
                        break;
                    case 2:
                        personelGirisi();
                        break;
                    case 3:
                        yoneticiGirisi();
                        break;
                    case 4:
                        devam = false;
                        System.out.println("Banka otomasyonundan çıkış yapılıyor...");
                        break;
                    default:
                        System.out.println("Geçersiz seçim!");
                        break;
                }
            }
        }
    }

    public static void musteriGirisi() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Müşteri Girişi");
            System.out.print("Ad: ");
            String ad = scanner.nextLine();

            System.out.print("Soyad: ");
            String soyad = scanner.nextLine();

            System.out.print("Kullanıcı Adı: ");
            String kullaniciAdi = scanner.nextLine();

            System.out.print("Şifre: ");
            String sifre = scanner.nextLine();

            System.out.print("Hesap Numarası: ");
            String hesapNo = scanner.nextLine();

            System.out.print("Kredi Skoru: ");
            double krediSkoru = scanner.nextDouble();
            scanner.nextLine(); 

            Musteri musteri = new Musteri(ad, soyad, kullaniciAdi, sifre, hesapNo, krediSkoru);
            musteriler.add(musteri);
            kullanicilar.put(kullaniciAdi, musteri);

            System.out.println("Müşteri Oluşturuldu: " + musteri.getAd() + " " + musteri.getSoyad());
        }
    }

    public static void personelGirisi() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Personel Girişi");
            System.out.print("Ad: ");
            String ad = scanner.nextLine();

            System.out.print("Soyad: ");
            String soyad = scanner.nextLine();

            System.out.print("Kullanıcı Adı: ");
            String kullaniciAdi = scanner.nextLine();

            System.out.print("Şifre: ");
            String sifre = scanner.nextLine();

            System.out.print("Sicil Numarası: ");
            String sicilNo = scanner.nextLine();

            System.out.print("Departman: ");
            String departman = scanner.nextLine();

            Personel personel = new Personel(ad, soyad, kullaniciAdi, sifre, sicilNo, departman);
            personeller.add(personel);
            kullanicilar.put(kullaniciAdi, personel);

            System.out.println("Personel Oluşturuldu: " + personel.getAd() + " " + personel.getSoyad());
        }
    }

    public static void yoneticiGirisi() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Yönetici Girişi");
            System.out.print("Ad: ");
            String ad = scanner.nextLine();

            System.out.print("Soyad: ");
            String soyad = scanner.nextLine();

            System.out.print("Kullanıcı Adı: ");
            String kullaniciAdi = scanner.nextLine();

            System.out.print("Şifre: ");
            String sifre = scanner.nextLine();

            System.out.print("Yönetici Kodu: ");
            String yoneticiKodu = scanner.nextLine();

            System.out.print("Departman: ");
            String departman = scanner.nextLine();

            Yonetici yonetici = new Yonetici(ad, soyad, kullaniciAdi, sifre, yoneticiKodu, departman);
            yoneticiler.add(yonetici);
            kullanicilar.put(kullaniciAdi, yonetici);

            System.out.println("Yönetici Oluşturuldu: " + yonetici.getAd() + " " + yonetici.getSoyad());
        }
    }
}

