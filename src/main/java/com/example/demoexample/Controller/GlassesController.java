package com.example.demoexample.Controller;
import com.example.demoexample.Services.MethodService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/glassesController")
public class GlassesController{
    private final MethodService methodService;
    public GlassesController(@Qualifier("glassesService")
            MethodService methodService)
            {
        this.methodService = methodService;
    }
    @GetMapping("/glasses")
    public String showGlases(Model model){
        model.addAttribute("customers",methodService.showFindAll());
        return "glasses";
    }
}