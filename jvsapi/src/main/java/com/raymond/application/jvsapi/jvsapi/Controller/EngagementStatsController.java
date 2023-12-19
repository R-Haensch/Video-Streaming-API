package com.raymond.application.jvsapi.jvsapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.raymond.application.jvsapi.jvsapi.Model.EngagementStats;
import com.raymond.application.jvsapi.jvsapi.Service.EngagementStatsService;

@RestController
@RequestMapping("/engagement")
public class EngagementStatsController {

    @Autowired
    private EngagementStatsService engagementStatsService;

    // REST endpoints related to engagement statistics
    @GetMapping("/{videoId}")
    public EngagementStats getEngagementStats(@PathVariable Long videoId) {
        return engagementStatsService.getEngagementStats(videoId);
    }

    // Other methods as needed
}
