
/**
 * Write a description of class Lokasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lokasi
{
    private String idLokasi;
    private String namaLokasi;
    private String keterangan;

    public Lokasi(String idLokasi, String namaLokasi, String keterangan) {
        this.idLokasi = idLokasi;
        this.namaLokasi = namaLokasi;
        this.keterangan = keterangan;
    }

    public String getIdLokasi() { return idLokasi; }
    public void setIdLokasi(String idLokasi) { this.idLokasi = idLokasi; }

    public String getNamaLokasi() { return namaLokasi; }
    public void setNamaLokasi(String namaLokasi) { this.namaLokasi = namaLokasi; }

    public String getKeterangan() { return keterangan; }
    public void setKeterangan(String keterangan) { this.keterangan = keterangan; }

    public void tampilInfo() {
        System.out.println("ID Lokasi: " + idLokasi + " | Tempat: " + namaLokasi + " (" + keterangan + ")");
    }
}