
/**
 * Write a description of class Barang here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Barang
{
    private String kodeBarang;
    private String namaBarang;
    private int stok;
    private double harga;

    
    public Barang(String kodeBarang, String namaBarang, int stok, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }

    
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Kode: " + kodeBarang + " | Nama: " + namaBarang + " | Stok: " + stok + " | Harga: Rp " + harga);
    }

}