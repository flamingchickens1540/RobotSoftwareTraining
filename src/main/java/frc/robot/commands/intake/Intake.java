
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.intake;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class Intake extends SubsystemBase {
  private final CANSparkMax motor1 = new CANSparkMax(IntakeConstants.intakeMotor1_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  private final CANSparkMax motor2 = new CANSparkMax(IntakeConstants.intakeMotor2_ID, CANSparkMaxLowLevel.MotorType.kBrushless);
  



  public Intake() {

    motor1.setIdleMode(CANSparkMax.IdleMode.kBrake);
    motor2.setIdleMode(CANSparkMax.IdleMode.kBrake);

    motor2.follow(motor1, true);

    

    motor1.set(0);
  }

  public void setSpeed(double speed) {
    motor1.set(speed);
  }

  public double getSpeed() {

    return motor1.get();
  }


  public void stop() {
    motor1.set(0);
  }
}
