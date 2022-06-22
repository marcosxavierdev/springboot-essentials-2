package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

//    private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return  List.of(new Anime (1L,"DBZ"), new Anime (2L, "Naruto"),new Anime (3L,"Bleach"));
    }
}
