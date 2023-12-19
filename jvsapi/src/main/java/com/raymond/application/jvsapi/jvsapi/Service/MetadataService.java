package com.raymond.application.jvsapi.jvsapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raymond.application.jvsapi.jvsapi.Model.Metadata;
import com.raymond.application.jvsapi.jvsapi.Repository.MetadataRepository;

@Service
public class MetadataService {

    @Autowired
    private MetadataRepository metadataRepository;

    // Business logic related to metadata
    public Metadata addOrUpdateMetadata(Metadata metadata) {
        // Additional business logic for adding/updating metadata
        return metadataRepository.save(metadata);
    }

    // Other methods as needed
}
