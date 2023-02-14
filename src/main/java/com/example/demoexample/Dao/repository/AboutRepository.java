package com.example.demoexample.Dao.repository;
import com.example.demoexample.Dao.entity.AboutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AboutRepository extends JpaRepository<AboutEntity,Integer> {
}