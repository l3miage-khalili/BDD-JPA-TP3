package fr.uga.l3miage.tp3.exo1.components;

import fr.uga.l3miage.tp3.exo1.models.PlaylistEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.repositories.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class PlaylistComponent {
    private final PlaylistRepository playlistRepository ;

    public PlaylistEntity getPlayList(String name){
        return playlistRepository.findById(name).orElseThrow() ;
    }

    public PlaylistEntity createPlayList(PlaylistEntity p){
        return playlistRepository.save(p) ;
    }

    public PlaylistEntity updatePlayList(String name, String newDescription){
        PlaylistEntity playlistEntity = getPlayList(name) ;
        playlistEntity.setDescription(newDescription);
        return playlistRepository.save(playlistEntity) ;
    }

    public void deletePlayList(String name){
        playlistRepository.deleteById(name);
    }

    public Set<PlaylistEntity> getPlayListsHavingSongs(Set<SongEntity> songEntities){
        return playlistRepository.findDistinctBySongEntities(songEntities) ;
    }
}
