package mcmod.nxs.minextension.lib;


public class MainAPI {
	public static MainAPI instance;

	public static MainAPI getInstance() {
		return instance;
	}

	public static void setInstance(MainAPI instance) {
		MainAPI.instance = instance;
	}
}
