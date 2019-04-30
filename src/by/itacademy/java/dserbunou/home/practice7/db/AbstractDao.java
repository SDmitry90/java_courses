package by.itacademy.java.dserbunou.home.practice7.db;

import java.util.List;

public interface AbstractDao<T> {

    T insert(final T entity);

    void update(final T entity);

    void delete(final Integer id);

    List<T> getAll();
}
