package com.example.pokedex_hexagonal.application.mapper;

import com.example.pokedex_hexagonal.application.dto.TypeDto;
import com.example.pokedex_hexagonal.domain.model.Type;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-10T19:02:34-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class TypeDtoMapperImpl implements TypeDtoMapper {

    @Override
    public TypeDto toDto(Type type) {
        if ( type == null ) {
            return null;
        }

        TypeDto typeDto = new TypeDto();

        typeDto.setFirstType( type.getFirstType() );
        typeDto.setSecondType( type.getSecondType() );

        return typeDto;
    }
}
