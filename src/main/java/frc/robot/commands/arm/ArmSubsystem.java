// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.arm;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.StatorCurrentLimitConfiguration;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmSubsystem extends SubsystemBase{
   //fields 
   private final TalonFX armMotorLeft = new TalonFX(Constants.armConstants.armMotorLeft);
   private final TalonFX armMotorRight = new TalonFX(Constants.armConstants.armMotorRight);

    /** Creates a new ExampleSubsystem. */
  public ArmSubsystem() {
    armMotorLeft.setInverted(false);
    armMotorRight.setInverted(true);
    armMotorLeft.follow(armMotorRight);
    armMotorRight.configForwardSoftLimitThreshold(Constants.armConstants.forwardSoftLimit);
    armMotorRight.configForwardSoftLimitEnable(true);
    armMotorRight.configReverseSoftLimitThreshold(Constants.armConstants.reverseSoftLimit);
    armMotorRight.configReverseSoftLimitEnable(true);
    armMotorLeft.configStatorCurrentLimit(new StatorCurrentLimitConfiguration(true, Constants.armConstants.currentLimit, Constants.armConstants.currentLimit, 0));
    armMotorRight.configStatorCurrentLimit(new StatorCurrentLimitConfiguration(true, Constants.armConstants.currentLimit, Constants.armConstants.currentLimit, 0));
  }

  public void pivotArm(double percentPivotAmount){
    armMotorRight.set(ControlMode.PercentOutput, percentPivotAmount);
  }
}
