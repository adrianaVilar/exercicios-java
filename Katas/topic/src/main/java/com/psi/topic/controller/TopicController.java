package com.psi.topic.controller;

import com.psi.topic.dto.TopicDTO;
import com.psi.topic.model.Topic;
import com.psi.topic.repository.TopicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("topic")
@Slf4j
public class TopicController {

    @Autowired
    TopicRepository repository;

    @PostMapping
    public Topic creatANewTopic(@RequestBody TopicDTO topic){
        Topic topics = new Topic();
        topics.setName(topic.getName());
        return repository.save(topics);
    }

    @GetMapping
    public List<Topic> getAllTopics(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Topic getTopicById(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public void updateTopicById(@PathVariable("id") Long id, @RequestBody TopicDTO topic){
        Topic topics = getTopicById(id);
        topics.setName(topic.getName());
        repository.save(topics);
    }

    @DeleteMapping("/{id}")
    public void deleteTopicById(@PathVariable("id") Long id){
        repository.deleteById(id);
    }




}

