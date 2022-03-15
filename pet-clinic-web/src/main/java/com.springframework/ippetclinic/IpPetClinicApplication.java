package com.springframework.ippetclinic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IpPetClinicApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(IpPetClinicApplication.class, args);
        }catch (Exception e) {
            System.out.println("Opet exception" + e.getMessage());
        }
    }
}