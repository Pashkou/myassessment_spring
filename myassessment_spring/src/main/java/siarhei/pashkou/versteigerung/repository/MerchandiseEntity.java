package siarhei.pashkou.versteigerung.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MerchandiseEntity {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private double price;
 
    private String brand;
 
    public MerchandiseEntity() {
    }
 
    public MerchandiseEntity(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
