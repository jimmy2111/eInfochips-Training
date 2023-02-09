public class Company {
    private String name;
    private String employees;
    private String teamlead;

    public void setName(String newName){
        this.name = newName;

    }
    public String setEmployees(String Employees){
        this.employees = Employees;
        return employees;

    }
    public void setTeamLead(String TeamLead){
        this.teamlead=TeamLead;

    }

    public String getName(){ return name;}
    public String getEmployees(){return employees;}
    public String getTeamLead(){return teamlead;}
}
