public class Main {
    public static void main(String[] args) {
        Standings<NBA> nbaLeagueStandings = new Standings<>("NBA League Standings");
        NBA raptors = new NBA("Toronto Raptors", "Eastern", 27,45);
        NBA bulls = new NBA("Chicago Bulls", "Eastern", 31,41);
        NBA pacers = new NBA("Indiana Pacers", "Eastern", 34,38);
        NBA pistons = new NBA("Detroit Pistons", "Eastern", 20,52);
        NBA hornets = new NBA("Charlotte Hornets", "Eastern", 33,39);
        NBA nets = new NBA("Brooklyn Nets", "Eastern", 48,24);
        NBA sixers = new NBA ("Philadelphia 76ers", "Eastern",49,23);
        NBA bucks = new NBA ("Milwaukee Bucks", "Eastern",46,26);
        NBA knicks = new NBA ("New York Knicks", "Eastern",41,31);
        NBA hawks = new NBA ("Atlanta Hawks", "Eastern",41,31);
        NBA heat = new NBA("Miami Heat", "Eastern", 40, 32);
        NBA celtics = new NBA("Boston Celtics", "Eastern", 36, 36);
        NBA wizards = new NBA("Washington Wizards", "Eastern", 34, 38);
        NBA cavaliers = new NBA("Cleveland Cavaliers", "Eastern", 22,50);
        NBA magic = new NBA("Orlando Magic", "Eastern", 21,51);

        NBA jazz = new NBA("Utah Jazz", "Western", 52,20);
        NBA nuggets = new NBA("Denver Nuggets", "Western", 47,25);
        NBA suns = new NBA("Phoenix Suns", "Western", 51,21);
        NBA mavericks = new NBA("Dallas Mavericks", "Western", 42, 30);
        NBA lakers = new NBA("Los Angeles Lakers", "Western", 42,30);
        NBA grizzlies = new NBA("Memphis Grizzlies", "Western", 38,34);
        NBA clippers = new NBA("Los Angeles Clippers", "Western", 47,25);
        NBA blazers = new NBA("Portland Trailblazers", "Western", 42,30);
        NBA rockets = new NBA("Houston Rockets", "Western", 17,55);
        NBA thunder = new NBA("Oklahoma City Thunder", "Western", 22,50);
        NBA kings = new NBA("Sacramento Kings", "Western", 31,41);
        NBA pelicans = new NBA("New Orleans Pelicans", "Western", 31,41);
        NBA warriors = new NBA("Golden State Warriors", "Western", 39,33);
        NBA spurs = new NBA("San Antonio Spurs", "Western", 33,39);
        NBA timberwolves = new NBA("Minnesota Timberwolves", "Western", 23,49);

        nbaLeagueStandings.addTeam(wizards);
        nbaLeagueStandings.addTeam(pelicans);
        nbaLeagueStandings.addTeam(spurs);
        nbaLeagueStandings.addTeam(timberwolves);
        nbaLeagueStandings.addTeam(cavaliers);
        nbaLeagueStandings.addTeam(magic);
        nbaLeagueStandings.addTeam(raptors);
        nbaLeagueStandings.addTeam(hornets);
        nbaLeagueStandings.addTeam(bulls);
        nbaLeagueStandings.addTeam(pacers);
        nbaLeagueStandings.addTeam(pistons);
        nbaLeagueStandings.addTeam(warriors);
        nbaLeagueStandings.addTeam(rockets);
        nbaLeagueStandings.addTeam(kings);
        nbaLeagueStandings.addTeam(thunder);
        nbaLeagueStandings.addTeam(nets);
        nbaLeagueStandings.addTeam(heat);
        nbaLeagueStandings.addTeam(bucks);
        nbaLeagueStandings.addTeam(hawks);
        nbaLeagueStandings.addTeam(sixers);
        nbaLeagueStandings.addTeam(celtics);
        nbaLeagueStandings.addTeam(nuggets);
        nbaLeagueStandings.addTeam(jazz);
        nbaLeagueStandings.addTeam(suns);
        nbaLeagueStandings.addTeam(knicks);
        nbaLeagueStandings.addTeam(grizzlies);
        nbaLeagueStandings.addTeam(clippers);
        nbaLeagueStandings.addTeam(mavericks);
        nbaLeagueStandings.addTeam(lakers);
        nbaLeagueStandings.addTeam(blazers);
//        nbaLeagueStandings.addTeam(nuggets); Error --> Cannot add duplicate teams
        nbaLeagueStandings.rankings();


        Standings<NFL> nflLeagueStandings = new Standings<>("NFL League Standings");
        NFL raiders = new NFL("Las Vegas Raiders", "AFC West", 10,7,0);
        NFL chiefs = new NFL("Kansas City Chiefs", "AFC West", 12,5,0);
        NFL broncos = new NFL("Denver Broncos", "AFC West", 7,10,0);
        NFL chargers = new NFL("Los Angeles Chargers", "AFC West", 9,8,0);

        nflLeagueStandings.addTeam(chargers);
        nflLeagueStandings.addTeam(chiefs);
        nflLeagueStandings.addTeam(broncos);
        nflLeagueStandings.addTeam(raiders);
//        nflLeagueStandings.addTeam(celtics); Error --> Cannot add an NBA object to standings with type parameter NFL
        nflLeagueStandings.rankings();
    }
}
