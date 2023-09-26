package org.spring.springVue.controller;

import lombok.RequiredArgsConstructor;
import org.spring.springVue.dto.BoardDto;
import org.spring.springVue.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board")
    public List<BoardDto> boardList(){
       return boardService.boardList();
    }


}
