
/**
 * Write a description of class Laporan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Laporan {
    private String idLaporan;
    private String jenisLaporan; // Contoh: "Stok Barang", "Transaksi Masuk/Keluar"

    public Laporan(String idLaporan, String jenisLaporan) {
        this.idLaporan = idLaporan;
        this.jenisLaporan = jenisLaporan;
    }

    public void cetakLaporanStok(Inventori inventori) {
        System.out.println("\n========== LAPORAN " + jenisLaporan.toUpperCase() + " ==========");
        inventori.tampilkanSemuaBarang();
        System.out.println("==================================================\n");
    }

}