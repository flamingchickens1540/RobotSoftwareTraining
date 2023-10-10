package frc.robot.commands.PivotSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;

public class PivotCommand extends CommandBase{
    public final PivotSubsystem m_PivotSubsystem;
    public final CommandXboxController m_controller;
    private double input;

    private boolean isSufficientInput;

    public PivotCommand(PivotSubsystem subsystem, CommandXboxController controller) {
        m_PivotSubsystem = subsystem;
        m_controller = controller;
        addRequirements(m_PivotSubsystem);
    }

    @Override
    public void execute() {
        input = m_controller.getRightY();
        isSufficientInput = Math.abs(input) >= Constants.DEADZONE;
        input = !isSufficientInput ? 0 : input;

        m_PivotSubsystem.runMotors(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
