/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author UseR
 */
// selamat datang di kelas room yang dimana kelas room ini masuk kebagian kelas hotel 
// didalam kelas room ini akan mendeklarasikan tampilan dari tipe, harga, kaamar yang sudah dipesan dan juga hari yang dipesan
public class Room {
    public String tipe;
    public double harga;
    public boolean sudahPesan;
    public int haridiPesan;

    public Room(String tipe, double harga) {
        this.tipe = tipe;
        this.harga = harga;
        this.sudahPesan = false;
        this.haridiPesan = 0;
    }

    // Getter untuk 'price'
    public double dapatkanHarga() {
        return harga;
    }

    // Setter untuk 'price'
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter untuk 'type'
    public String dapatkanTipe() {
        return tipe;
    }

    // Menampilkan informasi kamar
    public void tampilanroomInfo() {
        String status = sudahPesan ? "Sudah Dipesan untuk " + haridiPesan + " hari" : "Belum Dipesan";
        System.out.println(tipe + " - Rp " + harga + " - " + status);
    }

    // Memesan kamar
    public void BookRoom(int days) {
        this.sudahPesan = true;
        this.haridiPesan = days;
    }

    // Mengecek apakah kamar sudah dipesan
    public boolean sudahPesan() {
        return sudahPesan;
    }

    // Getter untuk jumlah hari pemesanan
    public int DapatkanHariyangdiPesan() {
        return haridiPesan;
    }

    String dapatkanHariyangdiPesan() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void RuangBuku(int days) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}