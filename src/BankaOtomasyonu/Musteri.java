package BankaOtomasyonu;

 class Musteri extends Kullanici{
	    private String hesapNo;
	    private double krediSkoru;

	    
	    public Musteri(String ad, String soyad, String kullaniciAdi, String sifre, String hesapNo, double krediSkoru) {
	    	super(ad, soyad, kullaniciAdi, sifre);
	        this.hesapNo = hesapNo;
	        this.krediSkoru = krediSkoru;
	        this.bakiye = 0; 
	    }

	    public String getHesapNo() {
	        return hesapNo;
	    }

	    public void setHesapNo(String hesapNo) {
	        this.hesapNo = hesapNo;
	    }

	    public double getKrediSkoru() {
	        return krediSkoru;
	    }

	    public void setKrediSkoru(double krediSkoru) {
	        this.krediSkoru = krediSkoru;
	    }

	    public void krediSkoruSorgula() {
	        System.out.println("Kredi Skoru: " + krediSkoru);
	    }

}
