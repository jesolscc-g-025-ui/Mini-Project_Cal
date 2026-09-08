package Project1.Server.ServerCommands;

public class DumpCommand implements Command{

    public String name(){
        return "dump";
    }

    public String execute(){
        return "displaying all";
    }

    public String display(){
        return "";
    }
}
