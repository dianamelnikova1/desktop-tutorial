package ass2;

public class SeniorJavaDeveloper extends DeveloperDecoretor{
    public SeniorJavaDeveloper(Developer developer){
        super(developer);
    }

    public String makeCodeReview(){
        return "Make code review";

    }
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
