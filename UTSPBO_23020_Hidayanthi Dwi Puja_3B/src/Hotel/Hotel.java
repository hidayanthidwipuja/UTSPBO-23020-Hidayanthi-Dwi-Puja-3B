/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Selamat datang di sistem Hotel zodiak
package Hotel; // yang pertama kita akan membuat package hotel yang dimana didalam hotel berisi hotel dan juga room

/**
 *
 * @author UseR
 */
public class Hotel {
    private final String name;
    private final Room rooms;

    public Hotel(String name, Room rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    // Getter untuk rooms
    public Room dapatkanKamar() {
        return rooms;
    }

    // Menampilkan deklarasi dari informasi hotel
    public void tampilanInfoHotel() {
        System.out.println("Hotel: " + name);
    }

    // Menampilkan deklarasi dari kamar yang sudah dipesan
    public void displayBookedRooms() {
        System.out.println("Kamar yang sudah dipesan:");
        System.out.println(rooms.dapatkanTipe() + " - " + rooms.DapatkanHariyangdiPesan() + " hari");
         
    }
}

