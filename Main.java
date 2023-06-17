package UAP;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        //7. Polymorphisme
        Travel tiket = new Travel();

        ArrayList<Karyawan> dafKaryawans = new ArrayList<>(2);
        dafKaryawans.add(new Karyawan("4 tahun", "Ekonomi", "Usman", "Laki-laki"));
        dafKaryawans.add(new Karyawan("1 tahun", "Business", "Algi", "laki-laki"));
        dafKaryawans.add(new Karyawan("2 tahun", "Eksekutif", "Bernard", "laki-laki"));

        //2. Instance Method
        System.out.println();
        System.out.println("----Daftar Karyawan----");
        for(Karyawan karyawan : dafKaryawans) {
            karyawan.tampilkanInfoKaryawan();
        }

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Selamat Datamg di Travel Cinta PTI");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("Silahkan masukkan data pribadi anda");

        try (Scanner input = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Masukkan nama anda \t: ");
            String nama = input.nextLine();
            System.out.print("Alamat \t\t\t: ");
            String alamat = input.nextLine();
            System.out.print("Email \t\t\t: ");
            String email = input.nextLine();
            System.out.print("No HP \t\t\t: ");
            String noHP = input.nextLine();
            
            System.out.println();
            System.out.println("Jenis Kelamin : ");
            System.out.println("1. Laki-laki");
            System.out.println("2. Perempuan");
            int jenisKelamin;
            while (true) {
            System.out.print("Mohon masukkan pilihan anda : ");
            jenisKelamin = input.nextInt();
                if (jenisKelamin == 1) {
                    System.out.println("-----------");
                    System.out.println("|Laki-laki|");
                    System.out.println("-----------");
                    break;    
                }if (jenisKelamin == 2) {
                    System.out.println("-----------");
                    System.out.println("|Perempuan|");
                    System.out.println("-----------");
                    break;
                }else {
                    System.out.println("Pilihan yang anda pilih salah, Mohon ulangi kembali");
                }
            }



            System.out.println();
            System.out.println("==Silahkan pilih destinasi anda==");
            System.out.println("1. Malang - Surabaya");
            System.out.println("2. Malang - Jogja");
            System.out.println("3. Malang - jakarta");
            System.out.println("4. Malang - Semarang");
            System.out.println("5. Malang - Bandung");

     
            int tujuan;
            boolean pilihan;

            do {
                System.out.println("------------------------");
                System.out.print("Masukkan angka 1 - 5 : ");
                tujuan = input.nextInt();
                System.out.println();

                pilihan = true; // Defaultnya input valid

                switch (tujuan) {
                    case 1:
                        System.out.println("------------------------------------------");
                        System.out.println("|Anda memilih destinasi Malang - Surabaya|");
                        System.out.println("------------------------------------------");
                        break;
                    case 2:
                        System.out.println("---------------------------------------");
                        System.out.println("|Anda memilih destinasi Malang - Jogja|");
                        System.out.println("---------------------------------------");
                        break;
                    case 3:
                        System.out.println("-----------------------------------------");
                        System.out.println("|Anda memilih destinasi Malang - Jakarta|");
                        System.out.println("-----------------------------------------");
                        break;
                    case 4:
                        System.out.println("------------------------------------------");
                        System.out.println("|Anda memilih destinasi Malang - Semarang|");
                        System.out.println("------------------------------------------");
                        break;
                    case 5:
                        System.out.println("-----------------------------------------");
                        System.out.println("|Anda memilih destinasi Malang - Bandung|");
                        System.out.println("-----------------------------------------");
                        break;
                    default:
                        System.out.println("------------------------------------------");
                        System.out.println("~Destinasi tidak valid. Silakan coba lagi~");
                        System.out.println("------------------------------------------");
                        pilihan = false; 
                        break;
                }
            } while (!pilihan);

            System.out.println();
            System.out.println("========Pilihan Bus========");
            System.out.println("1. Ekonomi");
            System.out.println("2. Business");
            System.out.println("3. Eksekutif");

            int pilihBus;
            int hargaTiketBisnis = 60000;
            int hargaTiketEksekutif = 80000;
            System.out.print("Masukkan angka 1 - 3 : ");
            pilihBus = input.nextInt();

            
            System.out.println();
            System.out.println("=====Pilihan Jam Keberangkatan=====");
            System.out.println("1. Pagi (08:00)");
            System.out.println("2. Siang (12:00)");
            System.out.println("3. Malam (20:00)");

            String keberangkatan1 = "Pagi (08:00)";
            String keberangkatan2 = " Siang (12:00)";
            String keberangkatan3 = "Malam (20:00)";
            boolean validInput;

            System.out.print("Masukkan angka 1 - 3 : ");
            int berangkat = input.nextInt();
            do {

                validInput = true; // Defaultnya input valid

                switch (berangkat) {
                    case 1:
                        System.out.println("-------------------------------------------");
                        System.out.println("Anda memilih jam keberangkatan " + keberangkatan1);
                        System.out.println("-------------------------------------------");
                        // Tambahkan logika atau aksi yang sesuai untuk jam ini
                        break;
                    case 2:
                        System.out.println("-------------------------------------------");
                        System.out.println("Anda memilih jam keberangkatan  " + keberangkatan2);
                        System.out.println("-------------------------------------------");
                        // Tambahkan logika atau aksi yang sesuai untuk jam ini
                        break;
                    case 3:
                        System.out.println("-------------------------------------------");
                        System.out.println("Anda memilih jam keberangkatan " + keberangkatan3);
                        System.out.println("-------------------------------------------");
                        // Tambahkan logika atau aksi yang sesuai untuk jam ini
                        break;
                    default:
                        System.out.println("-------------------------------------------");
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        System.out.println("-------------------------------------------");
                        validInput = false; // Set input menjadi tidak valid
                        break;
                }
            } while (!validInput);

            
            System.out.println();
            System.out.println("========TIKET PESANAN ANDA========");
            System.out.println("Nama Pemesan \t  : " + nama);
                if (tujuan == 1) {
                    tiket.surabaya();
                } else if (tujuan == 2) {
                    tiket.jogja();
                } else if (tujuan == 3) {
                    tiket.semarang();
                } else if (tujuan == 4) {
                    tiket.jakarta();
                } else if (tujuan == 5) {
                    tiket.bandung();
                }

                if (berangkat == 1) {
                    System.out.println("Jam Keberangkatan : " + keberangkatan1);
                } else if (berangkat == 2) {
                    System.out.println("Jam Keberangkatan : " + keberangkatan2);
                } else if (berangkat == 3) {
                    System.out.println("Jam Keberangkatan : " + keberangkatan3);
                }
        
            System.out.println("----------------------------------");
            //Harga Tiket Ekonomi Surabaya
            if (tujuan == 1 && pilihBus == 1) {
                System.out.println("Harga Tiket Bus   : RP " + Travel.hargaTiketEkonomiSurabaya);
            } else if (tujuan == 1 && pilihBus == 2) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketBisnis * 2);
            } else if (tujuan == 1 && pilihBus == 3) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketEksekutif * 3);

            }
            //Harga Tiket Ekonomi Jogja
            if (tujuan == 2 && pilihBus == 1) {
                System.out.println("Harga Tiket Bus   : RP " + Travel.hargaTiketEkonomiJogja);
            } else if (tujuan == 2 && pilihBus == 2) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketBisnis * 4);
            } else if (tujuan == 2 && pilihBus == 3) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketEksekutif * 4);

            }
            //Harga Tiket Ekonomi Semarang
            if (tujuan == 3 && pilihBus == 1) {
                System.out.println("Harga Tiket Bus   : RP " + Travel.hargaTiketEkonomiSemarang);
            } else if (tujuan == 3 && pilihBus == 2) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketBisnis * 5);
            } else if (tujuan == 3 && pilihBus == 3) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketEksekutif * 6);

            }
            //Harga Tiket Ekonomi Jakarta
            if (tujuan == 4 && pilihBus == 1) {
                System.out.println("Harga Tiket Bus   : RP " + Travel.hargaTiketEkonomiJakarta);
            } else if (tujuan == 4 && pilihBus == 2) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketBisnis * 6);
            } else if (tujuan == 4 && pilihBus == 3) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketEksekutif * 9);

            }
            //Harga Tiket Ekonomi Bandung
            if (tujuan == 5 && pilihBus == 1) {
                System.out.println("Harga Tiket Bus   : RP " + Travel.hargaTiketEkonomiBandung);
            } else if (tujuan == 5 && pilihBus == 2) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketBisnis * 6);
            } else if (tujuan == 5 && pilihBus == 3) {
                System.out.println("Harga Tiket Bus   : RP " + hargaTiketEksekutif * 8);

            }
            System.out.println("==================================");
            System.out.println();
            System.out.println("Terima kasih telah memilih travel kami");
        }
    }
}
            // public static Void info() {
            //     System.out.println();
            // 
