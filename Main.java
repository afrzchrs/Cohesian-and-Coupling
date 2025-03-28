// Kelas Pelanggan memiliki atribut nama dan ID pelanggan.
class Pelanggan {
    private String nama;
    private int id;

    public Pelanggan(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() { return nama; }
    public int getId() { return id; }
}

// Kelas Hotel memiliki informasi nama dan lokasi.
class Hotel {
    private String nama;
    private String lokasi;

    public Hotel(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
    }

    public String getNama() { return nama; }
    public String getLokasi() { return lokasi; }
}

// Kelas Reservasi memiliki hubungan dengan Pelanggan dan Hotel (Coupling).
class Reservasi {
    private Pelanggan pelanggan;  // Hubungan dengan kelas Pelanggan
    private Hotel hotel;          // Hubungan dengan kelas Hotel
    private int durasiMalam;

    public Reservasi(Pelanggan pelanggan, Hotel hotel, int durasiMalam) {
        this.pelanggan = pelanggan;
        this.hotel = hotel;
        this.durasiMalam = durasiMalam;
    }

    public void tampilkanReservasi() {
        System.out.println("Pelanggan: " + pelanggan.getNama() + 
                           " menginap di " + hotel.getNama() +
                           " selama " + durasiMalam + " malam.");
    }

    public int hitungBiaya(int hargaPerMalam) {
        return durasiMalam * hargaPerMalam;
    }
}
public class Main {
    public static void main(String[] args) {
        Pelanggan p1 = new Pelanggan("Ali", 101);
        Hotel h1 = new Hotel("Grand Hotel", "Jakarta");
        
        Reservasi r1 = new Reservasi(p1, h1, 3);
        r1.tampilkanReservasi();
        System.out.println("Total Biaya: " + r1.hitungBiaya(500000));
    }
}
