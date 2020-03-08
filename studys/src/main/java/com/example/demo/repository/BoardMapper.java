package com.example.demo.repository;

import com.example.demo.domain.board.Board;

import java.util.Collection;

public interface BoardMapper {
    int insertBoard();

    Board selectBoard();

    Collection<Board> selectBoards();
}
