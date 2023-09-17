package no.hvl.dat250.jpa.tutorial.creditcards;

import lombok.Setter;
import lombok.Getter;

import jakarta.persistence.*;

@Setter
@Getter
@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private Integer creditLimit;
    private Integer balance;

    @ManyToOne
    private Pincode pincode;

    @ManyToOne
    private Bank owningBank;

    

    // public Integer getNumber() {
    //     // TODO: implement method!
    //     return number;
    // }

    // public Integer getBalance() {
    //     // TODO: implement method!
    //     return balance;
    // }

    // public Integer getCreditLimit() {
    //     // TODO: implement method!
    //     return creditLimit;
    // }

    // public Pincode getPincode() {
    //     // TODO: implement method!
    //     return pincode;
    // }

    // public Bank getOwningBank() {
    //     // TODO: implement method!
    //     return myBank;
    // }
}
