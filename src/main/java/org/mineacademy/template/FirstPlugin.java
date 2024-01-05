package org.mineacademy.template;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class FirstPlugin extends SimplePlugin {

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */

	/**
	 * This is called when the plugin starts. You can use this to load
	 * your configuration, register commands, register listeners and so on.
	 */
	int apple = 1;

	@Override
	protected void onPluginStart() {

		/*double bananas = (short) 1.7;
		byte car = (byte) 1000000000;
		float dog = (float) 1.7;
		System.out.println(bananas + car + dog);

		int firstNum = 1;
		int secondNum = 2;
		int result = firstNum + secondNum;
		System.out.println(result);

		//Modulo Operator
		int firstNum1 = 1;
		int secondNum1 = 2;
		int result1 = firstNum1 % secondNum1;
		System.out.println(result1);

		//Boolean Operators
		boolean isTrue = true;
		isTrue = false;
		System.out.println(isTrue);

		//String Operators
		String firstName = "John";
		firstName = "Jane"
				+ "Doe";
		System.out.println(firstName);
		*/

		// First function
	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		/*
		 *if (event.getRightClicked().getType() == EntityType.COW)
		 *	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
		 */
		event.getRightClicked().setFireTicks(100);
	}

	int examplePlusOne(int num) {
		int result = 0;
		result = num + 1;
		return result;
	}
}
