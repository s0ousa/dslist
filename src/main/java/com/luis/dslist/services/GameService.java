package com.luis.dslist.services;

import com.luis.dslist.dto.GameMinDTO;
import com.luis.dslist.entities.Game;
import com.luis.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(obj -> new GameMinDTO(obj)).toList();
        return dto;
    }
}