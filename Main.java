class Produk{
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
}


class Rekomendasi extends Produk {
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
}    


class Kategori extends Produk {
    private String namaKategori;
    private String kodeKategori;

    public Kategori(int IdProduk, String NamaProduk, String Deskripsi, double Harga, int JumlahStok, 
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
}

public class Main {
    public static void main(String[] args) {
       
        Kategori kat1 = new Kategori(2, "Cangkul Baja", "Alat gali tanah", 
                                     75000, 50, "Alat Pertanian", "ALT-01");
        
        kat1.tampilkanKategori();

        Rekomendasi rek1 = new Rekomendasi(1, "Pupuk NPK", "Untuk Tanaman", 
                                           15000, 100, 1, "Rekomendasi Subur", 10, "80%", "AI");
        rek1.tampilkanRekomendasi();
    }
}