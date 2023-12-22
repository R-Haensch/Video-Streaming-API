package com.raymond.application.jvsapi.jvsapi.Model;

import javax.persistence.*;

@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean listed;
    private String title;
    private String content; // A mock string for video content

    public void setListed(boolean _listed){
        listed = _listed;
    }
}
