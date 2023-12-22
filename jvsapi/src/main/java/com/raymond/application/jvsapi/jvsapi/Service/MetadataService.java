package com.raymond.application.jvsapi.jvsapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raymond.application.jvsapi.jvsapi.Model.Metadata;
import com.raymond.application.jvsapi.jvsapi.Repository.MetadataRepository;

@Service
public class MetadataService {

    @Autowired
    private MetadataRepository metadataRepository;

    /**
     * Adds or updates metadata for a video.
     *
     * @param metadata Metadata information to be added or updated.
     * @return The updated metadata for the video.
     */
    public Metadata addOrUpdateMetadata(Metadata metadata) {
        return metadataRepository.save(metadata);
    }
}
