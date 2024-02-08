package com.shareTracker.ShareTracker.controller;

import com.shareTracker.ShareTracker.model.Share;
import com.shareTracker.ShareTracker.repository.ShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://localhost:5073/")
public class ShareController {
    @Autowired
    private ShareRepository shareRepository;
    @PostMapping("/share")
    Share newShare(@RequestBody Share newShare){
        return shareRepository.save(newShare);
    }
    @GetMapping("/users")
    List<Share> getAllShare(){
        return shareRepository.findAll();
    }
}
