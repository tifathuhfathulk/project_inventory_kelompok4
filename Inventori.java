
/**
 * Write a description of class Iventori here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.ArrayList;
public class Inventori
{

    private ArrayList<Barang> daftarBarang;

    // Constructor
    public Inventori() {
        daftarBarang = new ArrayList<>();
    }

    // Method untuk menambah barang baru
    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
        System.out.println("Berhasil menambahkan: " + b.getNamaBarang());
    }

    // Method untuk menampilkan seluruh daftar barang
    public void tampilkanSemuaBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Inventori masih kosong.");
            return;
        }
        System.out.println("\n=== DAFTAR INVENTORI BARANG ===");
        for (Barang b : daftarBarang) {
            b.tampilInfo();
        }
        System.out.println("==============================\n");
    }

    // Method untuk mencari barang berdasarkan kode
    public Barang cariBarang(String kodeBarang) {
        for (Barang b : daftarBarang) {
            if (b.getKodeBarang().equalsIgnoreCase(kodeBarang)) {
                return b;
            }
        }
        return null;
    }

    // Method untuk mengupdate stok barang
    public void updateStok(String kodeBarang, int stokBaru) {
        Barang b = cariBarang(kodeBarang);
        if (b != null) {
            b.setStok(stokBaru);
            System.out.println("Stok barang " + b.getNamaBarang() + " berhasil diubah menjadi " + stokBaru);
        } else {
            System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan!");
        }
    }

}