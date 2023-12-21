package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase
{
    public TalonFX intake_motor1 = new TalonFX(0, null);
    public TalonFX intake_motor2 = new TalonFX(0, null);

    public Intake()
    {
        intake_motor2.follow(intake_motor1);
        intake_motor1.setInverted(false);
        intake_motor2.setInverted(true);
    }

    public void moveIntake(double intakespeed)
    {
        intake_motor1.set(TalonFXControlMode.PercentOutput, intakespeed);
    }   
}