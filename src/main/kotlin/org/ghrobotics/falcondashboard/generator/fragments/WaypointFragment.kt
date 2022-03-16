package org.ghrobotics.falcondashboard.generator.fragments

import edu.wpi.first.wpilibj.geometry.Rotation2d
import javafx.beans.property.SimpleDoubleProperty
import org.ghrobotics.falcondashboard.createNumericalEntry
import org.ghrobotics.falcondashboard.generator.GeneratorView
import org.ghrobotics.lib.mathematics.twodim.geometry.Pose2d
import org.ghrobotics.lib.mathematics.units.meters
import org.ghrobotics.lib.mathematics.units.inMeters
import tornadofx.*

class WaypointFragment : Fragment() {
    override val root = vbox { }

    val x = SimpleDoubleProperty(0.0)
    val y = SimpleDoubleProperty(0.0)
    val a = SimpleDoubleProperty(0.0)
    //val o = SimpleDoubleProperty(0.0) //Sam J

    init {
        with(root) {
            title = "Add Waypoint"

            paddingAll = 50

            createNumericalEntry("X", x)
            createNumericalEntry("Y", y)
            createNumericalEntry("Angle", a)
            //createNumericalEntry("Orientation", o) //Sam J

            button {
                text = "Add"
                prefWidth = 100.0
                action {
                    GeneratorView.waypoints.add(Pose2d(x.value.meters, y.value.meters, Rotation2d(a.value)))//Rotation2d.fromDegrees(a.value))) 
                    close()
                }
            }
        }
    }
}