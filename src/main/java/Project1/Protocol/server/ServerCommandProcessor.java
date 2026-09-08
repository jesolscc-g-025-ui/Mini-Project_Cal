package Project1.Protocol.server;

import Project1.BasicOperations.Operation;
import Project1.Protocol.server.ServerCommand.QuitCommand;
import Project1.Server.ServerCommands.DumpCommand;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import netscape.javascript.JSObject;
import  com.google.gson.*;

import java.lang.runtime.SwitchBootstraps;

public class ServerCommandProcessor {
    private final Gson gson = new Gson();

    private String SuccessfulResponse(Operation operation) {

        JsonObject response = new JsonObject();
        response.addProperty("result", "OK");

        JsonObject data = new JsonObject();

        data.add("Product :", gson.toJsonTree(operation.execute()));
        response.add("data", data);

        return gson.toJson(response);
    }

    private String ErrorResponse(String errorMessage) {

        JsonObject response = new JsonObject();
        response.addProperty("result", "OK");

        JsonObject data = new JsonObject();
        data.addProperty("Message:", errorMessage);

        response.add("data", data);

        return gson.toJson(response);
    }
    public String ProcessMessage(String message){
        JsonObject request = gson.fromJson(message,JsonObject.class);

        if (!request.has("Command")){
                return ErrorResponse("Missing Command");
        }
        String command = request.get("Command").getAsString().toLowerCase();

        //Server Administration Command
        switch(command){
            case "quit": return new QuitCommand().execute();
//            case "dump": return new DumpCommand().e
            default: return "";
        }
    }
}
