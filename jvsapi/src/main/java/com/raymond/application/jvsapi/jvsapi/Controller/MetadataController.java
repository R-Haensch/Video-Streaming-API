package com.raymond.application.jvsapi.jvsapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.raymond.application.jvsapi.jvsapi.Model.Metadata;
import com.raymond.application.jvsapi.jvsapi.Service.MetadataService;

@RestController
@RequestMapping("/metadata")
public class MetadataController {

    @Autowired
    private MetadataService metadataService;

    /**
     * Adds or updates metadata for a video.
     *
     * @param metadata Metadata information to be added or updated.
     * @return The updated metadata for the video.
     */
    @PostMapping
    public Metadata addOrUpdateMetadata(@RequestBody Metadata metadata) {
        return metadataService.addOrUpdateMetadata(metadata);
    }
}
