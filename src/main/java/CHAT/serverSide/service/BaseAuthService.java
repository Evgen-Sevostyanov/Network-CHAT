package CHAT.serverSide.service;

import CHAT.serverSide.interfaces.AuthService;

import java.util.ArrayList;
import java.util.List;

public class BaseAuthService implements AuthService {
    private final List<Entry> entryList;

    public BaseAuthService(){
        entryList = new ArrayList<>();
        entryList.add(new Entry("One","one","Player1"));
        entryList.add(new Entry("Two","two","Player2"));
        entryList.add(new Entry("Three","three","Player3"));
        entryList.add(new Entry("Four","four","Player4"));
    }
    @Override
    public void start() {
        System.out.println("AuthService start");
    }

    @Override
    public void stop() {
        System.out.println("AuthService stop");
    }
    @Override
    public String getNickbyLoginandPassword(String login, String password){
        for (Entry e : entryList){
            if (e.login.equalsIgnoreCase(login)&& e.password.equalsIgnoreCase(password)){
                return e.nick;
            }
        }
        return null;
    }

    private static class Entry{
        private final String login;
        private final String password;
        private final String nick;

        public Entry( String login, String password,String nick) {
            this.login = login;
            this.password = password;
            this.nick = nick;
        }
    }
}
