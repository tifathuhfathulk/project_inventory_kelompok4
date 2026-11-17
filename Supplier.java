
/**
 * Write a description of class Supplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Supplier
{
    private String idSupplier;
    private String namaSupplier;
    private String noTelepon;
    private String alamat;

    public Supplier(String idSupplier, String namaSupplier, String noTelepon, String alamat) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }

    public String getIdSupplier() { return idSupplier; }
    public void setIdSupplier(String idSupplier) { this.idSupplier = idSupplier; }

    public String getNamaSupplier() { return namaSupplier; }
    public void setNamaSupplier(String namaSupplier) { this.namaSupplier = namaSupplier; }

    public String getNoTelepon() { return noTelepon; }
    public void setNoTelepon(String noTelepon) { this.noTelepon = noTelepon; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public void tampilInfo() {
        System.out.println("ID: " + idSupplier + " | Supplier: " + namaSupplier + " | Telp: " + noTelepon);
    }
}