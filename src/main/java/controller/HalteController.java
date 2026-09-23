/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Halte;
import model.HalteReguler;
import model.HalteTransit;

/**
 *
 * @author user
 */
public class HalteController {
    private ArrayList<Halte> daftarHalte;

    public HalteController() {
        daftarHalte = new ArrayList<>();

        daftarHalte.add(new HalteReguler(
                "H001",
                "Halte Taman Kota",
                "Jalan Merdeka",
                20,
                "Rute A1",
                "Terminal Kota"
        ));

        daftarHalte.add(new HalteTransit(
                "H002",
                "Halte Pusat Kota",
                "Jalan Sudirman",
                40,
                "Rute A2",
                "Rute B2"
        ));
    }

    public void tambahHalte(Halte halte) {
        daftarHalte.add(halte);
        System.out.println("Data halte berhasil ditambahkan.");
    }

    public void tampilkanSemuaHalte() {
        if (daftarHalte.size() == 0) {
            System.out.println("Belum ada data halte.");
            return;
        }

        System.out.println("\n=== DAFTAR HALTE ===");

        for (Halte halte : daftarHalte) {
            halte.tampilkanInfo();
            System.out.println("---------------------------");
        }
    }

    public Halte cariHalte(String idHalte) {
        for (Halte halte : daftarHalte) {
            if (halte.getIdHalte().equalsIgnoreCase(idHalte)) {
                return halte;
            }
        }

        return null;
    }

    public void ubahHalte(Halte halte, String namaBaru,
                          String lokasiBaru, int kapasitasBaru,
                          String ruteBaru) {
        halte.setNamaHalte(namaBaru);
        halte.setLokasi(lokasiBaru);
        halte.setKapasitas(kapasitasBaru);
        halte.setRuteBus(ruteBaru);

        System.out.println("Data halte berhasil diubah.");
    }

    public void hapusHalte(Halte halte) {
        daftarHalte.remove(halte);
        System.out.println("Data halte berhasil dihapus.");
    }

    public boolean dataKosong() {
        return daftarHalte.size() == 0;
    }
}