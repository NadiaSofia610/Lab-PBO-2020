
/**
 * Write a description of class Pegawai here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pegawai
{
    // instance variables - replace the example below with your own
    private String nama; 
    private double gaji; 

    /**
     * Constructor for objects of class Pegawai
     */
    public Pegawai(String nama, double gaji) 
    { 
        this.nama = nama;  
        this.gaji = gaji;  
    } 
    
    public void setNama(String nama) 
    { 
           this.nama = nama;  
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
    public void setGaji(double gaji)
    {
        this.gaji = gaji;
    }
    
    public double getGaji()
    {
        return this.gaji;
    }
    
    //optional
    public String toString()
    {
        return nama + ", "+ gaji;
    }
}
