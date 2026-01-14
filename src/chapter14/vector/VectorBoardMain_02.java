package chapter14.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorBoardMain_02 {

	public static void main(String[] args) {
		
		//List<Board> syncList = new Vector();
		List<Board> syncList = Collections.synchronizedList(new ArrayList<>());
		
		// Board 객체 생성 == 내용
		 Board b = new Board("제목 1", "내용 1", "글쓴이 1");
		 syncList.add(b);
		 
		 syncList.add(new Board("제목 2", "내용 2", "글쓴이 2"));
		 syncList.add(new Board("제목 3", "내용 3", "글쓴이 3"));
		 syncList.add(new Board("제목 4", "내용 4", "글쓴이 4"));
		 syncList.add(new Board("제목 5", "내용 5", "글쓴이 5"));
		 
		 for(int i=0;i<syncList.size();i++) {
			 Board board = syncList.get(i);
			 System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		 }//for
		 
		 //내용삭제
		 syncList.remove(2);
		 System.out.println();
		 
		 for(int i=0;i<syncList.size();i++) {
			 Board board = syncList.get(i);
			 System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		 }//for
		 
		//내용삭제
		 syncList.remove(2);
		 System.out.println();
		 
		 for(int i=0;i<syncList.size();i++) {
			 Board board = syncList.get(i);
			 System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		 }//for

	}

}
