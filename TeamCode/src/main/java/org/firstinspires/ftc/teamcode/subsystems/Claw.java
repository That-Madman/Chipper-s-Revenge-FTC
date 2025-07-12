package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    Servo rot;
    Servo open;

    boolean aHeld;
    boolean bHeld;

    boolean rotState;
    boolean openState;

    public Claw (HardwareMap map) {
        rot = map.get(Servo.class, "rot");
        open = map.get(Servo.class, "open");
    }

    public void useClaw (Gamepad gamepad1, Gamepad gamepad2) {
        if (!aHeld && gamepad2.b) rotState = ! rotState;
        if (!bHeld && gamepad1.right_bumper) openState = ! openState;

        rot.setPosition(rotState ? 1 : 0);
        open.setPosition(openState ? 1 : 0);

        aHeld = gamepad2.b;
        bHeld = gamepad1.right_bumper;
    }
}
