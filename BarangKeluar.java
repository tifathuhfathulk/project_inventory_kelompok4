
/**
 * Write a description of class BarangKeluar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BarangKeluar
{
    private String idTransaksiKeluar;
    private String tanggal;
    private Barang barang;
    private int jumlahKeluar;
    private String tujuan;

    public BarangKeluar(String idTransaksiKeluar, String tanggal, Barang barang, int jumlahKeluar, String tujuan) {
        this.idTransaksiKeluar = idTransaksiKeluar;
        this.tanggal = tanggal;
        this.barang = barang;
        this.jumlahKeluar = jumlahKeluar;
        this.tujuan = tujuan;

        // Validasi dan pengurangan stok otomatis
        if (barang.getStok() >= jumlahKeluar) {
            barang.setStok(barang.getStok() - jumlahKeluar);
        } else {
            System.out.println("Peringatan: Stok " + barang.getNamaBarang() + " tidak mencukupi!");
        }
    }

    public void tampilInfoTransaksi() {
        System.out.println("No Transaksi Keluar: " + idTransaksiKeluar + " | Tanggal: " + tanggal);
        System.out.println("Barang: " + barang.getNamaBarang() + " (- " + jumlahKeluar + ") | Tujuan: " + tujuan);
    }

}