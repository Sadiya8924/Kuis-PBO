public class Konten {
    private int idKonten, durasi;
    private String tipeKonten, isiKonten;  

    public Konten(int idKonten, String tipeKonten, int durasi, String isiKonten) {
        this.idKonten = idKonten;
        this.tipeKonten = tipeKonten;
        this.durasi = durasi;
        this.isiKonten = isiKonten;
    }

    public int getIdKonten() {
        return idKonten;
    }

    public void setIdKonten(int idKonten) {
        this.idKonten = idKonten;
    }

    public String getTipeKonten() {
        return tipeKonten;
    }

    public void setTipeKonten(String tipeKonten) {
        this.tipeKonten = tipeKonten;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getIsiKonten() {
        return isiKonten;
    }

    public void setIsiKonten(String isiKonten) {
        this.isiKonten = isiKonten;
    }

    public void tampilkan() {
        System.out.println("ID Konten: " + idKonten);
        System.out.println("Tipe Konten: " + tipeKonten);
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Isi Konten: " + isiKonten);
    }
}
