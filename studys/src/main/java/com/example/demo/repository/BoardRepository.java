package com.example.demo.repository;

import com.example.demo.converter.BoardConverter;
import com.example.demo.domain.board.V1_0Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class BoardRepository {
    private BoardMapper boardMapper;
    private BoardConverter boardConverter;

    @Autowired
    public BoardRepository(BoardMapper boardMapper, BoardConverter boardConverter) {
        this.boardConverter = boardConverter;
        this.boardMapper = boardMapper;
    }

    public int createBoard(V1_0Board board) {
        return boardMapper.insertBoard();
    }

    public V1_0Board getBoard() {
        return boardConverter.toV1_0Board(boardMapper.selectBoard());
    }

    public Collection<V1_0Board> getBoards() {
        return boardConverter.toV1_0Boards(boardMapper.selectBoards());
    }
}
