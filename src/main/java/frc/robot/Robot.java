// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.TimedRobot;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation.
 */
import edu.wpi.first.wpilibj.XboxController;
public class Robot extends TimedRobot {
  XboxController controller = new XboxController(0);
  TalonSRX frontLeft = new TalonSRX(1);
  TalonSRX backLeft = new TalonSRX(2);
  TalonSRX frontRight = new TalonSRX(4);
  TalonSRX backRight = new TalonSRX(3);

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    // frontLeft.setNeutralMode(NeutralMode.Brake);
    // frontRight.setNeutralMode(NeutralMode.Brake);
    // backLeft.setNeutralMode(NeutralMode.Brake);
    // backRight.setNeutralMode(NeutralMode.Brake);

    backLeft.setNeutralMode(NeutralMode.Coast);

    // frontLeft.setInverted(true);
    // backLeft.setInverted(true);

    backLeft.follow(frontLeft);
    backRight.follow(frontRight); 
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   */
  @Override
  public void robotPeriodic() {}

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    int deadZoneLeft = 1;
    int deadZoneRight = 1;
    if (Math.abs(controller.getLeftY()) <= 0.1) {
      deadZoneLeft = 0;
    }
    if (Math.abs(controller.getRightY()) <= 0.1) {
      deadZoneRight = 0;
    }
    frontLeft.set(ControlMode.PercentOutput, controller.getLeftY() * 0.1 * deadZoneLeft);
    frontRight.set(ControlMode.PercentOutput, controller.getRightY() * 0.1 * deadZoneRight);
  }
}
