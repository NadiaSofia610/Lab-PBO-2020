import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class Bus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bus {
    // instance variables - replace the example below with your own
    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangPrioritas;
    
    /**
     * Constructor untuk objek-objek di kelas Bus
     */
    public Bus() {
        penumpangBiasa = new ArrayList<Penumpang>();
        penumpangPrioritas = new ArrayList<Penumpang>();
    }
    
    /**
     * Mengembalikan data array dari penumpang biasa
     * @return penumpang biasa
     */
    public ArrayList<Penumpang> getPenumpangBiasa() {
        return penumpangBiasa;
    }
    
    /**
     * Mengembalikan data array dari penumpang prioritas
     * @return penumpang prioritas
     */
    public ArrayList<Penumpang> getPenumpangPrioritas() {
        return penumpangPrioritas;
    }
    
    /**
     * Mengembalikan jumlah nilai penumpang biasa
     * return jumlah penumpang biasa
     */
    public int getJumlahPenumpangBiasa() {
        return penumpangBiasa.size();
    }
    
    /**
     * Mengembalikan jumlah nilai penumpang biasa
     * @return jumlah penumpang prioritas
     */
    public int getJumlahPenumpangPrioritas() {
        return penumpangPrioritas.size();
    }

    /**
     * Memeriksa apakah di dalam bus masih tersedia kursi kosong 
     * bagi penumpang yang sesuai dengan kategorinya,
     * jika ada tambahkan penumpang sesuai kategorinya
     * @param penumpang
     */
    public boolean NaikPenumpang(Penumpang penumpang) {
        if(penumpangPrioritas.size() < 4 && (penumpang.getHamil() || penumpang.getUmur()>60 || penumpang.getUmur()<10)) {
            System.out.println("Penumpang Berhasil ditambahkan!");
            return penumpangPrioritas.add(penumpang);
        } 
        else if(penumpangBiasa.size() < 2) {
            System.out.println("Penumpang Berhasil ditambahkan!");
            return penumpangBiasa.add(penumpang);
        }
        else {
            System.out.println("Penumpang GAGAL ditambahkan!");
            System.out.println("Tidak ada kursi yang tersedia");
            return false;
        }
    }

    /**
     * Memeriksa apakah ada penumpang yang bisa diturunkan 
     */
    public boolean turunkanPenumpang(String nama) {
        for (int i = 0; i < penumpangBiasa.size(); i++) {  
          if(nama.equals(penumpangBiasa.get(i).getNama())){
             penumpangBiasa.remove(i);
             System.out.println("Penumpang Berhasil Turun!");
             return true;
          }
        }
        
        for (int i = 0; i < penumpangPrioritas.size(); i++) {  
          if(nama.equals(penumpangPrioritas.get(i).getNama())){
             penumpangBiasa.remove(i);
             System.out.println("Penumpang Berhasil Turun!");
             return true;
          }
        }
        
        for (int i = 0; i < (penumpangBiasa.size()+penumpangPrioritas.size()); i++) {  
           if((nama !=(penumpangPrioritas.get(i).getNama()) || (nama != penumpangBiasa.get(i).getNama()))){
               System.out.println("Tidak Ada penumpang yang dimaksudkan"); 
               return false;
           }
        }
        
        return true;
    }
    
    /**
     * Membuat tampilan yang mencetak nama penumpang biasa, prioritas, dan jumlah seluruh penumpang 
     */
    public void tampilan(){
        String penbi = "  ";
        String penpri = "  ";
        int i=0, j=0;
           
        for(Penumpang p : penumpangBiasa) {
            penbi += p.getNama().toString();
            if (i<(penumpangBiasa.size()-1) ){
                penbi += ", "; 
            }
            else {
                penbi += " "; 
            }
                
            i++;
        }
            
        for(Penumpang p : penumpangPrioritas) {
            penpri += p.getNama().toString();
            if (j<(penumpangPrioritas.size()-1) ){
                penpri += ", "; 
            }
            else {
                penpri += " "; 
            }
                
            j++;
        }
            
        if(penumpangBiasa.isEmpty() == true ){  
            System.out.println("\nPenumpang Biasa : <kosong>") ;
        }
        else {
            System.out.println("\nPenumpang biasa : " +penbi);
        }
            
        if(penumpangPrioritas.isEmpty() == true ) {  
            System.out.println("Penumpang prioritas : <kosong>") ;
        }
        else {
            System.out.println("Penumpang prioritas : " +penpri);
        }
          
        System.out.println("Jumlah Penumpang : " +(penumpangBiasa.size()+penumpangPrioritas.size()));
    }
    
    public String toString() {
        return ("");
    }
}