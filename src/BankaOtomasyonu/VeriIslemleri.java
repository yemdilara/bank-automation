package BankaOtomasyonu;

public interface VeriIslemleri {
	void veriEkle(Object obj);
    void veriSil(Object obj);
    void veriGuncelle(Object obj);
    Object veriGetir(String id);
}
