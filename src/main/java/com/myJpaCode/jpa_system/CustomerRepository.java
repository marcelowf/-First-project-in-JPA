package com.myJpaCode.jpa_system;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

  Customer findById(long id);
}

/*boilerplate:  "boilerplate" refers to sections of code that are repeated in multiple places
with little to no variation. These sections of code are often necessary for setup, configuration, or repetitive 
tasks, but they don't directly contribute to the core logic of the program. */