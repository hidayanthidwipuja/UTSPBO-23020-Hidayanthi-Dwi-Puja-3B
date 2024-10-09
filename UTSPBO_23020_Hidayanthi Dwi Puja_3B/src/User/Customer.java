/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
// didalam package user terdapat kelas customer yang dimana terdapat import dari package hotel
import Hotel.Room;

/**
 *
 * @author UseR
 */
// pada kelas customer terdapat implements dari userAction yang dimana kelas interface
// didalam kelas customer menampilkan nama dan juga idNumber 
public class Customer implements UserAction {
    public String name;
    public String idNumber;

    public Customer(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    // Implementasi login customer
    public void login() {
        System.out.println("Login berhasil! Selamat datang, " + name);
    }

    // deklarasi dari Pemesanan kamar
    public void BookRoom(Room room, int days) {
        if (!room.sudahPesan()) {
            room.BookRoom(days);
            System.out.println("Kamar " + room.dapatkanTipe() + " berhasil dipesan untuk " + days + " hari.");
        } else {
            System.out.println("Kamar ini sudah dipesan.");
        }
    }

    @Override
    // implementasi dari menu logout dari kelas customer
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void ruangBuku(Room selectedRoom, int days) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}