package com.dev.superior.dslist.dto;

import com.dev.superior.dslist.entities.Game;
import com.dev.superior.dslist.projections.GameMinProjection;

// manda pra o banco de dado so as informações que mas enterreça
public class GameMinDTO {
    // atributos 
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    // construtor sem paramentos
    public GameMinDTO(){
    }
    //construtor que recebe as entidades, copiando os dados do banco
    public GameMinDTO(Game Entity) {
        id = Entity.getId();
        title = Entity.getTitle();
        year = Entity.getYear();
        imgUrl = Entity.getImgUrl();
        shortDescription = Entity.getShortDescription();
    }


    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    //métoodos getes
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    




}
