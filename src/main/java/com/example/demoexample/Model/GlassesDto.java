package com.example.demoexample.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlassesDto {
    private Integer id;
    private String name;
    private Double price;
    private String image;
    private String currency;
}