public class MainApp {
    public static void main(String[] args) {
        
        Kursus kursus1 = new Kursus(202, "Java Programming", "Belajar dasar pemrograman Java");

        kursus1.tampilkanInfoKursus();
        kursus1.daftarPeserta();
        kursus1.bayar();

        Konten konten1 = new Konten(1, "Artikel", 15, "Belajar dasar permograman Java");
        konten1.tampilkan();

        Pembayaran pembayaran1 = new Pembayaran(1, "2024-09-24", 500000.00, 101, 202);

        System.out.println("ID Pembayaran: " + pembayaran1.getId());
        System.out.println("Tanggal Pembayaran: " + pembayaran1.getTanggal());
        System.out.println("Jumlah Pembayaran: " + pembayaran1.getJumlah());
        System.out.println("ID Peserta: " + pembayaran1.getPesertaId());
        System.out.println("ID Kursus: " + pembayaran1.getKursusId());

        pembayaran1.setJumlah(550000.00);
        pembayaran1.setTanggal("2024-09-25");

        System.out.println("\nSetelah perubahan:");
        System.out.println("Tanggal Pembayaran: " + pembayaran1.getTanggal());
        System.out.println("Jumlah Pembayaran: " + pembayaran1.getJumlah());
    }
}