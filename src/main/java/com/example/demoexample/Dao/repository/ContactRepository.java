package com.example.demoexample.Dao.repository;
import com.example.demoexample.Dao.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends JpaRepository<ContactEntity,Integer> {
}