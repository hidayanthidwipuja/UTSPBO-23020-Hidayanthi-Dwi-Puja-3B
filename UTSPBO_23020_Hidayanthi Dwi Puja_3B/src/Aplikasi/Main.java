/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// dalam package aplikasi terdapat banyak import seperti di bawah ini
package Aplikasi;
import Hotel.Hotel;
import Hotel.Room;
import User.Admin;
import User.Customer;
import java.util.Scanner;
/**
 *
 * @author UseR
 */
// pada kelas MainApp merupakan kelas main utama dari program hotel zodiak ini
public class Main {

    /**
     * @param args the command line arguments
     */
    // terdapat 3 kamar yaitu kamar leo, sagitarius, dan juga kamar libra yang setiap kamarnya sudah tersedia harganya
    public static void main(String[] args) {
        int choice;
        Room roomsCempaka1 = new Room("Leo Room", 4000000);
        
        Hotel cempakaPutih = new Hotel("Cempaka Putih Hotel", roomsCempaka1);
        Scanner sc = new Scanner(System.in);
        
        do {
            
            System.out.println("\n============Selamat Datang di Aplikasi Hotel Puja==============");
            System.out.println("1. ======Login Sebagai Customer=====");
            System.out.println("2. ======Login Sebagai Admin========");
            System.out.println("3. ======Keluar Aplikasi============");
            System.out.print("Pilih opsi: ");
            choice = sc.nextInt();
            sc.nextLine(); // Mengonsumsi newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String name = sc.nextLine();
                    System.out.print("Masukkan nomor identitas: ");
                    String idNumber = sc.nextLine();
                    Customer customer = new Customer(name, idNumber);
                    customer.login();

                    cempakaPutih.tampilanInfoHotel();

                    System.out.print("Berapa lama menginap (hari): ");
                    int days = sc.nextInt();
                    customer.BookRoom(roomsCempaka1, days);
                    break;

                case 2:
                    Admin admin = new Admin();
                    admin.login();
                    cempakaPutih.tampilanInfoHotel();
                    cempakaPutih.displayBookedRooms();  // Menampilkan kamar yang sudah dipesan dengan jangka waktu
                    break;

                case 3:
                    System.out.println("Terima Kasih & Jangan Lupa Kembali");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }while (choice != 3);
    }
}
