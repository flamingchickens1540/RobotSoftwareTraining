package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Intake extends SubsystemBase
{
    private final CANSparkMax intake_motor1 = new CANSparkMax(14, MotorType.kBrushless);
    private final CANSparkMax intake_motor2 = new CANSparkMax(15, MotorType.kBrushless);

    public Intake()
    {
        intake_motor1.setInverted(true);
        intake_motor2.setInverted(true);
        intake_motor2.follow(intake_motor1, true);
    }

    public void moveIntake(double intakespeed)
    {
        intake_motor1.set(intakespeed);
    }   
}