
/**
 * Write a description of class Manajer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manajer extends Pegawai
{
    // instance variables - replace the example below with your own
    private String departemen;

    /**
     * Constructor for objects of class Manajer
     */
    public Manajer(String nama, double gaji, String departemen)
    {
        // initialise instance variables
        super(nama, gaji);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen)
    {
        this.departemen = departemen;
    }
    
    public String getDepartemen()
    {
        return this.departemen;
    }
    
    //optional
    public String toString()
    {
        return super.toString() +", "+ departemen;
    }
}
