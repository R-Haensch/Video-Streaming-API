package com.raymond.application.jvsapi.jvsapi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.raymond.application.jvsapi.jvsapi.Model.EngagementStats;

public interface EngagementStatsRepository extends MongoRepository<EngagementStats, Long> {
    
}