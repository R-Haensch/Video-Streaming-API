package com.raymond.application.jvsapi.jvsapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.raymond.application.jvsapi.jvsapi.Model.Video;
import com.raymond.application.jvsapi.jvsapi.Repository.VideoRepository;
import com.raymond.application.jvsapi.jvsapi.Service.VideoService;

@RunWith(MockitoJUnitRunner.class)
public class VideoServiceTest {

    @Mock
    private VideoRepository videoRepository;

    @InjectMocks
    private VideoService videoService;

    @Test
    public void testPublishVideo() {
        // Arrange
        Video video = new Video();
        when(videoRepository.save(any(Video.class))).thenReturn(video);

        // Act
        Video result = videoService.publishVideo(video);

        // Assert
        assertNotNull(result);
        verify(videoRepository, times(1)).save(any(Video.class));
    }

    // Other unit tests for VideoService methods
}
