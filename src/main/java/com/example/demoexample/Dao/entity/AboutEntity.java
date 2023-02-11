package com.example.demoexample.Dao.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@SuppressWarnings("ALL")
@Entity
@Data
@Table(name = "about")
@AllArgsConstructor
@NoArgsConstructor
public class AboutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
}