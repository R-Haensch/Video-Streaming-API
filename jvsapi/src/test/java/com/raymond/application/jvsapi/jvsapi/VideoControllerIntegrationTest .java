package com.raymond.application.jvsapi.jvsapi;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.raymond.application.jvsapi.jvsapi.Model.Video;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VideoControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGetAllVideos() {
        Video video = new Video();
        HttpEntity<Video> request = new HttpEntity<>(video);

        ResponseEntity<Video> response = restTemplate.postForEntity("/videos" , request, null);
        assertEquals(HttpStatusCode.valueOf(200), response.getStatusCode());
        assert(response.getBody() != null);
    }

    @Test
    void testPublishVideo() {
        Video video = new Video();
        HttpEntity<Video> request = new HttpEntity<>(video);

        ResponseEntity<Video> response = restTemplate.postForEntity("/videos", request, Video.class);
        assertEquals(HttpStatusCode.valueOf(201), response.getStatusCode());
        assert(response.getBody() != null);
    }

    @Test
    void testDelistVideo() {
        Video video = new Video();

        restTemplate.delete("/videos/"+ video.getID());
        
        ResponseEntity<Video> response = restTemplate.getForEntity("/videos/"+ video.getID(), Video.class, video.getID());
        assertEquals(HttpStatusCode.valueOf(404), response.getStatusCode());
        assert(response.getBody() == null);
    }

    @Test
    void testLoadVideo() {
        Video video = new Video();

        ResponseEntity<Video> response = restTemplate.getForEntity("/videos/"+ video.getID(), Video.class, video.getID());
        assertEquals(HttpStatusCode.valueOf(200), response.getStatusCode());
        assert(response.getBody() != null);
    }

}

