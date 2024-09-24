class Peserta {
    private String idPeserta;
    private String namaPeserta;
    private String email;

    public Peserta(String idPeserta, String namaPeserta, String email) {
        this.idPeserta = idPeserta;
        this.namaPeserta = namaPeserta;
        this.email = email;
    }

    public String getIdPeserta() {
        return idPeserta;
    }

    public String getNamaPeserta() {
        return namaPeserta;
    }

    public String getEmail() {
        return email;
    }

    public void mendaftar(String namaKursus) {
        System.out.println(namaPeserta + " telah mendaftar untuk kursus " + namaKursus);
    }

    public void ikutKursus() {
        System.out.println(namaPeserta + " sedang mengikuti kursus.");
    }
}