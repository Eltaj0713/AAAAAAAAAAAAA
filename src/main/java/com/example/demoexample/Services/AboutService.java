package com.example.demoexample.Services;
import com.example.demoexample.Dao.entity.ContactEntity;
import com.example.demoexample.Dao.repository.AboutRepository;
import com.example.demoexample.Mapper.AboutMapper;
import com.example.demoexample.Model.AboutDto;
import com.example.demoexample.Model.GlassesDto;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AboutService implements MethodService{
    private final AboutRepository aboutRepository;
    public AboutService(AboutRepository aboutRepository){
        this.aboutRepository = aboutRepository;
    }
    @Override
    public List<GlassesDto> showFindAll(){
        return null;
    }
    @Override
    public List<AboutDto> showAboutFindAll(){
        var aboutEntityList=aboutRepository.findAll();
        return aboutEntityList.parallelStream()
                .map(AboutMapper.INSTANCE::mapToDtoAbout)
                .toList();
    }
}