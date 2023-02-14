package com.example.demoexample.Dao.repository;
import com.example.demoexample.Dao.entity.AboutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<AboutEntity,Integer> {

//    @Override
//    List<AboutEntity> findAll();

}