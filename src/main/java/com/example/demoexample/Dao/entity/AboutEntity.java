package com.example.demoexample.Dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "about")
public class AboutEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;


}
