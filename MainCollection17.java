import java.util.Scanner;

public class MainCollection17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        PasienCollection17 pasien = new PasienCollection17();
        int pilihan;

        do {
            System.out.println("===========Menu===========");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien");
            System.out.println("3. Cari Pasien");
            System.out.println("4. Cetak Semua Pasien");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            pilihan = sc17.nextInt();
            sc17.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Pasien : ");
                    String idPasien = sc17.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc17.nextLine();
                    System.out.print("Masukkan Tanggal Kunjungan (YYYY-MM-DD) : ");
                    String tgl = sc17.nextLine();
                    Pasien17 pasienBaru = new Pasien17(idPasien, nama, tgl);
                    pasien.tambahPasien(pasienBaru);
                    break;

                case 2:
                    System.out.print("Masukkan ID Pasien yang ingin dihapus : ");
                    String idHapus = sc17.nextLine();
                    pasien.hapusPasien(idHapus);
                    break;

                case 3:
                    System.out.print("Masukkan ID Pasien yang ingin dicari : ");
                    String idCari = sc17.nextLine();
                    Pasien17 pasienCari = pasien.cariPasien(idCari);
                    if (pasienCari != null) {
                        System.out.println(pasienCari);
                    } else {
                        System.out.println("Pasien dengan ID " + idCari + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    pasien.cetakSemuaPasien();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
