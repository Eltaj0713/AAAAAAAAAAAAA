package com.example.demoexample.Model;
import lombok.*;
import org.mapstruct.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
//@Builder
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Component
public class ContactDto {
    private Integer id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String message;
}