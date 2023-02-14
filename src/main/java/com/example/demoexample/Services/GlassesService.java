package com.example.demoexample.Services;
import com.example.demoexample.Dao.repository.ProductRepository;
import com.example.demoexample.Mapper.GlassesMapper;
import com.example.demoexample.Model.AboutDto;
import com.example.demoexample.Model.GlassesDto;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GlassesService implements MethodService{
    private final ProductRepository productRepository;
    public GlassesService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public List<GlassesDto> showFindAll(){
        var productEntityList=productRepository.findAll();
        var productDtoList=productEntityList.parallelStream()
                .map(GlassesMapper.INSTANCE::mapToDtoGlasses)
                .toList();
        return productDtoList;
    }
    @Override
    public List<AboutDto> showAboutFindAll(){
        return null;
    }
}