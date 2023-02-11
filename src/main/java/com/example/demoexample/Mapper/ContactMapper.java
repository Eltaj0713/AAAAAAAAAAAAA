package com.example.demoexample.Mapper;
import com.example.demoexample.Dao.entity.AboutEntity;
import com.example.demoexample.Dao.entity.ContactEntity;
import com.example.demoexample.Model.AboutDto;
import com.example.demoexample.Model.ContactDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Mapper
public class ContactMapper{
    public ContactEntity contactMoveFromDtoToEntity(ContactDto contactDto){
        var theEndResult = new ContactEntity(
                contactDto.getFullName(),
                contactDto.getEmail(),
                contactDto.getMessage(),
                contactDto.getPhoneNumber()
        );
        return theEndResult;
    }
}

//        return new ContactEntity(
//                contactDto.getFullName(),
//                contactDto.getEmail(),
//                contactDto.getMessage(),
//                contactDto.getPhoneNumber()
//        );

//@Mapper
//public interface ContactMapper{
//    ContactMapper INSTANCE= Mappers.getMapper(ContactMapper.class);
//    ContactDto contactEntityDto(ContactEntity contactEntity);
//}