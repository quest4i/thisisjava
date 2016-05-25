package chapter15.exercise;

import java.util.List;




/**
 * Created by eluticaa on 2016-05-25.
 */
public class ListExample {

    public static void main(String[] args) {

        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }

    }
}
