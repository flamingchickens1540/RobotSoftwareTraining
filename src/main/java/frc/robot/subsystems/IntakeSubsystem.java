package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{
    
    //fields 
    CANSparkMax intakeA = new CANSparkMax(Constants.intakeMotorA, CANSparkMax.MotorType.kBrushless);
    CANSparkMax intakeB = new CANSparkMax(Constants.intakeMotorB, CANSparkMax.MotorType.kBrushless);

  public IntakeSubsystem() {
  intakeA.setInverted(false);
  intakeB.setInverted(false);
  }

  public void intakeRun(){
    intakeA.set(Constants.motorSpeedPercentage);
    intakeB.set(Constants.motorSpeedPercentage);
  }

  public void reverseIntakeRun(){
    intakeA.set(-Constants.motorSpeedPercentage);
    intakeB.set(-Constants.motorSpeedPercentage);
  }

  public void stopIntakeRun(){
    intakeA.set(0);
    intakeB.set(0);
  }
  
  }

  /**
   * Example command factory method.
   * 
   * Notes:
   * set percent function that calls motor.setpercent(input value) (this is from the SPARK)
   * other file is the command file
   * subsystem file has the functions, these functions are run in the command file
   * Make it so I can't run the command without that subsystem (pass it as a parameter) 
   * 
   *
   * @return a command
   */
  




