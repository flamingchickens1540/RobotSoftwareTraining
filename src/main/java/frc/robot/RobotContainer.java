// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.arm.ArmCommand;
import frc.robot.commands.arm.ArmSubsystem;
import frc.robot.commands.intake.IntakeCommand;
import frc.robot.commands.intake.IntakeSubsystem;
import frc.robot.commands.intake.ReverseIntakeCommand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final IntakeSubsystem m_IntakeSubsystem = new IntakeSubsystem();
  private final ArmSubsystem m_ArmSubsystem = new ArmSubsystem();

  private final CommandXboxController m_copilotController = new CommandXboxController(0);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
    m_ArmSubsystem.setDefaultCommand(new ArmCommand(m_ArmSubsystem, m_copilotController));
  }


  private void configureBindings() {
    m_copilotController.a().whileTrue(new IntakeCommand(m_IntakeSubsystem));
    m_copilotController.b().whileTrue(new ReverseIntakeCommand((m_IntakeSubsystem)));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
