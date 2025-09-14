package com.mycompany.konser;

import service.EventService;
import java.util.Scanner;

public class Konser {
    public static void main(String[] args) {
        EventService eventService = new EventService();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Manajemen Event ===");
            System.out.println("1. Tambah Event");
            System.out.println("2. Lihat Event");
            System.out.println("3. Ubah Event");
            System.out.println("4. Hapus Event");
            System.out.println("5. Cari Event");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> eventService.tambahEvent();
                case 2 -> eventService.lihatEvent();
                case 3 -> eventService.ubahEvent();
                case 4 -> eventService.hapusEvent();
                case 5 -> eventService.cariEvent();
                case 6 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak ada. Coba lagi.");
            }
        } while (pilihan != 6);
    }
}
