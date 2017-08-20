package genericchallenge;

import java.util.ArrayList;

/**
 * Created by mindwarrior on 12/24/2016.
 */
public class League <T extends Club> implements Comparable<League<T>> {

    private ArrayList<Club<T>> listOfleague;

    public League(Club <T> club) {
       listOfleague = new ArrayList<>();
        this.listOfleague.add(club);

    }



    public void addTeamToLeague(String clubName) {
        Club club = findLeague(clubName);
        ArrayList<Club<T>> clubs = new ArrayList<>();



    }
    Club findLeague(String teamName)
    {

        for(int i=0;i<this.listOfleague.size();i++)
        {

        }
    }

    @Override
    public int compareTo(League<T> team) {

    }
}
