package mp.sucess.color;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class SuccessColor extends JavaPlugin {
	
	@Override
	public void onEnable() {
		  PluginManager pm = Bukkit.getPluginManager();
		  pm.registerEvents(new ChatEvent(), this);
		}
	@Override
	public void onDisable() {
		
	}
	
}
