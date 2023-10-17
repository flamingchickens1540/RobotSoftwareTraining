package frc.robot.commands.Pivot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.Type;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class PivotSubsystem extends SubsystemBase {
    private final TalonFX pivot1 = new TalonFX(10);
    private final TalonFX pivot2 = new TalonFX(11);
    


    public PivotSubsystem() {
        pivot2.follow(pivot1);
        pivot2.setInverted(true);
        pivot1.setInverted(false);
    }

    public void motorSpeed(double speed) {
        pivot1.set(ControlMode.PercentOutput, speed);
    }
}
