package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    private TalonFX motor3 = new TalonFX(10);
    private TalonFX motor4 = new TalonFX(11);

    
    



    public Arm() {
        motor4.setInverted(true);
        motor3.setInverted(false);
        motor4.follow(motor3);


    }



    public void moveArm(double armSpeed){
        motor3.set(TalonFXControlMode.PercentOutput, armSpeed);
    }




}
