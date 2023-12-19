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

    // REST endpoints related to metadata
    @PostMapping
    public Metadata addOrUpdateMetadata(@RequestBody Metadata metadata) {
        return metadataService.addOrUpdateMetadata(metadata);
    }

    // Other methods as needed
}
