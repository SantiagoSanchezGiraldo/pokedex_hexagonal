package com.example.pokedex_hexagonal.infrastructure.out.jpa.mapper;

import com.example.pokedex_hexagonal.domain.model.Type;
import com.example.pokedex_hexagonal.infrastructure.out.jpa.entity.TypeEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-10T19:02:35-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class TypeEntityMapperImpl implements TypeEntityMapper {

    @Override
    public TypeEntity toEntity(Type type) {
        if ( type == null ) {
            return null;
        }

        TypeEntity typeEntity = new TypeEntity();

        typeEntity.setFirstType( type.getFirstType() );
        typeEntity.setId( type.getId() );
        typeEntity.setSecondType( type.getSecondType() );

        return typeEntity;
    }

    @Override
    public Type toType(TypeEntity typeEntity) {
        if ( typeEntity == null ) {
            return null;
        }

        Long id = null;
        String firstType = null;
        String secondType = null;

        id = typeEntity.getId();
        firstType = typeEntity.getFirstType();
        secondType = typeEntity.getSecondType();

        Type type = new Type( id, firstType, secondType );

        return type;
    }

    @Override
    public List<Type> toTypeList(List<TypeEntity> typeEntityList) {
        if ( typeEntityList == null ) {
            return null;
        }

        List<Type> list = new ArrayList<Type>( typeEntityList.size() );
        for ( TypeEntity typeEntity : typeEntityList ) {
            list.add( toType( typeEntity ) );
        }

        return list;
    }
}
