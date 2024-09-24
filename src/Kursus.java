public class Kursus {
    private String idKursus;
    private String namaKursus;
    private String deskripsi;

    public Kursus(String idKursus, String namaKursus, String deskripsi) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.deskripsi = deskripsi;
    }

    public String getIdKursus() {
        return idKursus;
    }

    public void setIdKursus(String idKursus) {
        this.idKursus = idKursus;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public void setNamaKursus(String namaKursus) {
        this.namaKursus = namaKursus;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void daftarPeserta() {
        System.out.println("Peserta telah berhasil mendaftar di kursus: " + namaKursus);
    }

    public void bayar() {
        System.out.println("Pembayaran berhasil untuk kursus: " + namaKursus);
    }

    public void tampilkanInfoKursus() {
        System.out.println("ID Kursus: " + idKursus);
        System.out.println("Nama Kursus: " + namaKursus);
        System.out.println("Deskripsi: " + deskripsi);
    }
}
