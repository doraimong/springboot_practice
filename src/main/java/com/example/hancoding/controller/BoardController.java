package com.example.hancoding.controller;

import com.example.hancoding.entity.Board;
import com.example.hancoding.repository.BoardRepository;
import com.example.hancoding.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("board/write")
    public String boardWriteForm(){

        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){

       // System.out.println(title + " "+ content );
        System.out.println("controller");
        System.out.println(board);
       boardService.write(board);


        return "";
    }

}
