package com.example.demoexample.Dao.repository;
import com.example.demoexample.Dao.entity.GlassesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<GlassesEntity,Integer>{
}