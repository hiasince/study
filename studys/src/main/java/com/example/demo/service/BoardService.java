package com.example.demo.service;

import com.example.demo.domain.board.V1_0Board;
import com.example.demo.domain.board.V1_0SearchBoard;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public int createBoard(V1_0Board board) {
        return boardRepository.createBoard(board);
    }

    public Collection<V1_0Board> getBoard(V1_0SearchBoard searchBoard) {
        return boardRepository.getBoards();
    }
}
