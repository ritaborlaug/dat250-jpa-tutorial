package no.hvl.dat250.jpa.tutorial.creditcards.driver;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import no.hvl.dat250.jpa.tutorial.creditcards.*;



public class CreditCardsMain {

  static final String PERSISTENCE_UNIT_NAME = "jpa-tutorial";

  public static void main(String[] args) {
    try (EntityManagerFactory factory = Persistence.createEntityManagerFactory(
        PERSISTENCE_UNIT_NAME); EntityManager em = factory.createEntityManager()) {
      em.getTransaction().begin();
      createObjects(em);
      em.getTransaction().commit();
    }

  }

  private static void createObjects(EntityManager em) {
    // TODO: Create object world as shown in the README.md.
    Customer customer = new Customer();
    customer.setName("Max Mustermann");
    em.persist(customer);

    Address address = new Address();
    address.setStreet("Inndalsveien");
    address.setNumber(28);
    em.persist(address);

    CreditCard firstCard = new CreditCard();
    firstCard.setNumber(12345);
    firstCard.setBalance(-5000);
    firstCard.setCreditLimit(-10000);
    em.persist(firstCard);

    CreditCard secondCard = new CreditCard();
    secondCard.setNumber(123);
    secondCard.setBalance(1);
    secondCard.setCreditLimit(2000);
    em.persist(secondCard);

    Pincode pincode = new Pincode();
    pincode.setCode("123");
    pincode.setCount(1);
    em.persist(pincode);

    Bank bank = new Bank();
    bank.setName("Pengebank");
    em.persist(bank);

    
    customer.getAddresses().add(address);
    customer.getCreditCards().add(firstCard);
    customer.getCreditCards().add(secondCard);

    address.getOwners().add(customer);

    firstCard.setPincode(pincode);
    secondCard.setPincode(pincode);
    firstCard.setOwningBank(bank);
    secondCard.setOwningBank(bank);

    bank.getOwnedCards().add(firstCard);
    bank.getOwnedCards().add(secondCard);








  }
}
