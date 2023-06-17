package UAP;

public class Customer extends Manusia{
    protected String alamat, email, noHP;

    Customer (String nama, String alamat, String email, String noHP, String jenisKelamin) {
        super(nama, jenisKelamin);
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.noHP = noHP;
        this.jenisKelamin = jenisKelamin;
    }

    //3. Overiding
    @Override
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Email: " + email);
        System.out.println("No HP: " + noHP);
    }
}