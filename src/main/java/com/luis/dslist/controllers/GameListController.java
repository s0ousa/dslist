package com.luis.dslist.controllers;

import com.luis.dslist.dto.GameListDTO;
import com.luis.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }
}