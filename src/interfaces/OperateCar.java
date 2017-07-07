package interfaces;

/**
 * Created by Bext on 29/12/2016.
 */


interface Direction{};

//public interface interfaces.OperateCar{  // is public, should be declared in a file named interfaces.OperateCar.java
public interface OperateCar{
    //constant declaration if any

    // method signatures

    //an enum with values RIGHT,LEFT
    int turn( Direction direction,
              double raduis,
              double startSpeed,
              double endSpeed);
    int changeLanes(Direction direction,
                    double startSpeed,
                    double endSpeed);
    int SignalTurn(Direction direction,
                   Boolean signalOn);
    int getRadarFront(double DistanceToCar,
                      double speedToCar);
    int getRadarRear(double DistanceToCar,
                     double SpeedToCar);
    //...
    //more method signatures
}

