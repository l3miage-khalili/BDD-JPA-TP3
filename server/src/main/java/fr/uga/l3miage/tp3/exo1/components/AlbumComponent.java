package fr.uga.l3miage.tp3.exo1.components;

import fr.uga.l3miage.tp3.exo1.models.AlbumEntity;
import fr.uga.l3miage.tp3.exo1.repositories.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@RequiredArgsConstructor
public class AlbumComponent {
    private final AlbumRepository albumRepository ;

    public AlbumEntity getAlbum(String title){
        return albumRepository.findById(title).orElseThrow() ;
    }

    public AlbumEntity createAlbum(AlbumEntity albumEntity){
        return albumRepository.save(albumEntity) ;
    }

    public AlbumEntity updateReleaseYear(String title, Date releaseYear){
        AlbumEntity albumEntity = getAlbum(title) ;
        albumEntity.setReleaseDate(releaseYear);
        return albumRepository.save(albumEntity) ;
    }

    public void deleteAlbum(String title){
        albumRepository.deleteById(title);
    }
}
