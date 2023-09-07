package com.dev.superior.dslist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.superior.dslist.dto.GameListDTO;

import com.dev.superior.dslist.entities.GameList;
import com.dev.superior.dslist.repositories.GameListRepository;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    // aqui tem que fazer um exceção por id que nao existem
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
        
    }
    
}
