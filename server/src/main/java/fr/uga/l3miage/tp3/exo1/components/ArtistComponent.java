package fr.uga.l3miage.tp3.exo1.components;

import fr.uga.l3miage.tp3.exo1.models.ArtistEntity;
import fr.uga.l3miage.tp3.exo1.repositories.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArtistComponent {
    private final ArtistRepository artistRepository ;

    public ArtistEntity getArtist(String name){
        return artistRepository.findById(name).orElseThrow() ;
    }

    public ArtistEntity createArtist(ArtistEntity artistEntity){
        return artistRepository.save(artistEntity) ;
    }

    public ArtistEntity updateBiography(String name, String biography){
        ArtistEntity artistEntity = getArtist(name) ;
        artistEntity.setBiography(biography);
        return artistRepository.save(artistEntity) ;
    }

    public void deleteArtist(String name){
        artistRepository.deleteById(name);
    }



}
