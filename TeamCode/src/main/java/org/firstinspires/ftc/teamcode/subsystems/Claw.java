package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    Servo rot;
    Servo open;

    public Claw (HardwareMap map) {
        rot = map.get(Servo.class, "rot");
        open = map.get(Servo.class, "open");
    }
}
