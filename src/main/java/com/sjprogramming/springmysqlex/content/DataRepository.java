package com.sjprogramming.springmysqlex.content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {
    // You can add custom queries if needed in the future
}
