package org.example.aircraft;

import jakarta.persistence.*;

import javax.persistence.*;
import java.util.List;

@Entity

public class Aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraft_sequence")
    private Long id;
    private String callsign;
    private String model;
    private String serialNumber;
    private String make;

    //@manytomany mutiple joins @onetomany one join table
    @ManyToMany
    private List<Airport> airports;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCallsign() {
        return callsign;
    }
    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

}
