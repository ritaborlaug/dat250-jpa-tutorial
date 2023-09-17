package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "owningBank")
    private Set<CreditCard> ownedCards = new HashSet<>();

    // public Long getId() {
    //     return id;
    // }

    // public String getName() {
    //     // TODO: implement method!
    //     return name;
    // }

    // public Set<CreditCard> getOwnedCards() {
    //     // TODO: implement method!
    //     return creditCards;
    // }
}
