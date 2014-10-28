package com.quest.constant;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Entity;

import com.google.appengine.api.datastore.Blob;

@Entity
public class Image {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;

    @Persistent
    private String name;

    @Persistent
    Blob image;

    public Image() { }
    public Image(String name, Blob image) {
        this.name = name; 
        this.image = image;
    }

    // JPA getters and setters and empty contructor
    // ...
    public Blob getImage()              { return image; }
    public void setImage(Blob image)    { this.image = image; }
}