package service;

import models.Event;
import java.util.ArrayList;
import java.util.Scanner;

public class EventService {
    private ArrayList<Event> daftarEvent = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // Tambah Event
    public void tambahEvent() {
        System.out.print("Masukkan nama event: ");
        String nama = input.nextLine();
        System.out.print("Masukkan tanggal event (dd-mm-yyyy): ");
        String tanggal = input.nextLine();
        System.out.print("Masukkan venue event: ");
        String venue = input.nextLine();

        Event event = new Event(nama, tanggal, venue);
        daftarEvent.add(event);
        System.out.println("Event berhasil ditambahkan!");
    }

    // Lihat Event
    public void lihatEvent() {
        System.out.println("\n=== Daftar Event ===");
        if (daftarEvent.isEmpty()) {
            System.out.println("Belum ada event.");
        } else {
            for (int i = 0; i < daftarEvent.size(); i++) {
                System.out.println((i + 1) + ". " + daftarEvent.get(i));
            }
        }
    }

    // Ubah Event
    public void ubahEvent() {
        lihatEvent();
        if (!daftarEvent.isEmpty()) {
            System.out.print("Pilih nomor event yang ingin diubah: ");
            int index = input.nextInt();
            input.nextLine();

            if (index > 0 && index <= daftarEvent.size()) {
                System.out.print("Masukkan nama baru: ");
                String nama = input.nextLine();
                System.out.print("Masukkan tanggal baru (dd-mm-yyyy): ");
                String tanggal = input.nextLine();
                System.out.print("Masukkan venue baru: ");
                String venue = input.nextLine();

                daftarEvent.set(index - 1, new Event(nama, tanggal, venue));
                System.out.println("Event berhasil diubah!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    // Hapus Event
    public void hapusEvent() {
        lihatEvent();
        if (!daftarEvent.isEmpty()) {
            System.out.print("Pilih nomor event yang ingin dihapus: ");
            int index = input.nextInt();
            input.nextLine();

            if (index > 0 && index <= daftarEvent.size()) {
                daftarEvent.remove(index - 1);
                System.out.println("Event berhasil dihapus!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    // Cari Event
    public void cariEvent() {
        System.out.print("Masukkan kata kunci pencarian: ");
        String keyword = input.nextLine().toLowerCase();
        boolean ditemukan = false;

        for (Event event : daftarEvent) {
            if (event.getNama().toLowerCase().contains(keyword) || 
                event.getTanggal().toLowerCase().contains(keyword) ||
                event.getVenue().toLowerCase().contains(keyword)) {
                System.out.println(event);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Event tidak ditemukan.");
        }
    }
}
