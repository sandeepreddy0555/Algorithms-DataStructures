import java.util.HashMap;
import java.util.Map;

public class RobotPosition {


  static Direction initialDirection = Direction.EAST;

  static Map<Integer, Direction> map = new HashMap<>();

  static{
    for (Direction direction : Direction.values()) {
      map.put(direction.getDirValue(), direction);
    }
  }

  static enum Direction{
    EAST(0), NORTH(1), WEST(2), SOUTH(3);

    int dirValue;


    Direction(int dirValue){
      this.dirValue = dirValue;
    }

    public int getDirValue(){
      return this.dirValue;
    }

  }


  static class Coordiantes{

    int x=0, y=0;

    Coordiantes(int x, int y){
      this.x = x;
      this.y = y;
    }


  }





  public static boolean isOriginalPosition(String str){

    Coordiantes coordiantes = new Coordiantes(0,0);
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      initialDirection = determineDirection(ch);
      if(ch == 'F'){
        //(0,0) (1,0), (1,1), (0,1), (0,0)
        switch (initialDirection){
          case EAST:
            coordiantes.x = coordiantes.x+1;
            break;
          case WEST:
            coordiantes.x = coordiantes.x-1;
            break;
          case NORTH:
            coordiantes.y = coordiantes.y+1;
            break;
          case SOUTH:
            coordiantes.y = coordiantes.y-1;
            break;
        }

      }

    }

    if (coordiantes.x == 0 && coordiantes.y == 0){
      return true;
    }

   return false;
  }

  static Direction determineDirection(char ch){
    switch(ch){
      case 'L':
        initialDirection = map.get((initialDirection.getDirValue()+1)%4);
        break;

      case 'R':
        initialDirection = map.get((initialDirection.getDirValue()+3)%4);
        break;

      default:
        break;

    }

    return initialDirection;



  }


  public static void main(String args[]){
      String str = "FLFLFLF";
      System.out.println(isOriginalPosition(str));
  }
}
