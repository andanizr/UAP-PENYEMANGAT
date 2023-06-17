package UAP;

//9. Interface
public class Travel implements Tiket{

    //5. Konstanta final
    protected static final int hargaTiketEkonomiSurabaya = 50000;
    protected static final int hargaTiketEkonomiJogja = 55000;
    protected static final int hargaTiketEkonomiSemarang = 60000;
    protected static final int hargaTiketEkonomiJakarta = 76000;
    protected static final int hargaTiketEkonomiBandung = 66000;
    protected String[] kota = {"Surabaya", "Jogja", "Semarang", "Jakarta", "Bandung"};
    
    //3. Overiding
    @Override
    public void pesanTiketSurabaya() {
        
    }

    @Override
    public void pesanTiketJogja() {

    }

    @Override
    public void pesanTiketSemarang() {

    }

    @Override
    public void pesanTiketJakarta() {

    }

    @Override
    public void pesanTiketBandung() {

    }

    public void surabaya() {
        System.out.println("Keberangkatan \t  : Malang");
        System.out.println("Tujuan \t\t  : Surabaya");
    }

    public void jogja() {
        System.out.println("Keberangkatan \t  : Malang");
        System.out.println("Tujuan \t\t  : Jogja");
    }

    public void semarang() {
        System.out.println("Keberangkatan \t  : Malang");
        System.out.println("Tujuan \t\t  : Surabaya");
    }

    public void jakarta() {
        System.out.println("Keberangkatan \t  : Malang");
        System.out.println("Tujuan \t\t  : Surabaya");
    }

    public void bandung() {
        System.out.println("Keberangkatan \t  : Malang");
        System.out.println("Tujuan \t\t  : Surabaya");
    }
   
}
