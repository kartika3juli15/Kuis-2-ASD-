public class Pasien17 {
    String id;
    String nama;
    String tgl;

    public Pasien17() {
    }

    public Pasien17(String id, String nama, String tgl) {
        this.id = id;
        this.nama = nama;
        this.tgl = tgl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglKunjungan() {
        return tgl;
    }

    public void setTglKunjungan(String tgl) {
        this.tgl = tgl;
    }

    @Override
    public String toString() {
        return "id : " + id + ", nama : " + nama + ", tgl Berkunjung : " + tgl;
    }
}
