package com.example.demoexample.Services;
import com.example.demoexample.Dao.entity.ContactEntity;
import com.example.demoexample.Dao.repository.ContactRepository;
//import com.example.demoexample.Mapper.ContactMapper;
//import com.example.demoexample.Model.ContactDto;
import org.hibernate.annotations.NotFound;
import org.springframework.stereotype.Service;
@Service
public class ContactService{
    private final ContactRepository contactRepository;
//    private final ContactMapper contactMapper;
    public ContactService(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
//        this.contactMapper = contactMapper;
    }
    public ContactEntity saveContact(ContactEntity contactEntity){

        ContactEntity test = contactRepository.save(contactEntity);
        return test;
    }
}