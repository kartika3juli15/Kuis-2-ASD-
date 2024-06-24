import java.util.Scanner;

public class MainPasien17 {
    public static void main(String[] args) {
        Method17 list = new Method17();
        Scanner sc17 = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("===========Menu===========");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien");
            System.out.println("3. Cari Pasien");
            System.out.println("4. Tampilkan Semua Pasien");
            System.out.println("5. Urutkan Pasien");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = sc17.nextInt();
            sc17.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan ID : ");
                    String id = sc17.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc17.nextLine();
                    System.out.print("Masukkan Tanggal Kunjungan (YYYY-MM-DD): ");
                    String tglKunjungan = sc17.nextLine();
                    list.add(new Pasien17(id, nama, tglKunjungan));
                    break;

                case 2:
                    System.out.print("Masukkan ID Pasien yang akan dihapus: ");
                    id = sc17.nextLine();
                    list.remove(id);
                    break;

                case 3:
                    System.out.print("Masukkan ID Pasien yang akan dicari: ");
                    id = sc17.nextLine();
                    Pasien17 ps = list.find(id);
                    if (ps != null) {
                        System.out.println(ps);
                    } else {
                        System.out.println("Pasien tidak ditemukan");
                    }
                    break;

                case 4:
                    list.printAll();
                    break;
                    
                case 5:
                    list.sort();
                    break;

                case 0:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);

        sc17.close();
    }
}
