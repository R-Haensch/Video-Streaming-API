package com.raymond.application.jvsapi.jvsapi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.raymond.application.jvsapi.jvsapi.Model.Video;

public interface VideoRepository extends MongoRepository<Video, Long> {
    public Video findById(long videoId);

}