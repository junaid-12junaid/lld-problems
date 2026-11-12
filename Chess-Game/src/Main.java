import Controller.ConcreteGame.ChessGame;
import UtilityClasses.Player;

public class Main {
    public static void main(){
        Player player1=new Player("Player1",true);
        Player player2=new Player("Player2",false);

        ChessGame chessGame=new ChessGame(player1,player2);
        chessGame.play();
    }
}
