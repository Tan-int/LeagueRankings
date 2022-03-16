import java.util.ArrayList;

public class Standings<T extends Team> {
    private String name;
    private ArrayList<Team> teams = new ArrayList<>();

    public Standings(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        for(Team t: teams) {
            if(t.getName().equals(team.getName())) {
                System.out.println(team.getName() + " is already on the list");
                return false;
            } else if (!t.getConference().equals(team.getConference())) {
                System.out.println("Teams must be in the same conference");
                return false;
            }
        }

        teams.add(team);
        System.out.println(team.getName() + " added to " + team.getConference());
        return true;

    }

    public void rankings() {
        for(Team t: teams) {
            System.out.println(t.toString());
        }
    }

    //GETTERS

    public ArrayList<Team> getTeams() {
        return teams;
    }
}
