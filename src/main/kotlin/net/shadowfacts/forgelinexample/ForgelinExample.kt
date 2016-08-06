package net.shadowfacts.forgelinexample

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

/**
 * @author shadowfacts
 */
@Mod(modid = "ForgelinExample", modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
object ForgelinExample {

	@Mod.EventHandler
	fun preInit(event: FMLPreInitializationEvent) {
		println("Hello from Kotlin!")
	}

}