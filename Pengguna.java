
/**
 * Write a description of class Pengguna here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pengguna
{
    private String idPengguna;
    private String namaPengguna;
    private String role; // Contoh: Admin, Petugas, Peminjam

    public Pengguna(String idPengguna, String namaPengguna, String role) {
        this.idPengguna = idPengguna;
        this.namaPengguna = namaPengguna;
        this.role = role;
    }

    public String getIdPengguna() { return idPengguna; }
    public void setIdPengguna(String idPengguna) { this.idPengguna = idPengguna; }

    public String getNamaPengguna() { return namaPengguna; }
    public void setNamaPengguna(String namaPengguna) { this.namaPengguna = namaPengguna; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public void tampilInfo() {
        System.out.println("ID: " + idPengguna + " | Nama: " + namaPengguna + " | Role: " + role);
    }

}