package com.raymond.application.jvsapi.jvsapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raymond.application.jvsapi.jvsapi.Model.EngagementStats;
import com.raymond.application.jvsapi.jvsapi.Repository.EngagementStatsRepository;

@Service
public class EngagementStatsService {

    @Autowired
    private EngagementStatsRepository engagementStatsRepository;

    /**
     * Retrieves engagement statistics for a specific video.
     *
     * @param videoId The identifier of the video for which engagement statistics are requested.
     * @return Engagement statistics including impressions and views for the specified video.
     *         If video is not found, returns null or an empty EngagementStats object.
     */
    public EngagementStats getEngagementStats(Long videoId) {
        return engagementStatsRepository.findById(videoId).orElse(null);
    }
}