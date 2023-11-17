package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pivot extends SubsystemBase{
TalonFX pivot1 = new TalonFX(0);
TalonFX pivot2 = new TalonFX(0);

public void pivot() {
pivot1.set(ControlMode.PercentOutput, 0.5);
pivot2.set(ControlMode.PercentOutput, 0.5);
}
}