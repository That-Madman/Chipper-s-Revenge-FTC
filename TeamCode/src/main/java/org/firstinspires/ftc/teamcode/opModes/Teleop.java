package org.firstinspires.ftc.teamcode.opModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.trailblazer.drivebase.Drive;

@TeleOp
public class Teleop extends LinearOpMode {
    Drive drive;

    @Override
    public void runOpMode() throws InterruptedException {
        drive = new Drive(hardwareMap);

        waitForStart();

        while(opModeIsActive() && !isStopRequested()) {
            drive.mecanumDrive(gamepad1);
        }
    }
}
