public class MainApp {
    public static void main(String[] args) {
        
        Kursus kursus1 = new Kursus(202, "Java Programming", "Belajar dasar pemrograman Java");

        kursus1.tampilkanInfoKursus();
        kursus1.daftarPeserta();
        kursus1.bayar();

        Konten konten1 = new Konten(1, "Artikel", 15, "Belajar dasar permograman Java");
        konten1.tampilkan();

        Pembayaran pembayaran1 = new Pembayaran(1, "2024-09-25", 500000.0, 101, 202);
        Pembayaran pembayaran2 = new Pembayaran(2, "2024-09-26", 750000.0, 102, 203);

        System.out.println("Pembayaran 1");
        System.out.println("ID Pembayaran: " + pembayaran1.getId());
        System.out.println("Tanggal: " + pembayaran1.getTanggal());
        System.out.println("Jumlah: " + pembayaran1.getJumlah());
        System.out.println("ID Peserta: " + pembayaran1.getPesertaId());
        System.out.println("ID Kursus: " + pembayaran1.getKursusId());

        System.out.println("\nPembayaran 2");
        System.out.println("ID Pembayaran: " + pembayaran2.getId());
        System.out.println("Tanggal: " + pembayaran2.getTanggal());
        System.out.println("Jumlah: " + pembayaran2.getJumlah());
        System.out.println("ID Peserta: " + pembayaran2.getPesertaId());
        System.out.println("ID Kursus: " + pembayaran2.getKursusId());
    }
}