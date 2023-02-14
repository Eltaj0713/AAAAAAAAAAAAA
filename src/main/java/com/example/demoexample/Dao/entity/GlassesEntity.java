package com.example.demoexample.Dao.entity;
import jakarta.persistence.*;
import lombok.*;
//@SuppressWarnings("ALL")
@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlassesEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "image")
    private String image;
    @Column(name = "currency")
    private String currency;
}