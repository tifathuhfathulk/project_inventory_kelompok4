
/**
 * Write a description of class Kondisi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kondisi
{
    private String idKondisi;
    private String namaKondisi;
    private String keterangan;
    
    // Constructor untuk menginisialisasi atribut kondisi
    public Kondisi(String idKondisi, String namaKondisi, String keterangan) {
        this.idKondisi = idKondisi;
        this.namaKondisi = namaKondisi;
        this.keterangan = keterangan;
    }
    
    // Getter dan Setter untuk mengakses dan mengubah data
    public String getIdKondisi() {
        return idKondisi;
    }
    
    public void setIdKondisi(String idKondisi) {
        this.idKondisi = idKondisi;
    }
    
    public String getNamaKondisi() {
        return namaKondisi;
    }
    
    public void setNamaKondisi(String namaKondisi) {
        this.namaKondisi = namaKondisi;
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    // Method untuk menampilkan informasi kondisi
    public void tampilInfoKondisi() {
        System.out.println("ID Kondisi   : " + idKondisi);
        System.out.println("Nama Kondisi : " + namaKondisi);
        System.out.println("Keterangan   : " + keterangan);
        System.out.println("----------------------------------------");
    }
}