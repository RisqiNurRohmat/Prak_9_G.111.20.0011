public class Main {
    public static void main(String[] args) {
 
        Buku buku1 = new Buku("B001", "Pemrograman Java");
        Buku buku2 = new Buku("B002", "Pemrograman C++");
        BukuLuar buku3 = new BukuLuar("G0011", "Harry Potter");
 
        Petugas petugas1 = new Petugas("Lazzor", "Q001");
        Peminjam peminjam1 = new Mahasiswa();
        Peminjam peminjam2 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Risqi");
        peminjam1.setKodePeminjam("G0011");
        peminjam2.setNamaPeminjam("Nur");
        peminjam2.setKodePeminjam("G0011");
        
        peminjam1.doLogin();
        peminjam2.doLogin();
        
        try{
        Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku1);
 
        System.out.println("Peminjaman: " + peminjaman1.getPeminjam().getNamaPeminjam());
        System.out.println("Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
        System.out.println("Buku: " + peminjaman1.getBuku().getidBuku());
        System.out.println("Nama Buku: " + peminjaman1.getBuku().getNamaBuku() );
        Denda denda1 = new Denda(peminjaman1, 11);
        System.out.println("Tagihan denda: " + denda1.getTagihan());
        System.out.println("=== Denda ditambahkan ! ===");

            peminjam2.addAntiDenda();

            System.out.println("Tagihan denda: " + denda1.getTagihan());

            System.out.println("=== Denda dihapuskan ! ===");

            peminjam2.removeAntiDenda();

            System.out.println("Tagihan denda: " + denda1.gethapus());

        System.out.println("===================================>");

        Peminjaman peminjaman2 = new Peminjaman(peminjam2, petugas1, buku3);
        
        System.out.println("Peminjaman: " + peminjaman2.getPeminjam().getNamaPeminjam());
        System.out.println("Petugas: " + peminjaman2.getPetugas().getNamaPetugas());
        System.out.println("Buku: " + peminjaman2.getBuku().getidBuku());
        System.out.println("Nama Buku: " + peminjaman2.getBuku().getNamaBuku() );
        Denda denda2 = new Denda(peminjaman1, 2);
        System.out.println("Tagihan denda: " + denda2.getTagihan());

         System.out.println("=== Denda ditambahkan ! ===");

            peminjam2.addAntiDenda();

            System.out.println("Tagihan denda: " + denda2.getTagihan());

            System.out.println("=== Denda dihapuskan ! ===");

            peminjam2.removeAntiDenda();

            System.out.println("Tagihan denda: " + denda2.gethapus());

        } catch (Exception e) {
            System.out.println("terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Pemograman Selesai");
}
    }
   
 }
