/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;
import controller.HalteController;
import model.Halte;
import model.HalteReguler;
import model.HalteTransit;
import util.InputValidator;

/**
 *
 * @author user
 */
public class Main {
 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HalteController halteController = new HalteController();
        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEM MANAJEMEN HALTE BUS");
            System.out.println("=================================");
            System.out.println("1. Tambah Halte");
            System.out.println("2. Lihat Data Halte");
            System.out.println("3. Ubah Data Halte");
            System.out.println("4. Hapus Halte");
            System.out.println("5. Keluar");
            System.out.println("=================================");

            pilihan = InputValidator.inputMenu(input);

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== TAMBAH HALTE ===");
                    System.out.println("1. Halte Reguler");
                    System.out.println("2. Halte Transit");

                    int jenis = InputValidator.inputPilihan(
                            input,
                            "Pilih jenis halte: ",
                            1,
                            2
                    );

                    String idHalte = InputValidator.inputTidakKosong(
                            input, "ID Halte: "
                    );

                    if (halteController.cariHalte(idHalte) != null) {
                        System.out.println("ID halte sudah digunakan.");
                        break;
                    }

                    String namaHalte = InputValidator.inputTidakKosong(
                            input, "Nama Halte: "
                    );

                    String lokasi = InputValidator.inputTidakKosong(
                            input, "Lokasi Halte: "
                    );

                    int kapasitas = InputValidator.inputAngkaPositif(
                            input, "Kapasitas Halte: "
                    );

                    String ruteBus = InputValidator.inputTidakKosong(
                            input, "Rute Bus: "
                    );

                    if (jenis == 1) {

                        String titikTujuan = InputValidator.inputTidakKosong(
                                input, "Titik Tujuan: "
                        );

                        HalteReguler halteBaru = new HalteReguler(
                                idHalte,
                                namaHalte,
                                lokasi,
                                kapasitas,
                                ruteBus,
                                titikTujuan
                        );

                        halteController.tambahHalte(halteBaru);

                    } else {

                        String rutePenghubung = InputValidator.inputTidakKosong(
                                input, "Rute Penghubung: "
                        );

                        HalteTransit halteBaru = new HalteTransit(
                                idHalte,
                                namaHalte,
                                lokasi,
                                kapasitas,
                                ruteBus,
                                rutePenghubung
                        );

                        halteController.tambahHalte(halteBaru);
                    }

                    break;

                case 2:
                    halteController.tampilkanSemuaHalte();
                    break;

                case 3:
                    System.out.println("\n=== UBAH DATA HALTE ===");

                    if (halteController.dataKosong()) {
                        System.out.println(
                                "Belum ada data halte yang dapat diubah."
                        );
                        break;
                    }

                    String idUpdate = InputValidator.inputTidakKosong(
                            input, "Masukkan ID Halte: "
                    );

                    Halte halteDitemukan =
                            halteController.cariHalte(idUpdate);

                    if (halteDitemukan == null) {
                        System.out.println("Halte tidak ditemukan.");
                        break;
                    }

                    System.out.println("\nData halte ditemukan:");
                    halteDitemukan.tampilkanInfo();

                    System.out.println("\nMasukkan data baru.");

                    String namaBaru = InputValidator.inputTidakKosong(
                            input, "Nama Halte Baru: "
                    );

                    String lokasiBaru = InputValidator.inputTidakKosong(
                            input, "Lokasi Baru: "
                    );

                    int kapasitasBaru = InputValidator.inputAngkaPositif(
                            input, "Kapasitas Baru: "
                    );

                    String ruteBaru = InputValidator.inputTidakKosong(
                            input, "Rute Bus Baru: "
                    );

                    halteController.ubahHalte(
                            halteDitemukan,
                            namaBaru,
                            lokasiBaru,
                            kapasitasBaru,
                            ruteBaru
                    );

                    break;

                case 4:
                    System.out.println("\n=== HAPUS HALTE ===");

                    if (halteController.dataKosong()) {
                        System.out.println(
                                "Belum ada data halte yang dapat dihapus."
                        );
                        break;
                    }

                    String idHapus = InputValidator.inputTidakKosong(
                            input, "Masukkan ID Halte: "
                    );

                    Halte halteHapus =
                            halteController.cariHalte(idHapus);

                    if (halteHapus == null) {
                        System.out.println("Halte tidak ditemukan.");
                        break;
                    }

                    halteController.hapusHalte(halteHapus);
                    break;

                case 5:
                    System.out.println(
                            "\nTerima kasih telah menggunakan "
                            + "Sistem Manajemen Halte Bus."
                    );
                    break;
            }

        } while (pilihan != 5);

        input.close();
    }
}