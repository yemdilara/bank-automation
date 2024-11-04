package BankaOtomasyonu;

 class Personel extends Kullanici implements VeriIslemleri {
	    private String sicilNo;
	    private static String departman;

	    public Personel(String ad, String soyad, String kullaniciAdi, String sifre, String sicilNo, String departman) {
	    	super(ad, soyad, kullaniciAdi, sifre);
	        this.sicilNo = sicilNo;
	        Personel.departman = departman;
	        this.bakiye = 0; 
	    }

	    public String getSicilNo() {
	        return sicilNo;
	    }

	    public void setSicilNo(String sicilNo) {
	        this.sicilNo = sicilNo;
	    }

	    public static String getDepartman() {
	        try {
				try {
					return departman;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return departman;
	    }

	    public void setDepartman(String departman) {
	        Personel.departman = departman;
	    }


	@Override
	public void veriEkle(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void veriSil(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void veriGuncelle(Object obj) {
		// TODO Auto-generated method stub

	}
	 
}
