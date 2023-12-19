package com.raymond.application.jvsapi.jvsapi;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.raymond.application.jvsapi.jvsapi.Model.Video;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VideoControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testPublishVideo() {
        // Arrange
        Video video = new Video();
        HttpEntity<Video> request = new HttpEntity<>(video);

        // Act
        ResponseEntity<Video> response = restTemplate.postForEntity("/videos", request, Video.class);

        // Assert
        // TODO assertEquals(HttpStatus.CREATED, response.getStatusCode());
        // TODO assertNotNull(response.getBody());
        // Additional assertions based on your application logic
    }

    // Other integration tests for controllers
}

