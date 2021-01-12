/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketing;

import java.util.Scanner;

/**
 *
 * @author valennaura
 */
public class Order {
    String nama;
    int jumlah;
    double harga;
    char tipe;
    public void pesanTicket() {
       Scanner input = new Scanner(System.in);
       System.out.println("Pemesanan Tiket Penerbangan Pesawat Sriwijaya");
       System.out.println("Masukan nama Anda : ");
       nama = input.nextLine();
       System.out.println("Tipe Penerbangan");
       System.out.println("A. Penerbangan VIP 2500");
       System.out.println("B. Penerbangan Bisnis 1000");
       System.out.println("C. Penerbangan Ekonomi 500");
       System.out.println("Pilihan Anda : ");
       tipe = input.next().charAt(0);
       System.out.println("Jumlah Tiket Anda : ");
       jumlah = input.nextInt();
    }
}
