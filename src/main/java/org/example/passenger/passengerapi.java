package org.example.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "passenger", collectionResourceRel = "passenger")
interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
