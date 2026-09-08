package Project1.Protocol.server.ServerCommand;

public class QuitCommand implements Command{

    private final String name;

    public QuitCommand(){
        this.name = "quit";
    }

    @Override
    public String name() {
        return name;
    }
    @Override

    public String display(){
        return "Quit - Disconnecting All Clients  From Server.";
    }

    @Override

    public String execute(){
        return "";
    }
}
