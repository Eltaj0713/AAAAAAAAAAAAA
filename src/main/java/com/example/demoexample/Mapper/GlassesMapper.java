package com.example.demoexample.Mapper;
import com.example.demoexample.Dao.entity.GlassesEntity;
import com.example.demoexample.Model.GlassesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface GlassesMapper{
    GlassesMapper INSTANCE = Mappers.getMapper(GlassesMapper.class);
    GlassesDto mapToDtoGlasses(GlassesEntity glassesEntity);
}