// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  public Intake() {}

 

 CANSparkMax intake1 = new CANSparkMax(15, MotorType.kBrushless);
 CANSparkMax intake2 = new CANSparkMax(14, MotorType.kBrushless);

  public void setSpeed(double speed) {
    intake1.set(speed);
    intake2.set(speed);
  }

 
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
