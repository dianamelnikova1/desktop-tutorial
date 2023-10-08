package ass2;

public class DeveloperDecoretor implements Developer{
    Developer developer;
    public DeveloperDecoretor(Developer developer){
        this.developer = developer;

    }
    public String makeJob(){
        return developer.makeJob();
    }
}
