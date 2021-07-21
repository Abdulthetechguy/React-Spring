package com.contoso.payroll;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReactAndSpringDataRestApplicationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ManagerRepository managerRepository;

    @Test
    public void whenFindByName_thenReturnManager() {
        Manager alex = new Manager("alex", "testalexp",
                "ROLE_MANAGER");
        entityManager.persistAndFlush(alex);

        Manager found = managerRepository.findByName(alex.getName());
        assertThat(found.getName()).isEqualTo(alex.getName());
    }

    @Test
    public void whenInvalidName_thenReturnNull() {
        Manager fromDb = managerRepository.findByName("doesNotExist");
        assertThat(fromDb).isNull();
    }


    @Test
    public void givenSetOfManagers_whenFindAll_thenReturnAllManagers() {
        Manager alex = new Manager("alex", "testalexp",
                "ROLE_MANAGER");
        Manager ron = new Manager("ron", "testronp",
                "ROLE_MANAGER");
        Manager bob = new Manager("bob", "testbobp",
                "ROLE_MANAGER");

        entityManager.persist(alex);
        entityManager.persist(bob);
        entityManager.persist(ron);
        entityManager.flush();

        List<Manager> allEmployees = managerRepository.findAll();

        assertThat(allEmployees).hasSize(3).extracting(Manager::getName).containsOnly(alex.getName(), ron.getName(), bob.getName());
    }

}
