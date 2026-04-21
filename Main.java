interface Exportable {
    void exportData();
}
class Produk implements Exportable{
    int IdProduk;
    String NamaProduk;
    String Deskripsi;
    double Harga;
    int JumlahStok;

    public Produk (int IdProduk, String NamaProduk, String Deskripsi, double Harga, int JumlahStok ){
    this.IdProduk = IdProduk;
    this.NamaProduk = NamaProduk;
    this.Deskripsi = Deskripsi;
    this.Harga = Harga;
    this.JumlahStok = JumlahStok;
    }

    public void tampilkanProduk(){
        System.out.println("== Detail Produk==");
        System.out.println("Nama:  " + this.NamaProduk);
        System.out.println("Deskripsi:  " + this.Deskripsi);
        System.out.println("Harga:  " + this.Harga);
        System.out.println("Stok:  " + this.JumlahStok);
    }
    @Override
    public void exportData() {
        System.out.println("Exporting produk: " + NamaProduk + " - " + Harga);
    }
}

class kategori extends produk {
    private String namaKategori;
    private String kodeKategori;

    public kategori(int IdProduk, String NamaProduk, String Deskripsi, double Harga, int JumlahStok, 
                    String namaKategori, String kodeKategori) {
        super(IdProduk, NamaProduk, Deskripsi, Harga, JumlahStok);
        this.namaKategori = namaKategori;
        this.kodeKategori = kodeKategori;
    }

    public void tampilkanKategori() {
        super.tampilkanProduk();
        System.out.println("Kategori: " + this.namaKategori);
        System.out.println("Kode Kategori: " + this.kodeKategori);

    }

    @Override
    public void exportData() {
        System.out.println("Exporting kategori: " + namaKategori + " - " + kodeKategori);
    }
}

class Rekomendasi extends produk {
    private int IdRekomendasi;
    private String NamaRekomendasi;
    private int IdPengguna;
    private String SkorKepercayaan;
    private String Sumber;

    public Rekomendasi(int IdProduk, String NamaProduk, String Deskripsi, double Harga, int JumlahStok, 
                       int IdRekomendasi, String NamaRekomendasi, int IdPengguna, String SkorKepercayaan, String Sumber){

        super(IdProduk, NamaProduk, Deskripsi, Harga, JumlahStok);                
        this.IdRekomendasi = IdRekomendasi;
        this.NamaRekomendasi = NamaRekomendasi;
        this.IdPengguna = IdPengguna;
        this.SkorKepercayaan = SkorKepercayaan;
        this.Sumber = Sumber;
    }
    public void tampilkanRekomendasi(){
        super.tampilkanProduk();
        System.out.println("IdRekomendasi:  " + this.IdRekomendasi);
        System.out.println("Nama Rekomendasi:  " + this.NamaRekomendasi);
        System.out.println("ID Pengguna:  " + this.IdPengguna);
        System.out.println("Skor Kepercayaan:  " + this.SkorKepercayaan);
        System.out.println("Sumber:  " + this.Sumber);
    }
    @Override
    public void exportData() {
        System.out.println("Exporting rekomendasi: " + NamaRekomendasi + " - " + SkorKepercayaan);
    }
}
class InfoPrinter {
    public void printInfo(Exportable item) {
        item.exportData();
    }
}
public class Main {
    public static void main(String[] args) {
       
        Kategori kat1 = new Kategori(2, "Cangkul Baja", "Alat gali tanah", 
                                     75000, 50, "Alat Pertanian", "ALT-01");
        
        kat1.tampilkanKategori();

        Rekomendasi rek1 = new Rekomendasi(1, "Pupuk NPK", "Untuk Tanaman", 
                                           15000, 100, 1, "Rekomendasi Subur", 10, "80%", "AI");
        rek1.tampilkanRekomendasi();

        Exportable[] items = {kat1, rek1};
        for (Exportable item : items) {
            item.exportData();
        }
    }
}