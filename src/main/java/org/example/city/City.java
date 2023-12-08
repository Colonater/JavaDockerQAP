package org.example.city;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class City {
    @Id
    @SequenceGenerator(name = "city_seq", sequenceName = "city_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "city_seq")
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }
   public void setId(Long id) {
        this.id = id;
   }

   public String getName() {
        return name;
   }

   public void setName(String name) {
        this.name = name;
   }

}
