package genericchallenge;

/**
 * Created by mindwarrior on 12/24/2016.
 */
public abstract class Club<T> {
    private String name;
    private int played;
    private int lost;
    private int won;
    private int drawn;
    public Club(String name,int played,int lost, int won , int drawn) {
        this.name = name;
        this.played = played;
        this.lost = lost;
        this.won = won;
        this.drawn = drawn;
    }

    public String getName() {
        return this.name;
    }

    public int getLost() {
        return this.lost;
    }

    public int getWon() {
        return this.won;
    }

    public int getDrawn() {
        return this.drawn;
    }

    public int getPlayed() {
        return this.played;
    }


}
