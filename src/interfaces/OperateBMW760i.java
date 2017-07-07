package interfaces;

/**
 * Created by Bext on 29/12/2016.
 */
class OperateBMW760i implements OperateCar {
    //int turn( Direction direction,...
    //Error:(8, 9) java: turn(interfaces.Direction,double,double,double) in interfaces.OperateBMW760i cannot implement turn(interfaces.Direction,double,double,double) in interfaces.OperateCar
    //attempting to assign weaker access privileges; was public
    public int turn( Direction direction,
              double raduis,
              double startSpeed,
              double endSpeed){
        return 0;
    };

    public int changeLanes(Direction direction,
                    double startSpeed,
                    double endSpeed){
        return 0;
    };
    public int SignalTurn(Direction direction,
                   Boolean signalOn){
        return 0;
    };

    public int getRadarFront(double DistanceToCar,
                      double speedToCar){
        return 0;
    };
    public int getRadarRear(double DistanceToCar,
                     double SpeedToCar){
        return 0;
    };

    public static void main(String... args){
        //
    }
}
