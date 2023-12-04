package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Pivot;

public class PivotCommand extends CommandBase {
    private Pivot pivotSubsystem;

    public PivotCommand(Pivot pivotSubsytem) {
        this.pivotSubsystem = pivotSubsytem;
    }

    CommandXboxController controller;

    public void initialize() {
    }

    public void execute() {
        pivotSubsystem.pivot(controller.getRightY());
    }
}
