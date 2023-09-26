package org.spring.springVue.service;

import lombok.RequiredArgsConstructor;
import org.spring.springVue.dto.BoardDto;
import org.spring.springVue.entity.Board;
import org.spring.springVue.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;


    public List<BoardDto> boardList(){
        List<BoardDto> boardDtoList = new ArrayList<>();
        List<Board> boards = boardRepository.findAll();

        for(Board board : boards){
            BoardDto boardDto = BoardDto.builder()
                    .id(board.getId())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .build();

            boardDtoList.add(boardDto);
        }

        return boardDtoList;
    }
}
