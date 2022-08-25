package com.repertorio.musical.controller;

import com.repertorio.musical.dto.MusicDTO;
import com.repertorio.musical.model.Music;
import com.repertorio.musical.repository.MusicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
@Slf4j
public class MusicController {

    @Autowired
    private MusicRepository repository;

    @PostMapping
    private Music createANewMusic(@RequestBody MusicDTO music){
        Music musics = new Music();
        musics.setName(music.getName());
        musics.setSinger(music.getSinger());
        return repository.save(musics);
    }

    @GetMapping
    private List<Music> getAllMusics(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    private Music getMusicById(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    private void updateMusicById(@PathVariable("id") Long id, @RequestBody MusicDTO music){
        Music musicById = getMusicById(id);
        if(musicById == null) return;
        musicById.setName(music.getName());
        musicById.setSinger(music.getSinger());
        repository.save(musicById);
    }

    @DeleteMapping("/{id}")
    private void deleteMusicById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}
