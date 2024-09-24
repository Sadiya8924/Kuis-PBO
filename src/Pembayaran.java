public class Pembayaran {
    private int id;
    private String tanggal; 
    private double jumlah;
    private int pesertaId;
    private int kursusId;

    public Pembayaran(int id, String tanggal, double jumlah, int pesertaId, int kursusId) {
        this.id = id;
        this.tanggal = tanggal;  
        this.jumlah = jumlah;
        this.pesertaId = pesertaId;
        this.kursusId = kursusId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public int getPesertaId() {
        return pesertaId;
    }

    public void setPesertaId(int pesertaId) {
        this.pesertaId = pesertaId;
    }

    public int getKursusId() {
        return kursusId;
    }

    public void setKursusId(int kursusId) {
        this.kursusId = kursusId;
    }
}

