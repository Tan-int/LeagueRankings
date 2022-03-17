public abstract class Team implements Comparable<Team>{
    private final String name;
    private final Record record;
    private final String conference;
    private final int rank;


    //Constructor
    public Team(String name, String conference, int wins, int losses, int ties) {
        this.name = name;
        this.conference = conference;
        this.record = new Record(wins, losses, ties);
        this.rank = record.wins - (record.ties + record.losses);
    }

    @Override
    public int compareTo(Team otherTeam) {
        if(this.rank > otherTeam.rank) {
            return -1;
        } else if (this.rank < otherTeam.rank) {
            return 1;
        }
        return 0;
    }

    //CLASS METHODS

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return name + record;
    }

    //GETTERS

    public String getName() {
        return name;
    }

    public String getConference() {
        return conference;
    }

    //INNER CLASS RECORD
    private static class Record {
        int wins;
        int losses;
        int ties;

        //CONSTRUCTOR
        public Record(int wins, int losses, int ties) {
            this.wins = wins;
            this.losses = losses;
            this.ties = ties;
        }

        @Override
        public String toString() {
            return String.format("%10d", wins) + " " + losses + " " + ties;
        }

    }
}