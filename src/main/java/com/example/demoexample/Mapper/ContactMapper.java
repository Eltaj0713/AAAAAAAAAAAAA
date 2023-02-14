//package com.example.demoexample.Mapper;
//import com.example.demoexample.Dao.entity.ContactEntity;
//import com.example.demoexample.Model.ContactDto;
//import org.mapstruct.Mapper;
//import org.springframework.stereotype.Component;
//@Component
//@Mapper
//public class ContactMapper{
//    public ContactEntity contactMoveFromDtoToEntity(ContactDto contactDto){
//        var theEndResult = new ContactEntity(
//                contactDto.getFullName(),
//                contactDto.getEmail(),
//                contactDto.getMessage(),
//                contactDto.getPhoneNumber()
//        );
//        return theEndResult;
//    }
//}