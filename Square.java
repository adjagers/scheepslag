
public class Square {

    private Ship ship = null;

  public  Square () {

    }

    getContent () {
        char squareContent = '?';

        if (ship ==  null) {
            squareContent = '.';
        } else {
            squareContent = ship.getChar();
        }


    }

    
}
