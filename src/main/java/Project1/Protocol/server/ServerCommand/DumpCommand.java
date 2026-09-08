package Project1.Protocol.server.ServerCommand;


public class DumpCommand implements Command {

    private final String name;

    public DumpCommand(){
        this.name = "dump";
    }
    @Override
    public String name(){
        return name;}

    @Override

    public String display(){
        return name() + ": Shows all the current Fighters in the arena";
    }

    @Override
    public String execute(){
        return "";
    }
}
