/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.company;
import com.company.subsystems.DriveTrainSubsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import static java.lang.Math.PI;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
    public static int
            Drive_Left1 = 11,
            Drive_Left2 = 12,
            Drive_Right1 = 2,
            Drive_Right2 = 14,
            Flipper_Right = 1,
            Flipper_Left = 3,
            Elevator = 6,
            IntakeRight = 0,
            IntakeLeft = 1,
            DiddlerRight = 3,
            DiddlerLeft = 2;

    public static Solenoid solenoid1 = new Solenoid(0);
    public static Solenoid solenoid2 = new Solenoid(1);
    public static Solenoid solenoid3 = new Solenoid(2);
    public static Solenoid solenoid4 = new Solenoid(3);
    public static Solenoid solenoid5 = new Solenoid(4);
    public static Solenoid solenoid6 = new Solenoid(5);

    public static Compressor compressor1 = new Compressor(7);

    public static WPI_TalonSRX driveLeft1 = new WPI_TalonSRX(Drive_Left1);
    public static WPI_TalonSRX driveLeft2 = new WPI_TalonSRX(Drive_Left2);
    public static WPI_TalonSRX driveRight1 = new WPI_TalonSRX(Drive_Right1);
    public static WPI_TalonSRX driveRight2 = new WPI_TalonSRX(Drive_Right2);
    public static WPI_TalonSRX flipperRight = new WPI_TalonSRX(Flipper_Right);
    public static WPI_TalonSRX flipperLeft = new WPI_TalonSRX(Flipper_Left);
    public static WPI_TalonSRX elevator = new WPI_TalonSRX(Elevator);

    public static Spark intakeRight = new Spark(IntakeRight);
    public static Spark intakeLeft = new Spark(IntakeLeft);
    public static Spark diddlerRight = new Spark(DiddlerRight);
    public static Spark diddlerLeft = new Spark(DiddlerLeft);

    public static DriveTrainSubsystem MainDrive = new DriveTrainSubsystem();
    public static DriveTrainSubsystem FlipperDrive = new DriveTrainSubsystem();
    public static DriveTrainSubsystem ElevatorDrive = new DriveTrainSubsystem();
    public static DriveTrainSubsystem AutoDrive = new DriveTrainSubsystem();


    public static double TickPerRev;

    public void Distance() {
        String object = SmartDashboard.getString("Object", "None");
        double inch = 0;
        if (object.equals("None")) {
            inch = 0;
        } else if (object.equals("Switch")) {
            inch = PI * 6;
        }
        double inchPerRot = PI * 6;
        double rev = inch / inchPerRot;
        double tick = 1024;
        double tickPerRev = tick / rev;
        TickPerRev = tickPerRev;
    }
}