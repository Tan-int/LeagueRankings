import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Standings<NBA> nbaStandings = new Standings<>("Eastern Conference");
        NBA nets = new NBA("Brooklyn Nets", "Eastern", 48,24);
        NBA sixers = new NBA ("Philadelphia 76ers", "Eastern",49,23);
        NBA bucks = new NBA ("Milwaukee Bucks", "Eastern",46,26);
        NBA knicks = new NBA ("New York Knicks", "Eastern",41,31);
        NBA hawks = new NBA ("Atlanta Hawks", "Eastern",41,31);
        NBA heat = new NBA("Miami Heat", "Eastern", 40, 32);
        NBA celtics = new NBA("Boston Celtics", "Eastern", 36, 36);
        NBA wizards = new NBA("Washington Wizards", "Eastern", 34, 38);


        nbaStandings.addTeam(celtics);
        nbaStandings.addTeam(nets);
        nbaStandings.addTeam(sixers);
        nbaStandings.addTeam(bucks);
        nbaStandings.addTeam(knicks);
        nbaStandings.addTeam(hawks);
        nbaStandings.addTeam(heat);
        nbaStandings.addTeam(wizards);
        Collections.sort(nbaStandings.getTeams());
        nbaStandings.rankings();

        Standings<NFL> nflStandings = new Standings<>("American Football Conference");
        NFL raiders = new NFL("Las Vegas Raiders", "AFC West", 10,7,0);
    }
}
