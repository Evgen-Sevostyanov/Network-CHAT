package CHAT;

import CHAT.serverSide.service.MyServer;
import com.sun.jdi.connect.LaunchingConnector;

public class MainServerApp {
    public static void main(String[] args) {
        new Thread(() -> new MyServer()).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LaunchingConnector Application;
        new Thread(() -> Application.launch(CHAT.clientSide.two.Client.class, args)).start();

    }
}