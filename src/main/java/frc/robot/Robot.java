// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation.
 */
public class Robot extends TimedRobot {
  XboxController XboxController1 = new XboxController(0);
  TalonSRX myTalonTopRight = new TalonSRX(4);
  TalonSRX myTalonTopLeft = new TalonSRX(1);
  TalonSRX myTalonBottomRight = new TalonSRX(3);
  TalonSRX myTalonBottomLeft = new TalonSRX(2);

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    myTalonTopLeft.setInverted(true);
    myTalonBottomLeft.setInverted(true);
    myTalonBottomRight.follow(myTalonTopRight);
    myTalonBottomLeft.follow(myTalonTopLeft);
    
     
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
    myTalonTopLeft.set(ControlMode.PercentOutput, XboxController1.getLeftY() * 0.5);
    myTalonBottomLeft.set(ControlMode.PercentOutput, XboxController1.getLeftY() * 0.5);
    myTalonTopRight.set(ControlMode.PercentOutput, XboxController1.getRightY() * 0.5);
    myTalonBottomRight.set(ControlMode.PercentOutput, XboxController1.getRightY() * 0.5);
    
    
    
  }
}
