package frc.robot.commands;

    import frc.robot.subsystems.Intake;
    import edu.wpi.first.wpilibj2.command.CommandBase;

    public class IntakeCommand extends CommandBase
    {
        private Intake intake;
        private double intakespeed;

        public IntakeCommand(Intake intake, double intakespeed)
        {
            this.intake = intake;
            this.intakespeed = intakespeed;
            addRequirements(intake);
        }

        @Override
        public void initialize()
        {
            this.intake.moveIntake(intakespeed);
        }

        @Override
        public void execute(){}

        @Override
        public void end(boolean interrupted)
        {
            this.intake.moveIntake(0);
        }
    }