package com.psi.cartoes.controller;

import com.psi.cartoes.dto.CardDTO;
import com.psi.cartoes.model.Card;
import com.psi.cartoes.repository.CardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
@Slf4j
public class CardController {

    @Autowired
    CardRepository repository;

    @PostMapping
    public Card createANewCard(@RequestBody CardDTO card){
        log.info("Criando card card={}", card);
        Card cards = new Card();
        cards.setName(card.getName());
        cards.setColor(card.getColor());
        return repository.save(cards);
    }

    @GetMapping
    public List<Card> getAllCards(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable("id") Long id){
        log.info("Buscando card por id id={}", id);
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updateCardById(@PathVariable("id") Long id, @RequestBody CardDTO card){
        log.info("Atualizando card por id id={}", id);
        Card cardById = getCardById(id);
        cardById.setName(card.getName());
        cardById.setColor(card.getColor());
        repository.save(cardById);
    }

    @DeleteMapping("/{id}")
    public void deleteCardById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }



}
