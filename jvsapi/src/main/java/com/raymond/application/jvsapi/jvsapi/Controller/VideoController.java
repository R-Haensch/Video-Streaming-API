package com.raymond.application.jvsapi.jvsapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.raymond.application.jvsapi.jvsapi.Model.Video;
import com.raymond.application.jvsapi.jvsapi.Service.VideoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    /**
     * Retrieves a list of all available videos.
     *
     * @return A list containing videos.
     */
    @GetMapping
    public List<Video> getAllVideos() {
        return videoService.getAllVideos();
    }

    /**
     * Publishes a video.
     *
     * @param video The video to be published.
     * @return The published video.
     */
    @PostMapping
    public Video publishVideo(@RequestBody Video video) {
        return videoService.publishVideo(video);
    }

    /**
     * Delists (soft deletes) a video.
     *
     * @param videoId The identifier of the video to be delisted.
     */
    @DeleteMapping("/{videoId}")
    public void delistVideo(@PathVariable Video video) {
        // Implement soft delete logic in the service
        videoService.delistVideo(video);
    }

    /**
     * Retrieves a video based on its identifier.
     *
     * @param videoId The identifier of the video to be retrieved.
     * @return The video with the specified identifier.
     */
    @GetMapping("/{videoId}")
    public Video loadVideo(@PathVariable Long videoId) {
        Optional<Video> optionalVideo = videoService.loadVideo(videoId);
        return optionalVideo.orElse(null); // or throw an exception if needed
    }
}
