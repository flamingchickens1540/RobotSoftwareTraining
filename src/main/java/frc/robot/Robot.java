// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.TimedRobot;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation.
 */


public class Robot extends TimedRobot {
  private XboxController controller = new XboxController(0);
  private final TalonSRX m_leftFrontDrive = new TalonSRX(1);
   private final TalonSRX m_rightFrontDrive = new TalonSRX(4);
   private final TalonSRX m_leftBackDrive = new TalonSRX(2);
   private final TalonSRX m_rightBackDrive = new TalonSRX(3);
   



  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    m_rightFrontDrive.setInverted(false);
    m_rightBackDrive.setInverted(false);
    m_leftFrontDrive.setInverted(true);
    m_leftBackDrive.setInverted(true);
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
/*int lefty = m_stick.getLeftY();
m_leftDrive.set(PercentOutput = lefty);
*/
  double leftY = controller.getLeftY();
  double rightY = controller.getRightY();


  m_leftFrontDrive.set(TalonSRXControlMode.PercentOutput, leftY);
  m_leftBackDrive.set(TalonSRXControlMode.PercentOutput, leftY);


  m_rightFrontDrive.set(TalonSRXControlMode.PercentOutput, rightY);
  m_rightBackDrive.set(TalonSRXControlMode.PercentOutput, rightY);




  //com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput =(0)


  }
}
