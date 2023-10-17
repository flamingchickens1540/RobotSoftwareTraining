package frc.robot.commands.Intake;

import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.Type;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private final CANSparkMax rightMotor = new CANSparkMax(14,MotorType.kBrushless);
    private final CANSparkMax leftMotor = new CANSparkMax(15,MotorType.kBrushless);


    public IntakeSubsystem() {
        rightMotor.restoreFactoryDefaults();
        leftMotor.restoreFactoryDefaults();
        
        leftMotor.follow(rightMotor,true);
        rightMotor.setInverted(false);

        rightMotor.set(0);
    }

    public void grabberSpeed(double speed) {
        rightMotor.set(speed);
    }
}
