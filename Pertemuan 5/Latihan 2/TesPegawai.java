
/**
 * Write a description of class TesPegawai here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesPegawai
{
    public static void main(String[] args)
    {
        Pegawai p = new Pegawai("Nirina", 20000000);
        Manajer m = new Manajer("Ridwan", 35000000, "IT");
        
        System.out.println(p);
        System.out.println(m);
        //System.out.println(p.getNama() + ", " + p.getGaji());
        //System.out.println(m.getNama() + ", " + m.getGaji() + ", " + m.getDepartemen());
    }
}
