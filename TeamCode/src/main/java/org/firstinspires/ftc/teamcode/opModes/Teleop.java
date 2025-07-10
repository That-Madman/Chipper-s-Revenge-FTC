package org.firstinspires.ftc.teamcode.opModes;

import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.Arm;
import org.firstinspires.ftc.teamcode.subsystems.trailblazer.drivebase.Drive;

import java.util.List;

@TeleOp
public class Teleop extends LinearOpMode {
    Drive drive;
    Arm arm;

    List<LynxModule> allHubs;

    @Override
    public void runOpMode() throws InterruptedException {
        allHubs = hardwareMap.getAll(LynxModule.class);

        for (LynxModule hub : allHubs) {
            hub.setBulkCachingMode(LynxModule.BulkCachingMode.AUTO);
        }

        drive = new Drive(hardwareMap);
        arm = new Arm(hardwareMap);

        waitForStart();

        while(opModeIsActive() && !isStopRequested()) {
            drive.mecanumDrive(gamepad1);
            arm.moveArmSimple(gamepad2);
        }
    }
}
