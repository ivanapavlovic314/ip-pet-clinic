package com.springframework.ippetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IpPetClinicApplication {

   public static void main(String[] args) {
        SpringApplication.run(IpPetClinicApplication.class, args);
        System.out.println("Hello explorers.");
        System.out.println();
        System.out.println("This program is running version "+
                IpPetClinicApplication.class.getPackage().getImplementationVersion());
    }

}
