package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 *
 * @author Ryan Bradford
 */
public class AutonomousCommand extends CommandGroup {

    public AutonomousCommand() {
        addSequential(new WindUp(),4.2);
        addSequential(new GoForward(1),2);
        addSequential(new LiftArm(1),1);
        addSequential(new GetHot());
        addSequential(new UnWind(),0.25); 
        
    }
   // protected void execute() {
   //      new WindUp();
   //      if(clock.get() > 4.5) {
   //          //if(shooter.getHot() == true) {
   //      addSequential(new UnWind());
   //      addSequential(new GoForward(1), 1);
             //}
         }
            
