package org.example.airport;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "airport",collectionResourceRel = "airport")
public interface airportapi extends JpaRepository<Airport, Long> {
}
