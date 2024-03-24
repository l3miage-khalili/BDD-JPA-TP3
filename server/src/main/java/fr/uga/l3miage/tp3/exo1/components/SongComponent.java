package fr.uga.l3miage.tp3.exo1.components;

import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.repositories.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@RequiredArgsConstructor
public class SongComponent {
    private final SongRepository songRepository ;

    public SongEntity getSong(String title){
        return songRepository.findById(title).orElseThrow() ;
    }

    public SongEntity createSong(SongEntity s){
        return songRepository.save(s) ;
    }

    public SongEntity updateSong(String title, Duration newDuration){
        SongEntity songEntity = getSong(title) ;
        songEntity.setDuration(newDuration);
        return songRepository.save(songEntity) ;
    }

    public void deleteSong(String title){
        songRepository.deleteById(title);
    }
}
