package mcmod.nxs.minextension.lib;

public class ITexturePath {

    private static String texturesPath;

    public static String getTexturesPath() {
	return texturesPath;
    }

    public static void setTexturesPath(String texturesPath) {
	ITexturePath.texturesPath = texturesPath;
    }
}
