
/**
 * Write a description of class Pengembalian here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pengembalian
{
    private String idPengembalian;
    private String idPeminjaman;
    private String tanggalPengembalian;
    private String kondisiBarang;
    private String keterangan;

    public Pengembalian(String idPengembalian, String idPeminjaman, String tanggalPengembalian, String kondisiBarang, String keterangan) {
        this.idPengembalian = idPengembalian;
        this.idPeminjaman = idPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.kondisiBarang = kondisiBarang;
        this.keterangan = keterangan;
    }

    public String getIdPengembalian() {
        return idPengembalian;
    }

    public void setIdPengembalian(String idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public String getKondisiBarang() {
        return kondisiBarang;
    }

    public void setKondisiBarang(String kondisiBarang) {
        this.kondisiBarang = kondisiBarang;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void tampilInfo() {
        System.out.println("ID Pengembalian: " + idPengembalian);
        System.out.println("ID Peminjaman: " + idPeminjaman);
        System.out.println("Tanggal Pengembalian: " + tanggalPengembalian);
        System.out.println("Kondisi Barang: " + kondisiBarang);
        System.out.println("Keterangan: " + keterangan);
    }
}
