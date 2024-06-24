import java.util.LinkedList;

public class PasienCollection17 {
    LinkedList<Pasien17> listPasien;

    public PasienCollection17() {
        this.listPasien = new LinkedList<>();
    }

    public void tambahPasien(Pasien17 pasien) {
        listPasien.add(pasien);
    }

    public void hapusPasien(String idPasien) {
        Pasien17 pasien = cariPasien(idPasien);
        if (pasien != null) {
            listPasien.remove(pasien);
        } else {
            System.out.println("Pasien dengan ID " + idPasien + " tidak ditemukan.");
        }
    }

    public Pasien17 cariPasien(String idPasien) {
        for (Pasien17 pasien : listPasien) {
            if (pasien.getId().equals(idPasien)) {
                return pasien;
            }
        }
        return null;
    }

    public void cetakSemuaPasien() {
        for (Pasien17 pasien : listPasien) {
            System.out.println(pasien);
        }
    }
}
