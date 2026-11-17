
/**
 * Write a description of class Kategori here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kategori
{
    private String idKategori;
    private String namaKategori;

    public Kategori(String idKategori, String namaKategori) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
    }

    public String getIdKategori() { return idKategori; }
    public void setIdKategori(String idKategori) { this.idKategori = idKategori; }

    public String getNamaKategori() { return namaKategori; }
    public void setNamaKategori(String namaKategori) { this.namaKategori = namaKategori; }

    public void tampilInfo() {
        System.out.println("ID Kategori: " + idKategori + " | Nama: " + namaKategori);
    }
}