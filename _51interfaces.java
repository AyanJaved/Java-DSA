public class _51interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Moves : right,left,up,down");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Moves : forward , backward");
    }
}