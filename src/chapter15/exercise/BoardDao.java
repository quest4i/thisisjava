package chapter15.exercise;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by eluticaa on 2016-05-25.
 */
public class BoardDao {


    private List<Board> boardList;


    public BoardDao() {
        boardList = new ArrayList<>();
        boardList.add(new Board("This is Java.", "Java 8 lanuage"));
        boardList.add(new Board("Core Java 8", "new features of Java 8"));
    }

    public List<Board> getBoardList() {

        return  boardList;
    }
}
