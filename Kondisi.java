
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

    public Kondisi(String idKondisi, String namaKondisi, String keterangan) {
        this.idKondisi = idKondisi;
        this.namaKondisi = namaKondisi;
        this.keterangan = keterangan;
    }

    public void tampilInfoKondisi() {
        System.out.println("ID Kondisi: " + idKondisi);
        System.out.println("Nama Kondisi: " + namaKondisi);
        System.out.println("Keterangan: " + keterangan);
    }
}