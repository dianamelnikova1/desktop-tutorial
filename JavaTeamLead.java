package ass2;

public class JavaTeamLead extends DeveloperDecoretor{
    public JavaTeamLead(Developer developer){
        super(developer);
    }
    public String sendWeekReport(){
        return "Send week report to customer";
    }
    public String makeJob(){
        return super.makeJob() + sendWeekReport();
    }
}
