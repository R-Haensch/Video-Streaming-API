package com.raymond.application.jvsapi.jvsapi.Model;

import javax.persistence.*;

@Entity
@Table(name = "metadata")
public class Metadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;

    private int runTime;
    private String description;
    private String director;
    private String cast;
    private int yearOfRelease;
    private String genre;

}
