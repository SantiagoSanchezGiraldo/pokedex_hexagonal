package com.example.pokedex_hexagonal.infrastructure.out.jpa.mapper;

import com.example.pokedex_hexagonal.domain.model.Pokemon;
import com.example.pokedex_hexagonal.infrastructure.out.jpa.entity.PokemonEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-10T19:02:39-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class PokemonEntityMapperImpl implements PokemonEntityMapper {

    @Override
    public PokemonEntity toEntity(Pokemon pokemon) {
        if ( pokemon == null ) {
            return null;
        }

        PokemonEntity pokemonEntity = new PokemonEntity();

        pokemonEntity.setId( pokemon.getId() );
        pokemonEntity.setName( pokemon.getName() );
        pokemonEntity.setNumber( pokemon.getNumber() );
        pokemonEntity.setPhotoId( pokemon.getPhotoId() );
        pokemonEntity.setTypeId( pokemon.getTypeId() );

        return pokemonEntity;
    }

    @Override
    public Pokemon toPokemon(PokemonEntity pokemonEntity) {
        if ( pokemonEntity == null ) {
            return null;
        }

        Long id = null;
        Long number = null;
        String name = null;
        Long typeId = null;
        String photoId = null;

        id = pokemonEntity.getId();
        number = pokemonEntity.getNumber();
        name = pokemonEntity.getName();
        typeId = pokemonEntity.getTypeId();
        photoId = pokemonEntity.getPhotoId();

        Pokemon pokemon = new Pokemon( id, number, name, typeId, photoId );

        return pokemon;
    }

    @Override
    public List<Pokemon> toPokemonList(List<PokemonEntity> pokemonEntityList) {
        if ( pokemonEntityList == null ) {
            return null;
        }

        List<Pokemon> list = new ArrayList<Pokemon>( pokemonEntityList.size() );
        for ( PokemonEntity pokemonEntity : pokemonEntityList ) {
            list.add( toPokemon( pokemonEntity ) );
        }

        return list;
    }
}
