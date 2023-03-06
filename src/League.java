public class League {
    public static void main(String[] args) {
        Player p1 = new Player("George Eliot");
        Player p2 = new Player("Graham Greene");
        Player p3 = new Player("Geoffrey Chaucer");
        Player[] team1Array = {p1,p2,p3};
        Player p4 = new Player("Robert Service");
        Player p5 = new Player("Robbie Burns");
        Player p6 = new Player("Rafael Sabatini");
        Player[] team2Array ={p4,p5,p6};


        Team team1 = new Team("The Greens",team1Array);
        Team team2 = new Team("The Reds",team2Array);
        //team1.getTeamPlayers()[0].setPlayerName("Robert Service");

        team1.showTeam();
        team2.showTeam();


    }
}