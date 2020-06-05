package com.example.pamietnik.repository;

import com.example.pamietnik.model.Wpis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WpisRepository extends JpaRepository<Wpis, Long> {
    @Query(value = "SELECT * FROM wpisy WHERE wpisy.wpis_publiczny = true", nativeQuery = true)
    List<Wpis> getPublicEntries();
}
