package com.kyleyap.inventory_service;

import com.kyleyap.inventory_service.model.Inventory;
import com.kyleyap.inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(InventoryRepository inventoryRepository) {
//        return args -> {
//            Inventory inventory = new Inventory();
//            inventory.setSkuCode("ip_ap_13");
//            inventory.setQuantity(100);
//
//            Inventory inventory1 = new Inventory();
//            inventory1.setSkuCode("ip_ap_13_red");
//            inventory1.setQuantity(0);
//
//            inventoryRepository.save(inventory);
//            inventoryRepository.save(inventory1);
//        };
//    }
}
