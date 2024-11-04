package BankaOtomasyonu;

public class KrediKarti {
	 private Musteri sahip;
	    private double limit;
	    private double borc;

	    public KrediKarti(Musteri sahip, double limit) {
	        this.sahip = sahip;
	        this.limit = limit;
	        this.borc = 0.0;
	    }

	    public void harcamaYap(double miktar) {
	        if (borc + miktar <= limit) {
	            borc += miktar;
	            System.out.println(miktar + " TL harcama yapıldı. Toplam borç: " + borc);
	        } else {
	            System.out.println("Limit aşıldı. İşlem yapılamadı.");
	        }
	    }

	    public void borcOde(double miktar) {
	        if (miktar <= borc) {
	            borc -= miktar;
	            System.out.println(miktar + " TL borç ödendi. Kalan borç: " + borc);
	        } else {
	            System.out.println("Girilen miktar borçtan fazla. İşlem yapılamadı.");
	        }
	    }
}
