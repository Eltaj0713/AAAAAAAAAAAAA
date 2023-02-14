package com.example.demoexample.Controller;
import com.example.demoexample.Dao.entity.ContactEntity;
//import com.example.demoexample.Mapper.ContactMapper;
//import com.example.demoexample.Model.ContactDto;
import com.example.demoexample.Services.ContactService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/contactController")
public class ContactController{
    private final ContactService contactService;
//    private final ContactMapper contactMapper;

    public ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    @PostMapping("contact")
    public void saveMyContact(
            @RequestBody ContactEntity contactEntity){
        System.out.println();
        var test=contactService.saveContact(contactEntity);
        System.out.println("Sonuch : " + test);
    }
}