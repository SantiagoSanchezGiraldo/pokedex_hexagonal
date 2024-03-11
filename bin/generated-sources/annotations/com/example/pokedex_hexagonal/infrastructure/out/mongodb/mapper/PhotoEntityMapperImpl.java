package com.example.pokedex_hexagonal.infrastructure.out.mongodb.mapper;

import com.example.pokedex_hexagonal.domain.model.Photo;
import com.example.pokedex_hexagonal.infrastructure.out.mongodb.entity.PhotoEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-10T19:02:36-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class PhotoEntityMapperImpl implements PhotoEntityMapper {

    @Override
    public PhotoEntity toEntity(Photo photo) {
        if ( photo == null ) {
            return null;
        }

        PhotoEntity photoEntity = new PhotoEntity();

        photoEntity.setId( photo.getId() );
        byte[] photo1 = photo.getPhoto();
        if ( photo1 != null ) {
            photoEntity.setPhoto( Arrays.copyOf( photo1, photo1.length ) );
        }

        return photoEntity;
    }

    @Override
    public Photo toPhoto(PhotoEntity photoEntity) {
        if ( photoEntity == null ) {
            return null;
        }

        String id = null;
        byte[] photo = null;

        id = photoEntity.getId();
        byte[] photo1 = photoEntity.getPhoto();
        if ( photo1 != null ) {
            photo = Arrays.copyOf( photo1, photo1.length );
        }

        Photo photo2 = new Photo( id, photo );

        return photo2;
    }

    @Override
    public List<Photo> toPhotoList(List<PhotoEntity> photoEntityList) {
        if ( photoEntityList == null ) {
            return null;
        }

        List<Photo> list = new ArrayList<Photo>( photoEntityList.size() );
        for ( PhotoEntity photoEntity : photoEntityList ) {
            list.add( toPhoto( photoEntity ) );
        }

        return list;
    }
}
