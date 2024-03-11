package com.example.pokedex_hexagonal.application.mapper;

import com.example.pokedex_hexagonal.application.dto.PokedexResponse;
import com.example.pokedex_hexagonal.application.dto.TypeDto;
import com.example.pokedex_hexagonal.domain.model.Photo;
import com.example.pokedex_hexagonal.domain.model.Pokemon;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-10T19:02:37-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class PokedexResponseMapperImpl implements PokedexResponseMapper {

    @Override
    public PokedexResponse toResponse(Pokemon pokemon, TypeDto typeDto, Photo photo) {
        if ( pokemon == null && typeDto == null && photo == null ) {
            return null;
        }

        PokedexResponse pokedexResponse = new PokedexResponse();

        if ( pokemon != null ) {
            pokedexResponse.setName( pokemon.getName() );
            pokedexResponse.setNumber( pokemon.getNumber() );
        }
        if ( photo != null ) {
            pokedexResponse.setPhoto( PokedexResponseMapper.byteArrayToBase64( photo.getPhoto() ) );
        }
        pokedexResponse.setTypes( typeDtoToTypeDto( typeDto ) );

        return pokedexResponse;
    }

    protected TypeDto typeDtoToTypeDto(TypeDto typeDto) {
        if ( typeDto == null ) {
            return null;
        }

        TypeDto typeDto1 = new TypeDto();

        typeDto1.setFirstType( typeDto.getFirstType() );
        typeDto1.setSecondType( typeDto.getSecondType() );

        return typeDto1;
    }
}
