package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import lombok.Setter;
import lombok.Getter;

import jakarta.persistence.*;

@Setter
@Getter
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer number;
    
    @ManyToMany(mappedBy= "addresses")
    private Set<Customer> owners = new HashSet<>();
    

    // public String getStreet() {
    //     // TODO: implement method!
    //     return street;
    // }

    // public Integer getNumber() {
    //     // TODO: implement method!
    //     return number;
    // }

    // public Set<Customer> getOwners() {
    //     // TODO: implement method!
    //     return customers;
    // }
}
