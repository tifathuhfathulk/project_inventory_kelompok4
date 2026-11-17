
/**
 * Write a description of class BarangMasuk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BarangMasuk
{
    private String idTransaksiMasuk;
    private String tanggal;
    private Barang barang;
    private Supplier supplier;
    private int jumlahMasuk;

    public BarangMasuk(String idTransaksiMasuk, String tanggal, Barang barang, Supplier supplier, int jumlahMasuk) {
        this.idTransaksiMasuk = idTransaksiMasuk;
        this.tanggal = tanggal;
        this.barang = barang;
        this.supplier = supplier;
        this.jumlahMasuk = jumlahMasuk;
        
        // Otomatis menambah stok pada objek barang yang masuk
        barang.setStok(barang.getStok() + jumlahMasuk);
    }

    public void tampilInfoTransaksi() {
        System.out.println("No Transaksi Masuk: " + idTransaksiMasuk + " | Tanggal: " + tanggal);
        System.out.println("Barang: " + barang.getNamaBarang() + " (+ " + jumlahMasuk + ")");
        System.out.println("Supplier: " + supplier.getNamaSupplier());
    }

}