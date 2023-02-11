package com.example.demoexample.Services;
import com.example.demoexample.Model.AboutDto;
import com.example.demoexample.Model.GlassesDto;
import java.util.List;
public interface MethodService{
    List<GlassesDto> showFindAll();
    List<AboutDto> showAboutFindAll();
}