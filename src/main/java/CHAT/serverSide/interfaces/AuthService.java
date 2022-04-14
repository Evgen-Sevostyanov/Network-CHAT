package CHAT.serverSide.interfaces;

public interface AuthService {
    void start();
    String getNickbyLoginandPassword(String login, String password);
    void stop();
}
