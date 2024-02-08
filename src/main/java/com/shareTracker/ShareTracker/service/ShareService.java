package com.shareTracker.ShareTracker.service;

import com.shareTracker.ShareTracker.model.Share;
import com.shareTracker.ShareTracker.repository.ShareRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareService {
    @Autowired
    private ShareRepository shareRepository;
    public List<Share> getAllUser(){return shareRepository.findAll();}
}
