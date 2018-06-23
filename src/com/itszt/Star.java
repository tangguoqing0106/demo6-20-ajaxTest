package com.itszt;

/**
 * Created by Administrator on 2018\6\21 0021.
 */
public class Star {
    private int id;
    private String name;
    private String img;
    private String description;

    public Star(int id, String name, String img, String description) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.description = description;
    }

    public Star() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
