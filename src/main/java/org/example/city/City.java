//city class

package org.example.city;


import org.example.airport.Airport;
import org.example.passenger.Passenger;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {
    @Id
    @SequenceGenerator(name = "city_seq", sequenceName = "city_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "city_seq")
    private long id;

    private String name;

    private String province;

    @OneToMany
    private List<Passenger> habitants;

    @OneToMany
    private List<Airport> airports;

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public List<Passenger> getHabitants() {
        return habitants;
    }

    public void setHabitants(List<Passenger> habitants) {
        this.habitants = habitants;
    }

}
