package com.raymond.application.jvsapi.jvsapi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.raymond.application.jvsapi.jvsapi.Model.Metadata;

public interface MetadataRepository extends MongoRepository<Metadata, Long> {
    
}