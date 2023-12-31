//airport class responible for saving airport info

package org.example.airport;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence",sequenceName = "airport_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "airport_sequence")
    private long id;

    private String code;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}



