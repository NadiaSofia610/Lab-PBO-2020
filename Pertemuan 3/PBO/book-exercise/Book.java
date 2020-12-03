/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        this.pages = pages;
        refNumber = "";
    }

    /**
     * Tambahkan 2 method accessor yaitu getAuthor dan getTitle, 
     * yang akan mengembalikan nama pengarang dan judul.
     */
    public String getAuthor() 
    {
        return this.author;
    }
    
    public String getTitle() 
    {
        return this.title;
    }
    
    /**
     * Tambahkan 2 method, printAuthor dan printTitle, 
     * yang akan mencetak nama pengarang dan judul ke terminal window. 
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * Tambahkan field pages yg bertipe int ke kelas Book, 
     * yang menyimpan jumlah halaman dlm buku. Nilai awalnya akan diset 
     * pada method constructor, jd tambahkan parameternya pada constructor.
     */
    private int pages;
    
    /**
     * Tambahkan method getPages yg akan mengembalikan jumlah halaman
     */
    public int getPages()
    {
        return this.pages;
    }
    
    /**
     * Tambahkan method printDetails yg akan mencetak nama pengarang, 
     * judul, jumlah halaman pada terminal window.
     */
    public void printDetails()
    {
        System.out.println(author);
        System.out.println(title);
        System.out.println(pages);
        if(refNumber == "") {
            System.out.println("zzz");
        }
        else {
            System.out.println(refNumber);
        }
    }
    
    /**
     * Tambahkan field refNumber yg bertipe String ke kelas Book, yang akan menyimpan 
     * nomor referensi perpustakaan. Pada constructor, initialize dgn string kosong (“”).
     */
    private String refNumber = "";
    
    /**
     * Tambahkan method mutator 
     * public void setRefNumber(String ref)
     * yg akan memberi nilai pada refNumber.
     */
    public void setRefNumber(String ref)
    {
        this.refNumber = ref;
    }
    
    /**
     * Ubah method printDetails dengan menambahkan cetakan utk refNumber. 
     * Jika refNumber masih string kosong, maka cetak “zzz”. 
     */
}
