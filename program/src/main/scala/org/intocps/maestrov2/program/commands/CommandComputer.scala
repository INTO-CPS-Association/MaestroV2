package org.intocps.maestrov2.program.commands

import org.intocps.maestrov2.data.FMUWithMD
import org.intocps.orchestration.coe.modeldefinition.ModelDescription
import org.intocps.orchestration.coe.modeldefinition.ModelDescription.{Initial, Types, Variability}
import scala.collection.JavaConverters._

object CommandComputer {

  /*
  Calculates commands only using fmu and instance names
   */
def instanceCommands[A,B](fmusToInstances: Set[(A, B)], fmiF: (A, B) => FMICommand) :MaestroV2Set = {
  MaestroV2Set(fmusToInstances.map{case (k,v) => fmiF(k,v)})
}

  def instanceCommandsMap[A,B](fmusToInstances: Map[A, B], fmiF: (A, B) => FMICommand) :MaestroV2Set = {
    MaestroV2Set(fmusToInstances.map{case (k,v) => fmiF(k,v)}.toSet)
  }



}
