package frc.team3100.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;


public class RobotMap {

    //     C O N T R O L L E R S
    private static int driveController = 1;
    private static int techController = 2;

    //     P W M
    private static int driveLeftChannel = 1;
    private static int driveRightChannel = 2;
    private static int elevatorChannel = 3;
    private static int clawChannel = 4;
    private static int platformChannel = 5;

    //     P C M
    private static int clawGrabChannel = 0;
    private static int platformDropChannel = 1;
    private static int UPP2Channel = 2;
    private static int UPP3Channel = 3;
    private static int UPP4Channel = 4;
    private static int UPP5Channel = 5;
    private static int UPP6Channel = 6;
    private static int UPP7Channel = 7;

    //     D I O
    private static int driveLeftCounterChannel = 0;
    private static int driveRightCounterChannel = 1;
    private static int elevatorCounterChannel = 2;
    private static int clawButtonChannel = 3;



    //    Initialize Xbox controllers
    public static XBoxDrive driveControls = new XBoxDrive(driveController);
    public static XBoxTech techControls = new XBoxTech(techController);

    //    Initialize speed controllers
    public static SpeedController leftMotor = new Spark(driveLeftChannel);
    public static SpeedController rightMotor = new Spark(driveRightChannel);
    public static SpeedController elevatorMotor = new Spark(elevatorChannel);
    public static SpeedController clawMotors = new Spark(clawChannel);
    public static SpeedController platformMotor = new Spark(platformChannel);

    //    Initialize pneumatic controllers
    public static Solenoid clawGrabber = new Solenoid(clawGrabChannel);
    public static Solenoid platformDeploy = new Solenoid(platformDropChannel);
    public static Solenoid UPP2 = new Solenoid(UPP2Channel);
    public static Solenoid UPP3 = new Solenoid(UPP3Channel);
    public static Solenoid UPP4 = new Solenoid(UPP4Channel);
    public static Solenoid UPP5 = new Solenoid(UPP5Channel);
    public static Solenoid UPP6 = new Solenoid(UPP6Channel);
    public static Solenoid UPP7 = new Solenoid(UPP7Channel);



    //    Initialize sensors
    public static Gyro gyro = new ADXRS450_Gyro();
    public static Counter elevatorCounter = new Counter(elevatorCounterChannel);
    public static Counter leftDriveCounter = new Counter(driveLeftCounterChannel);
    public static Counter rightDriveCounter = new Counter(driveRightCounterChannel);
    public static DigitalInput clawButton = new DigitalInput(clawButtonChannel);





}
