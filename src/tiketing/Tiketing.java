/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketing;

/**
 *
 * @author valennuara
 */
public class Tiketing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order order = new Order();
        Receiver receiver = new Receiver();
        double harga = 0;
        order.pesanTicket();
        System.out.println("Nama Anda " + order.nama);
        if(order.tipe == 'A') {
            System.out.println("Pilihan Anda " + "A. Penerbangan VIP 2500");
            harga = 2500;
        } else if(order.tipe == 'B') {
            System.out.println("Pilihan Anda " + "A. Penerbangan Bisnis 1000");
            harga = 1000;
        } else if(order.tipe == 'C') {
            System.out.println("Pilihan Anda " + "A. Penerbangan Ekonomi 500");
            harga = 500;
        }
        System.out.println("Jumlah Tiket " + order.jumlah);


        System.out.println("Total " + harga * order.jumlah);
        receiver.pesanTicket();
    }
    
}
