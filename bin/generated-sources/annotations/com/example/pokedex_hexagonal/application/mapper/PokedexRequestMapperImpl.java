package com.example.pokedex_hexagonal.application.mapper;

import com.example.pokedex_hexagonal.application.dto.PokedexRequest;
import com.example.pokedex_hexagonal.domain.model.Photo;
import com.example.pokedex_hexagonal.domain.model.Pokemon;
import com.example.pokedex_hexagonal.domain.model.Type;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-10T19:02:38-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class PokedexRequestMapperImpl implements PokedexRequestMapper {

    @Override
    public Pokemon toPokemon(PokedexRequest pokedexRequest) {
        if ( pokedexRequest == null ) {
            return null;
        }

        Long number = null;
        String name = null;

        number = pokedexRequest.getNumber();
        name = pokedexRequest.getName();

        Long id = null;
        Long typeId = null;
        String photoId = null;

        Pokemon pokemon = new Pokemon( id, number, name, typeId, photoId );

        return pokemon;
    }

    @Override
    public Type toType(PokedexRequest pokedexRequest) {
        if ( pokedexRequest == null ) {
            return null;
        }

        String firstType = null;
        String secondType = null;

        firstType = pokedexRequestTypesFirstType( pokedexRequest );
        secondType = pokedexRequestTypesSecondType( pokedexRequest );

        Long id = null;

        Type type = new Type( id, firstType, secondType );

        return type;
    }

    @Override
    public Photo toPhoto(PokedexRequest pokedexRequest) {
        if ( pokedexRequest == null ) {
            return null;
        }

        byte[] photo = null;

        photo = PokedexRequestMapper.base64ToByteArray( pokedexRequest.getPhoto() );

        String id = null;

        Photo photo1 = new Photo( id, photo );

        return photo1;
    }

    private String pokedexRequestTypesFirstType(PokedexRequest pokedexRequest) {
        if ( pokedexRequest == null ) {
            return null;
        }
        Type types = pokedexRequest.getTypes();
        if ( types == null ) {
            return null;
        }
        String firstType = types.getFirstType();
        if ( firstType == null ) {
            return null;
        }
        return firstType;
    }

    private String pokedexRequestTypesSecondType(PokedexRequest pokedexRequest) {
        if ( pokedexRequest == null ) {
            return null;
        }
        Type types = pokedexRequest.getTypes();
        if ( types == null ) {
            return null;
        }
        String secondType = types.getSecondType();
        if ( secondType == null ) {
            return null;
        }
        return secondType;
    }
}
