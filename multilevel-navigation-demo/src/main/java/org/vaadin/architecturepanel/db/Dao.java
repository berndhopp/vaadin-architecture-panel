package org.vaadin.architecturepanel.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public final class Dao<T extends Entity>{

    public static final Dao<User> USER_DAO = new Dao<>(
            new User("Thomas", "Mattson", 1),
            new User("Olli", "Tietäväinen", 2),
            new User("Jan", "Rucidlo", 3),
            new User("Bernd", "Hopp", 4)
    );

    public static final Dao<Customer> CUSTOMER_DAO = new Dao<>(
            new Customer(1, "Adidas"),
            new Customer(2, "Nike"),
            new Customer(3, "Puma"),
            new Customer(4, "Reebok")
    );

    public static final Dao<Product> PRODUCT_DAO = new Dao<>(
            new Product(1, "amazing product 1"),
            new Product(2, "amazing product 2"),
            new Product(3, "amazing product 3"),
            new Product(4, "amazing product 4")
    );

    private final Collection<T> backend = new ArrayList<>();

    private Dao(T... entities){
        for (T entity : entities) {
            backend.add(entity);
        }
    }

    public Optional<T> get(int id) {
        return backend
                .stream()
                .filter(entity -> entity.getId() == id)
                .findFirst();
    }

    public Collection<T> getAll() {
        return Collections.unmodifiableCollection(backend);
    }
}
