package com.example.demoexample.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AboutDto{
    private Integer id;
    private String title;
    private String text;
}