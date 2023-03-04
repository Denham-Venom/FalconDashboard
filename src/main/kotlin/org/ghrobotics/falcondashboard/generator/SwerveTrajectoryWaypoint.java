package org.ghrobotics.falcondashboard.generator;

import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;

class SwerveTrajectoryWaypoint extends Pose2d {
    public final Rotation2d orientation;
    public SwerveTrajectoryWaypoint(double x, double y, Rotation2d orientation, Rotation2d heading) {
        super(x, y, heading);
        this.orientation = orientation;
    }
}