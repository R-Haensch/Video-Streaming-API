package com.raymond.application.jvsapi.jvsapi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.raymond.application.jvsapi.jvsapi.Model.Video;

public interface VideoRepository extends MongoRepository<Video, Long> {
    // Additional custom queries can be defined here if needed
    public Video delistVideo(Video video);
    public Video findById(long videoId);

}