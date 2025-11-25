package com.mycompany.pert5_51422420.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mahasiswa")
public class ModelMahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String npm;
    private String nama;
    
    
    private String jurusan; 
    
    
    private double ipk; 

   
    public ModelMahasiswa() {
    }

    // --- Getters and Setters ---
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

   
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

   
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
       
        return "Mahasiswa{" + "id=" + id + ", npm='" + npm + '\'' + ", nama='" + nama + '\'' + ", jurusan='" + jurusan + '\'' + ", ipk=" + ipk + '}';
    }
}