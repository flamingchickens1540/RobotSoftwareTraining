

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.arm;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatorCurrentLimitConfiguration;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;

public class Arm extends SubsystemBase {
  private final TalonFX pivotMotor1 = new TalonFX(11);
  private final TalonFX pivotMotor2 = new TalonFX(10);


  /** Creates a new Arm subsystem. */
  public Arm() {
    pivotMotor1.configStatorCurrentLimit(new StatorCurrentLimitConfiguration(true, 60, 60, 0));
    pivotMotor2.configStatorCurrentLimit(new StatorCurrentLimitConfiguration(true, 60, 60, 0));
    pivotMotor2.setInverted(true);
    pivotMotor2.follow(pivotMotor1);

    pivotMotor1.setNeutralMode(NeutralMode.Brake);
    pivotMotor2.setNeutralMode(NeutralMode.Brake);
    pivotMotor1.setInverted(false);
    pivotMotor1.configForwardSoftLimitThreshold(ArmConstants.pivotForwardLimit);
    pivotMotor1.configForwardSoftLimitEnable(true);
    pivotMotor1.configReverseSoftLimitThreshold(ArmConstants.pivotReverseLimit);
    pivotMotor1.configReverseSoftLimitEnable(true);
  }



  public void setSpeed(double speed) {
    pivotMotor1.set(ControlMode.PercentOutput, speed);
  }







}
