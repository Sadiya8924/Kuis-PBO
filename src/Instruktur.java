public class Instruktur {
    private String idInstruktur;
    private String namaInstruktur;
    private String keahlian;

    public Instruktur(String idInstruktur, String namaInstruktur, String keahlian) {
        this.idInstruktur = idInstruktur;
        this.namaInstruktur = namaInstruktur;
        this.keahlian = keahlian;
    }

    public String getIdInstruktur() {
        return idInstruktur;
    }

    public String getNamaInstruktur() {
        return namaInstruktur;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void buatKonten() {
        System.out.println(namaInstruktur + " sedang membuat konten dalam bidang " + keahlian);
    }

    public void ajar() {
        System.out.println(namaInstruktur + " sedang mengajar kursus.");
    }
}