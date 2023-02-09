public class Innings {
    private String teamname;
    private String inningsname;
    private int runs;

    public void setTeamName(String teamname){
        this.teamname = teamname;

    }
    public void setInningsName(String inningsname){
        this.inningsname = inningsname;

    }
    public void setRuns(int runs){
        this.runs = runs;

    }
    public String getTeamName(){ return teamname;}
    public String getInningsName(){return inningsname;}
    public int getRuns(){return runs;}

    public void displayInningDetails(){
        System.out.println("Name: "+ getTeamName());
        System.out.println("Scored: "+ getRuns());

        if(getInningsName().equals("First")){
        System.out.println("Need "+ (runs+1)+" to win");
        }
        else{
            System.out.println("Match Ended.");
        }
    }
}
