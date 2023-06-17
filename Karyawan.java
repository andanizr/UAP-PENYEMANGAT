package UAP;

//6. Inheritance
public class Karyawan extends Manusia{
    protected String lamaKerja, kategori;

    //2. Konstraktor
    Karyawan(String lamaKerja, String kategori, String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.kategori = kategori;
        this.lamaKerja = lamaKerja;
    }
    public String getLamaKerja() {
        return lamaKerja;
    }
    public void setLamaKerja(String lamakerja) {
        this.lamaKerja = lamakerja;
    }
    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    //7. Polymorphisme
    @Override
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Lama Kerja: " + lamaKerja);
        System.out.println("Kategori: " + kategori);
    }

    //2. Instance Method
    public void tampilkanInfoKaryawan() {
        System.out.println("======Info Karyawan=====");
        info();
        System.out.println("========================");
    }
}
