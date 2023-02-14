package com.example.demoexample.Dao.entity;

import jakarta.persistence.*;
import lombok.Data;

//@SuppressWarnings("All")
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
@Entity
@Data
@Table(name = "contact")
//@AllArgsConstructor
//@NoArgsConstructor
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Integer id;
    @Column(name = "full_name")
//    @Transient
    private String fullName;
    @Column(name = "email")
//    @Transient
    private String email;
    @Column(name = "message")
//    @Transient
    private String message;
//    @Transient
    @Column(name = "phone_number")
    private String phoneNumber;

    public ContactEntity(String fullName, String email, String message, String phoneNumber) {

    }

    public ContactEntity(Integer id, String fullName, String email, String message, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    public ContactEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    //    public ContactEntity(String fullName, String email, String message, String phoneNumber) {
//
//    }
//
////    public ContactEntity(String fullName, String email, String message, String phoneNumber) {
//
////    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//        ContactEntity that = (ContactEntity) o;
//        return id != null && Objects.equals(id, that.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return getClass().hashCode();
//    }
}