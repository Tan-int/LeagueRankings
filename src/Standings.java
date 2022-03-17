import java.util.ArrayList;
import java.util.Collections;

public class Standings<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public Standings(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            System.out.println(team.getName() + " is already in the standings");
            return false;
        }

        teams.add(team);
        return true;
    }

    public void rankings() {
        Collections.sort(teams);
        System.out.println("-------- " + name + " --------");
        for(T t: teams) {
            System.out.println((teams.indexOf(t) + 1) + ". " + t.toString());
        }
    }

    //GETTERS

    public ArrayList<T> getTeams() {
        return teams;
    }
}
