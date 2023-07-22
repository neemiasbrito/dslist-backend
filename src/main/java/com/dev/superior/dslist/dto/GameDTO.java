package com.dev.superior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.dev.superior.dslist.entities.Game;

public class GameDTO {
    //atributos
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String longDescription;
    // construtor sem paramentos
    public GameDTO(){
    }
    // construtor recebe uma entidade
    public GameDTO(Game Entity){
        BeanUtils.copyProperties(Entity, this);
    }
    // metodos getes e setes
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPlatforms() {
        return platforms;
    }
    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }
    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getLongDescription() {
        return longDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    
    


}
