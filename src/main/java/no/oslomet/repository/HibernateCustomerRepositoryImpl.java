package no.oslomet.repository;

import no.oslomet.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    private String dbUsername;


    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    @Override
    public List<Customer> findAll(){
        System.out.println(dbUsername);
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Sondre");
        customer.setLastname("Hal");

        customers.add(customer);

        return customers;
    }
}
