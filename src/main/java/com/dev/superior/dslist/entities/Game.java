package com.dev.superior.dslist.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {
    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String title;

    @Column(name = "game_year") // troca no banco de dados o nome year por game_year
    private Integer year;
    private String genre;
    private String platforms;
    private Double scode;
    private String imgUrlString;
    private String shortDescription;
    private String longDescription;
    // METODOS CONSTRUTOR SEM ARGUMENTOS 
    public Game() {
    }
    // METODOS CINSTRUTOR COM ARGUMENTOS
    public Game(Long id, String title, Integer year, String genre, String platforms, Double scode, String imgUrlString,
            String shortDescription, String longDescription) {
        this.id = id; // this .id e outros e referente a da classs game e  = id e do argumentos
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.scode = scode;
        this.imgUrlString = imgUrlString;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
    // METODOS GETES E SETES
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
    public Double getScode() {
        return scode;
    }
    public void setScode(Double scode) {
        this.scode = scode;
    }
    public String getImgUrlString() {
        return imgUrlString;
    }
    public void setImgUrlString(String imgUrlString) {
        this.imgUrlString = imgUrlString;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public String getLongDescription() {
        return longDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    // METODOS EQUALS E HASHCODE do (ID) SERVE PRA OMPRARA SE DOIS GAMES SAO IGUAIS 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    
}
