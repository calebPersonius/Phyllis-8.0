package com.company.commands.Auto;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Command;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import static com.company.RobotMap.*;


public class SwitchAuto extends Command {

    public SwitchAuto() {
        super("SwitchAuto");
    }


    @Override
    protected void initialize() {
        driveRight1.setSelectedSensorPosition(0, 0, 0);
        driveLeft1.setSelectedSensorPosition(0, 0, 0);
<<<<<<< HEAD
        driveRight1.setSensorPhase(true);
=======
        driveRight1.setSensorPhase(-1l, true);
>>>>>>> 6343854b2fbb62490fbd3a4f60862b2c9b6be08a
        driveRight1.set(ControlMode.MotionMagic, 0);
        driveLeft1.set(ControlMode.MotionMagic, 0);
        super.initialize();
    }

    protected void execute() {
        driveRight1.set(1000);
        driveLeft1.set(1000);
    }
        protected boolean isFinished () {
        return (true);
        }

        protected void end () {
        }

        protected void interrupted () {
        }
    }