package com.raymond.application.jvsapi.jvsapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.raymond.application.jvsapi.jvsapi.Model.EngagementStats;
import com.raymond.application.jvsapi.jvsapi.Model.Video;
import com.raymond.application.jvsapi.jvsapi.Service.EngagementStatsService;
import com.raymond.application.jvsapi.jvsapi.Service.VideoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    // REST endpoints related to videos
    @GetMapping
    public List<Video> getAllVideos() {
        return videoService.getAllVideos();
    }

    @PostMapping
    public Video publishVideo(@RequestBody Video video) {
        return videoService.publishVideo(video);
    }

    // Delist a video (soft delete)
    @DeleteMapping("/{videoId}")
    public void delistVideo(@PathVariable Video video) {
        // Implement soft delete logic in the service
        videoService.delistVideo(video);
    }

    // Load a video
    @GetMapping("/{videoId}")
    public Video loadVideo(@PathVariable Long videoId) {
        Optional<Video> optionalVideo = videoService.loadVideo(videoId);
        return optionalVideo.orElse(null); // or throw an exception if needed
    }
}
