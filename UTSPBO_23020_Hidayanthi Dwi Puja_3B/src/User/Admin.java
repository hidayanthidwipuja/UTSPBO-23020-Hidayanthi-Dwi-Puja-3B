/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// didalam package user terdapat kelas admin yang dimana kelas admin mendapatkan import dari package hotel
package User;
import Hotel.Room;  
import java.util.Scanner;
/**
 *
 * @author UseR
 */
// menampilkan deklarasi dari admin yang dimana admin memasukan password
public class Admin implements UserAction{ // kelas admin melakukan implement dari UserAction aatu bisa disebut dengan kelas interface
   private final String password = "Admin123"; // Password tetap untuk admin
    
    // Deklarasi menu login untuk admin
    public void login() {
        System.out.print("Masukkan password Admin: ");
        Scanner sc = new Scanner(System.in);
        String inputPassword = sc.nextLine();
        if (inputPassword.equals(password)) {
            System.out.println("Login berhasil! Selamat datang, Admin.");
        } else {
            System.out.println("Password salah.");
            System.exit(0); // Keluar dari aplikasi jika password salah
        }
    }

    // Implementasi logout untuk admin
    public void logout() {
        System.out.println("Logout berhasil. Terima kasih.");
    }

    // Admin dapat mengubah harga kamar
    public void updateRoomPrice(Room room, double newHarga) {
        room.setHarga(newHarga);
        System.out.println("Harga kamar " + room.dapatkanTipe() + " berhasil diubah menjadi Rp " + newHarga);
    }

    // Menampilkan daftar kamar yang sudah dipesan
    public void viewBookedRooms(Room rooms) { 
        System.out.println("Daftar kamar yang sudah dipesan:");
        boolean telahMemesanKamar = false;
            if (rooms.sudahPesan()) {
                System.out.println("Kamar: " + rooms.dapatkanTipe() + " - Dipesan untuk " + rooms.DapatkanHariyangdiPesan() + " hari.");
                telahMemesanKamar = true;
            }
        if (!telahMemesanKamar) {
            System.out.println("Belum ada kamar yang dipesan.");
        }
    }
}