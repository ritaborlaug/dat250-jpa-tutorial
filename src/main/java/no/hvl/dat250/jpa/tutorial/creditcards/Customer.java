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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Address> addresses = new HashSet<>();

    @ManyToMany
    private Set<CreditCard> creditCards = new HashSet<>();




//     public String getName() {
//         // TODO: implement method! 
//         return name; 
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     @ManyToMany
//     public Set<Address> getAddresses() {
//         // TODO: implement method!
//         return addresses;
//     }

//     @ManyToMany
//     public Set<CreditCard> getCreditCards() {
//         // TODO: implement method!
//         return creditCards;
//     }
}
