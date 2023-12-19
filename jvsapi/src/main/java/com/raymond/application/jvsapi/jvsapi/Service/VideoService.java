package com.raymond.application.jvsapi.jvsapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raymond.application.jvsapi.jvsapi.Model.Video;
import com.raymond.application.jvsapi.jvsapi.Repository.VideoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    // Business logic related to videos
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Video delistVideo(Video video) {
        // Additional business logic for publishing a video
        return videoRepository.delistVideo(video);
    }

    public Optional<Video> loadVideo(Long videoId) {
        // Additional business logic for publishing a video
        return videoRepository.findById(videoId);
    }

    public Video publishVideo(Video video) {
        // Additional business logic for publishing a video
        return videoRepository.save(video);
    }

    // Other methods as needed
}