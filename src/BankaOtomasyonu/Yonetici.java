package BankaOtomasyonu;

 class Yonetici extends Personel {
	   private double prim;
       private String departman;
       
	    public Yonetici(String ad, String soyad, String kullaniciAdi, String sifre,String sicilNo, String string) {
	        super(ad, soyad, kullaniciAdi, sifre, sicilNo, getDepartman());
	        this.prim = prim; 
            this.departman = departman;
	    }

	    public double getPrim() {
	        return prim;
	    }

	    public void setPrim(double prim) {
	        this.prim = prim;
	    }
}

