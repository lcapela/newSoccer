public class Team {
    private String teamName;
    Player[] teamPlayers;

    public Team(String teamName, Player[] teamPlayers) {
        this.teamName = teamName;
        this.teamPlayers = teamPlayers;
    }

    public Player[] getTeamPlayers() {

        return teamPlayers;
    }
    public void showTeam(){
        System.out.println(teamName);
        System.out.println("");

        for(int in = 0; in < teamPlayers.length; in++){
            teamPlayers[in].getPlayerName();
        }
    }
}
