package com.example.demoexample.Controller;
import com.example.demoexample.Dao.entity.ContactEntity;
import com.example.demoexample.Model.ContactDto;
import com.example.demoexample.Services.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@RequestMapping("/contactController")
//public class ContactController{
//    @GetMapping("contact")
//    public String showContact(){
//        return "contact";
//    }
//}
@RestController
@RequestMapping("/contactController")
public class ContactController{
    private final ContactService contactService;
    public ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    @PostMapping("contact")
    public void saveMyContact(
            @RequestBody ContactDto contactDto){
        System.out.println();
        var test=contactService.saveContact(contactDto);
        System.out.println("Sonuch : " + test);
    }
}