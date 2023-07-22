package com.dev.superior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable // ta encapsulando 2 atributps em 1 so pra a class
    public class BelongingPK {
    //#region atributos
    @ManyToOne // muitos para um 1
    @JoinColumn(name = "game_id") // chave estrageira e noome dela
    private Game game;

    @ManyToOne // muitos para um 1
    @JoinColumn(name = "list_id")
    private GameList list;
    //#endregion
    //#region construtor sem paramentos
    public BelongingPK(){
    }
    //#endregion
    //#region construtor com paramentos
    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }
    //#endregion
    //#region metodos getes e setes
    public Game getGame() {
        return game;
    }
    public void setGame(Game game) {
        this.game = game;
    }
    public GameList getList() {
        return list;
    }
    public void setList(GameList list) {
        this.list = list;
    }
    //#endregion
    //#region metodos equals e hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((game == null) ? 0 : game.hashCode());
        result = prime * result + ((list == null) ? 0 : list.hashCode());
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
        BelongingPK other = (BelongingPK) obj;
        if (game == null) {
            if (other.game != null)
                return false;
        } else if (!game.equals(other.game))
            return false;
        if (list == null) {
            if (other.list != null)
                return false;
        } else if (!list.equals(other.list))
            return false;
        return true;
    }
    //#endregion

}
