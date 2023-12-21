package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Arm extends SubsystemBase
{
    public TalonFX arm_motor1 = new TalonFX(0, null);
    public TalonFX arm_motor2 = new TalonFX(0, null);
    
    public Arm()
    {
        arm_motor2.follow(arm_motor1);
        arm_motor1.setInverted(false);
        arm_motor2.setInverted(true);
    }

    public void moveArm(double armspeed)
    {
        arm_motor1.set(TalonFXControlMode.PercentOutput, armspeed);
    }
}