package no.hvl.dat250.jpa.tutorial.creditcards;

import lombok.Setter;
import lombok.Getter;

import jakarta.persistence.*;

@Setter
@Getter
@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private Integer count;

    // public Long getId() {
    //     return id;
    // }

    // public String getCode() {
    //     // TODO: implement method!
    //     return pincode;
    // }

    // public Integer getCount() {
    //     // TODO: implement method!
    //     return count;
    // }
}
