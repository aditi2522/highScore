package main;

public class Scoreboard {
    private int numEntries=0;
    private GameEntry[] board;
    public Scoreboard(int capacity)
    {
        board=new GameEntry[capacity];

    }
    public void add(GameEntry gameEntry)
    {
        int newScore=gameEntryscore;
        if(numEntries<board.length||newScore>board[numEntries-1].score)
        {
            if()
            board[0]=gameEntry;
        }
    }
    public void remove(int i)
    {

    }
}
