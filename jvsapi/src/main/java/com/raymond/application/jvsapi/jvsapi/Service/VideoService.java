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

    /**
     * Retrieves a list of all available videos.
     *
     * @return A list containing all available videos.
     */
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    /**
     * Delists (soft deletes) a video and its associated metadata.
     *
     * @param video The video to be delisted.
     * @return The delisted video.
     */
    public Video delistVideo(Video video) {
        video.setListed(false);
        return videoRepository.save(video);
    }

    /**
     * Retrieves a video based on its identifier.
     *
     * @param videoId The identifier of the video to be retrieved.
     * @return An Optional containing the retrieved video, or empty if the video is not found.
     */
    public Optional<Video> loadVideo(Long videoId) {
        return videoRepository.findById(videoId);
    }

    /**
     * Publishes a new video.
     *
     * @param video The video to be published.
     * @return The published video.
     */
    public Video publishVideo(Video video) {
        return videoRepository.save(video);
    }
}