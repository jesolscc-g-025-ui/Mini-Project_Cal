package Project1.Server.ServerCommands;



public class QuitCommand implements Command {



    public QuitCommand(){

    }

    public String name(){
        return "quit";
    }
    public String execute(){
        return "Exiting Calculator...";
    }
    public String display(){
        return "";
    }
}
