package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pivot extends SubsystemBase{

TalonFX pivot1 = new TalonFX(10);
TalonFX pivot2 = new TalonFX(11);
public Pivot () {
    pivot2.follow(pivot1);
    pivot1.setInverted(false);
    pivot2.setInverted(true);
}

public void pivot(double speed) {
pivot1.set(ControlMode.PercentOutput, speed);
}
}