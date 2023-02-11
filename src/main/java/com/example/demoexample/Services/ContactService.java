package com.example.demoexample.Services;
import com.example.demoexample.Dao.entity.ContactEntity;
import com.example.demoexample.Dao.repository.ContactRepository;
import com.example.demoexample.Mapper.ContactMapper;
import com.example.demoexample.Model.AboutDto;
import com.example.demoexample.Model.ContactDto;
import com.example.demoexample.Model.GlassesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService{
    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;
    public ContactService(ContactRepository contactRepository, ContactMapper contactMapper){
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }
//    public ContactEntity saveContact(ContactDto contactDto){
//        contactRepository.save(contactMapper.contactMoveFromDtoToEntity(contactDto));
////        return true;
//        return null;
//    }
    public ContactEntity saveContact(ContactDto contactDto1){

        ContactEntity test = contactRepository.save(contactMapper.contactMoveFromDtoToEntity(contactDto1));

        return test;

    }

//    public List<ContactEntity> saveContact() {
//        return null;
//    }

}