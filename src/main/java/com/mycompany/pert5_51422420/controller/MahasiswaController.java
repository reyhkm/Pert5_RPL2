package com.mycompany.pert5_51422420.controller;

import com.mycompany.pert5_51422420.model.ModelMahasiswa;
import com.mycompany.pert5_51422420.repository.MahasiswaRepository;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MahasiswaController {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    public void tampilkanMenu() {
        Scanner scanner = new Scanner(System.in);
        int opsi;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tampilkan semua mahasiswa");
            System.out.println("2. Tambah mahasiswa baru");
            System.out.println("3. Cek koneksi database");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            opsi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (opsi) {
                case 1:
                    tampilkanSemuaMahasiswa();
                    break;
                case 2:
                    tambahMahasiswa(scanner);
                    break;
                case 3:
                    cekKoneksi();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }
        } while (opsi != 4);
    }

    private void tampilkanSemuaMahasiswa() {
        List<ModelMahasiswa> mahasiswaList = mahasiswaRepository.findAll();
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            mahasiswaList.forEach(System.out::println);
        }
    }

    private void tambahMahasiswa(Scanner scanner) {
        ModelMahasiswa mahasiswa = new ModelMahasiswa();
        System.out.print("Masukkan NPM: ");
        mahasiswa.setNpm(scanner.nextLine());
        System.out.print("Masukkan Nama: ");
        mahasiswa.setNama(scanner.nextLine());
        System.out.print("Masukkan Jurusan: ");
        mahasiswa.setJurusan(scanner.nextLine());
        System.out.print("Masukkan IPK: ");
        mahasiswa.setIpk(scanner.nextDouble());
        scanner.nextLine(); // Membersihkan newline

        mahasiswaRepository.save(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    private void cekKoneksi() {
        try {
            mahasiswaRepository.count(); // Operasi sederhana untuk cek koneksi
            System.out.println("Koneksi ke database berhasil.");
        } catch (Exception e) {
            System.out.println("Gagal terhubung ke database.");
            e.printStackTrace();
        }
    }
    
} // <-- Pastikan kurung kurawal penutup ini ada