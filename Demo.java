
/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{
void main() {

    // Membuat objek Kategori
    Kategori kategori1 = new Kategori("K001", "Elektronik");
    Kategori kategori2 = new Kategori("K002", "Peralatan Kantor");

    // Membuat objek Lokasi
    Lokasi lokasi1 = new Lokasi("L001", "Gudang Utama", "Tempat penyimpanan utama");
    Lokasi lokasi2 = new Lokasi("L002", "Ruang Admin", "Penyimpanan peralatan kantor");

    // Membuat objek Kondisi
    Kondisi kondisi1 = new Kondisi("KON001", "Baik", "Berfungsi normal");
    Kondisi kondisi2 = new Kondisi("KON002", "Rusak", "Mengalami kerusakan");

    // Membuat objek Supplier
    Supplier supplier1 = new Supplier("S001", "PT Sumber Makmur", "08123456789", "Bandar Lampung");
    Supplier supplier2 = new Supplier("S002", "CV Berkah Jaya", "08234567890", "Metro");

    // Membuat objek Barang
    Barang barang1 = new Barang("B001", "Laptop Asus", kategori1, lokasi1, kondisi1, 10, 7500000);
    Barang barang2 = new Barang("B002", "Printer Epson", kategori2, lokasi2, kondisi2, 5, 2500000);

    // Mengubah data barang
    barang1.setHarga(7800000);
    barang2.setStok(8);

    // Membuat objek Barang Masuk
    BarangMasuk masuk1 = new BarangMasuk("TM001", "17-11-2026", barang1, supplier1, 5);
    BarangMasuk masuk2 = new BarangMasuk("TM002", "17-11-2026", barang2, supplier2, 3);

    // Menampilkan informasi barang
    System.out.println("===== DATA BARANG =====");
    barang1.tampilInfo();
    barang2.tampilInfo();

    // Menampilkan informasi kategori
    System.out.println("===== DATA KATEGORI =====");
    kategori1.tampilInfo();
    kategori2.tampilInfo();

    // Menampilkan informasi lokasi
    System.out.println("===== DATA LOKASI =====");
    lokasi1.tampilInfo();
    lokasi2.tampilInfo();

    // Menampilkan informasi kondisi
    System.out.println("===== DATA KONDISI =====");
    kondisi1.tampilInfoKondisi();
    kondisi2.tampilInfoKondisi();

    // Menampilkan informasi supplier
    System.out.println("===== DATA SUPPLIER =====");
    supplier1.tampilInfo();
    supplier2.tampilInfo();

    // Menampilkan transaksi barang masuk
    System.out.println("===== TRANSAKSI BARANG MASUK =====");
    masuk1.tampilInfoTransaksi();
    masuk2.tampilInfoTransaksi();

    // Menampilkan stok akhir
    System.out.println("===== STOK AKHIR =====");
    barang1.tampilInfo();
    barang2.tampilInfo();
}  
}