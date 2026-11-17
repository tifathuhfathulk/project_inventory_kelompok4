
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
    private Kategori kategori;      // Relasi ke class Kategori
    private Lokasi lokasi;         // Relasi ke class Lokasi
    private Kondisi kondisi;       // Relasi ke class Kondisi
    private int stok;
    private double harga;

    // Constructor untuk menginisialisasi atribut barang
    public Barang(String kodeBarang, String namaBarang, Kategori kategori, Lokasi lokasi, Kondisi kondisi, int stok, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.lokasi = lokasi;
        this.kondisi = kondisi;
        this.stok = stok;
        this.harga = harga;
    }
    
    // Getter dan Setter untuk mengakses dan mengubah data
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
    
    public Kategori getKategori() {
        return kategori;
    }
    
    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
    
    public Lokasi getLokasi() {
        return lokasi;
    }
    
    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }
    
    public Kondisi getKondisi() {
        return kondisi;
    }
    
    public void setKondisi(Kondisi kondisi) {
        this.kondisi = kondisi;
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
    
    // Method untuk menampilkan informasi lengkap barang
    public void tampilInfo() {
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Kategori    : " + (kategori != null ? kategori.getNamaKategori() : "Belum ada"));
        System.out.println("Lokasi      : " + (lokasi != null ? lokasi.getNamaLokasi() : "Belum ada"));
        System.out.println("Kondisi     : " + (kondisi != null ? kondisi.getNamaKondisi() : "Belum ada"));
        System.out.println("Stok        : " + stok);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("----------------------------------------");
    }

}