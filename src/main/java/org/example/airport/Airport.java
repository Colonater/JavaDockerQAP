package org.example.airport;


import org.example.city.City;

import javax.persistence.*;

@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence",sequenceName = "airport_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "airport_sequence")
    private String name;
    private Long id;
    private String citycode;

    @OneToOne
    private City city;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCitycode() {
        return this.citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public City getCity() {
        return this.city;
    }
    public void setCity(City city) {
        this.city = city;
    }
}



