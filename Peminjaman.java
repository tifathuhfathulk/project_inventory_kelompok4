
/**
 * Write a description of class Peminjaman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Peminjaman
{
    private String idPeminjaman;
    private String tanggalPinjam;
    private Pengguna peminjam;
    private Barang barang;
    private int jumlahPinjam;
    private String status; // "Dipinjam" atau "Dikembalikan"

    public Peminjaman(String idPeminjaman, String tanggalPinjam, Pengguna peminjam, Barang barang, int jumlahPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.peminjam = peminjam;
        this.barang = barang;
        this.jumlahPinjam = jumlahPinjam;
        this.status = "Dipinjam";

        // Mengurangi stok saat dipinjam
        if (barang.getStok() >= jumlahPinjam) {
            barang.setStok(barang.getStok() - jumlahPinjam);
        } else {
            System.out.println("Stok tidak cukup untuk dipinjam!");
        }
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Barang getBarang() { return barang; }
    public int getJumlahPinjam() { return jumlahPinjam; }

    public void tampilInfoPeminjaman() {
        System.out.println("ID Pinjam: " + idPeminjaman + " | Peminjam: " + peminjam.getNamaPengguna());
        System.out.println("Barang: " + barang.getNamaBarang() + " (" + jumlahPinjam + " unit) | Status: " + status);
    }
}