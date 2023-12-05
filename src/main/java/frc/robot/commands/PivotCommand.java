package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Pivot;

public class PivotCommand extends CommandBase {
    private Pivot pivotSubsystem;
    private CommandXboxController controller;

    public PivotCommand(Pivot pivotSubsytem, CommandXboxController m_driverController) {
        this.pivotSubsystem = pivotSubsytem;
        this.controller = m_driverController;
        addRequirements(pivotSubsytem);
    }
    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        pivotSubsystem.pivot(controller.getRightY() * 0.1);
    }
    @Override
    public void end(boolean interrupted) {
        pivotSubsystem.pivot(0);
    }
}
