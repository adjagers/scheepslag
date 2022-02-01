
import java.util.HashMap;
import java.util.Random;


public class Field {
    

    

    public Field () {

    }


    Ship ship = new Ship("Aircraft carrier", 5 , 'B');



    // private Ship [] ships;

    ships = new Ship[5];




    ships[0] = new Ship("Aircraft carrier", 5);
    ships[1] = new Ship("Battleship", 4);
    ships[2] = new Ship("Aircraft carrier", 5);
    ships[3] = new Ship("Aircraft carrier", 5);
    ships[4] = new Ship("Aircraft carrier", 5);



    enum Shiptypes{
        AircraftCarrier, Battleship, Submarine, Destroyer, PatrolBoat
    }


public void generateField() {


    Shiptypes shiptype = Shiptypes.AircraftCarrier;

 




    System.out.println(ship.getType());
    System.out.println(" Aircraft carrier Length: " + ship.getLength());

    System.out.println(" Aircraft carrier Length: " + ship.getShipSymbol());

    // Just the field surrounding
    // Horizontal and vertical rows
    String ch = "a b c d e f g h i j";
    // char[] intArray;
    // intArray = new char[10];


    final int[] ints = new Random().ints(1, 10).distinct().limit(6).toArray();


    System.out.println("");

    System.out.println(ch);

    char[][] battleField = new char [11][11];


    HashMap<Character, Integer> testField = new HashMap<Character, Integer>();

    testField.put('A', 1);






  
    for (int row = 1; row < battleField.length ; row++) {

        System.out.print("\n");
        System.out.print(row + " ");

        for (int col = 1; col < battleField.length ; col++) {
            


                int r1 = ints[0];
        
                // System.out.print(r1);
            

            if(battleField[row][col] == battleField[r1][8] && battleField[row][col] < battleField[r1][8-2] ) {
                battleField[row][col] = ship.shipSymbol; 
            }

            if(battleField[row][col] == battleField[r1][6] && battleField[row][col] < battleField[r1][6-2] ) {
                battleField[row][col] = 'B'; 
            }

            if(battleField[row][col] == battleField[r1][4] && battleField[row][col] < battleField[r1][4-2] ) {
                battleField[row][col] = 'B'; 
            }
            

            
            else {
                battleField[row][col] = '*';
            }
                System.out.print(battleField[row][col] + " ");
            } 
        }
    }
}



