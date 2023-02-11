package com.example.demoexample.Mapper;
import com.example.demoexample.Dao.entity.AboutEntity;
import com.example.demoexample.Model.AboutDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AboutMapper{
    AboutMapper INSTANCE=Mappers.getMapper(AboutMapper.class);
    AboutDto mapToDtoAbout(AboutEntity aboutEntity);
}