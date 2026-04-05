class Produk {
    private int idProduk;
    private String namaProduk;
    private String deskripsi;
    private double harga;
    private int jumlahStok;

    public Produk(int idProduk, String namaProduk, String deskripsi, double harga, int jumlahStok) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }

    public int getIdProduk() { return idProduk; }
    public String getNamaProduk() { return namaProduk; }
    public String getDeskripsi() { return deskripsi; }
    public double getHarga() { return harga; }
    public int getJumlahStok() { return jumlahStok; }

    public void setHarga(double harga) {
        if (harga > 0) this.harga = harga;
        else throw new IllegalArgumentException("Harga harus positif");
    }

    public void setJumlahStok(int jumlahStok) {
        if (jumlahStok >= 0) this.jumlahStok = jumlahStok;
        else throw new IllegalArgumentException("Stok tidak boleh negatif");
    }

    public void tampilkanProduk() {
        System.out.println("== Detail Produk ==");
        System.out.println("Nama: " + namaProduk);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + jumlahStok);
    }
}

interface Tampilkan {
    void tampilkan();
}

class Rekomendasi extends Produk implements Tampilkan {
    private int idRekomendasi;
    private String namaRekomendasi;
    private int idPengguna;
    private String skorKepercayaan;
    private String sumber;

    public Rekomendasi(int idProduk, String namaProduk, String deskripsi, double harga, int jumlahStok,
                       int idRekomendasi, String namaRekomendasi, int idPengguna, String skorKepercayaan, String sumber) {
        super(idProduk, namaProduk, deskripsi, harga, jumlahStok);
        this.idRekomendasi = idRekomendasi;
        this.namaRekomendasi = namaRekomendasi;
        this.idPengguna = idPengguna;
        this.skorKepercayaan = skorKepercayaan;
        this.sumber = sumber;
    }

    public void tampilkan() {
        super.tampilkanProduk();
        System.out.println("Id Rekomendasi: " + idRekomendasi);
        System.out.println("Nama Rekomendasi: " + namaRekomendasi);
        System.out.println("ID Pengguna: " + idPengguna);
        System.out.println("Skor Kepercayaan: " + skorKepercayaan);
        System.out.println("Sumber: " + sumber);
    }
}

class Kategori extends Produk implements Tampilkan {
    private String namaKategori;
    private String kodeKategori;

    public Kategori(int idProduk, String namaProduk, String deskripsi, double harga, int jumlahStok,
                    String namaKategori, String kodeKategori) {
        super(idProduk, namaProduk, deskripsi, harga, jumlahStok);
        this.namaKategori = namaKategori;
        this.kodeKategori = kodeKategori;
    }

    public void tampilkan() {
        super.tampilkanProduk();
        System.out.println("Kategori: " + namaKategori);
        System.out.println("Kode Kategori: " + kodeKategori);
    }
}

public class Main {
    public static void main(String[] args) {
        Kategori kat1 = new Kategori(2, "Cangkul Baja", "Alat gali tanah",
                75000, 50, "Alat Pertanian", "ALT-01");
        kat1.tampilkan();

        Rekomendasi rek1 = new Rekomendasi(1, "Pupuk NPK", "Untuk Tanaman",
                15000, 100, 1, "Rekomendasi Subur", 10, "80%", "AI");
        rek1.tampilkan();
    }
}