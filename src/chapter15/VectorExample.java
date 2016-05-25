package chapter15;

import java.util.*;

/**
 * Created by eluticaa on 2016-05-24.
 */
public class VectorExample {


    public static void main(String[] args) {

        List<Board> list = new Vector<>();

        list.add(new Board("Subject1", "content1", "writer1"));
        list.add(new Board("Subject2", "content2", "writer2"));
        list.add(new Board("Subject3", "content3", "writer3"));
        list.add(new Board("Subject4", "content4", "writer4"));
        list.add(new Board("Subject5", "content5", "writer5"));


        list.remove(2);
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }
    }
}
