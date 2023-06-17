package UAP;

//1. Class dan Object
//9. abstract
public abstract class Manusia {
    protected String nama, jenisKelamin;

    public Manusia(){} //overloading
    Manusia (String nama, String jenisKelamin) {
    }

    //4. Enkapsulasi
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public abstract void info();
}

