package BankaOtomasyonu;

public interface Islemler {
	
    void bakiyeSorgula();
    void paraCek(double miktar);
    void paraYatir(double miktar);
    void paraTransferiYap(String aliciKullaniciAdi, double miktar);
    void faturaOde(String faturaTuru, double tutar);
    void krediKartiBorcuOde(double miktar);
    void yatirimYap(String yatirimTuru, double miktar);
    void dovizAl(String dovizTuru, double miktar);
    void dovizSat(String dovizTuru, double miktar);
}
