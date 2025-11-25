package com.mycompany.pert5_51422420;

import com.mycompany.pert5_51422420.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pert5_51422420 implements CommandLineRunner {

    @Autowired
    private MahasiswaController mhsController;

    public static void main(String[] args) {
        SpringApplication.run(Pert5_51422420.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
     
        mhsController.tampilkanMenu();
    }
}