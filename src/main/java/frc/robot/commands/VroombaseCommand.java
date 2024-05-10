package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Vroombase;

public class VroombaseCommand extends Command{

    public DoubleSupplier left;
    public DoubleSupplier right;
    public Vroombase vroombase;

    public void VroombaseCommand(Vroombase vroombase, DoubleSupplier left, DoubleSupplier right) {
        this.vroombase = vroombase;
        this.left = left;
        this.right = right;


    }
    
}
