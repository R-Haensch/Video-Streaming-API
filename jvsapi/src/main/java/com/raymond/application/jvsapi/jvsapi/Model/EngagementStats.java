package com.raymond.application.jvsapi.jvsapi.Model;

import javax.persistence.*;

@Entity
@Table(name = "engagement_stats")
public class EngagementStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;

    private int impressions;
    private int views;

    // Constructors, getters, setters, and other methods
}
