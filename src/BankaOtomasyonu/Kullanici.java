package BankaOtomasyonu;

public abstract class Kullanici implements Islemler, VeriIslemleri {
   
	protected String ad;
    protected String soyad;
    protected String kullaniciAdi;
    protected String sifre;
    protected double bakiye;

    public Kullanici(String ad, String soyad, String kullaniciAdi, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.bakiye = 0.0; 
    }

  
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

 
	    public void girisYap(String kullaniciAdi, String sifre) {
	        if (this.kullaniciAdi.equals(kullaniciAdi) && this.sifre.equals(sifre)) {
	            System.out.println("Giriş başarılı!");
	        } else {
	            System.out.println("Kullanıcı adı veya şifre hatalı!");
	        }
	    }

	    public void sifreDegistir(String yeniSifre) {
	        this.sifre = yeniSifre;
	        System.out.println("Şifre değiştirildi.");
	    }
	    
	@Override
	public void bakiyeSorgula() {
		
		System.out.println("Bakiye: " + bakiye);
    }

	@Override
	public void paraCek(double miktar) {
		  if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } else {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Yeni bakiye: " + bakiye);
        }
	}

	@Override
	public void paraYatir(double miktar) {
		bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
     }
	@Override
    public void paraTransferiYap(String aliciKullaniciAdi, double miktar) {
        
    }

    @Override
    public void faturaOde(String faturaTuru, double tutar) {
        
    }

    @Override
    public void krediKartiBorcuOde(double miktar) {
        
    }

    @Override
    public void yatirimYap(String yatirimTuru, double miktar) {
        
    }

    @Override
    public void dovizAl(String dovizTuru, double miktar) {
       
    }

    @Override
    public void dovizSat(String dovizTuru, double miktar) {
       
    }

    @Override
    public void veriEkle(Object obj) {
        
    }

    @Override
    public void veriSil(Object obj) {
       
    }

    @Override
    public void veriGuncelle(Object obj) {
       
    }

    @Override
    public Object veriGetir(String id) {
      
        return null;
    }
	}

