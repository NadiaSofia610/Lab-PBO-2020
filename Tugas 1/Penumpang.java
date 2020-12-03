
/**
 * Write a description of class Penumpang here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Penumpang {
    // instance variables - replace the example below with your own
    private String nama;
    private int umur;
    private boolean hamil = true;
    /**
     * Constructor untuk objek-objek di kelas Penumpang
     * @param nama penumpang
     * @param umur penumpang
     * @param hamil 
     */
    public Penumpang(String nama, int umur, boolean hamil) {
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }
    
    /**
     * Method untuk mengembalikan nama penumpang
     * @return nama penumpang
     */
    public String getNama() {
        return this.nama;
    }
    
    /**
     * Method untuk mengembalikan umur penumpang
     * @return umur penumpang
     */
    public int getUmur() {
        return this.umur;
    }
    
    /**
     * Method untuk mengembalikan pernyataan benar atau salah bagi penumpang yang hamil
     * @return hamil
     */
    public boolean getHamil() {
        return this.hamil;
    }
}