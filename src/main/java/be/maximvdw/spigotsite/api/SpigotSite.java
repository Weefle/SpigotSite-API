package be.maximvdw.spigotsite.api;

public final class SpigotSite {
	/* Spigot Site API */
	private static SpigotSiteAPI api = null;
	/* Spigot Site API Version */
	private static String version = "0.0.1-SNAPSHOT";
	/* Cache timeout */
	private static int cacheTTL = 3600;

	/**
	 * Get spigot site API
	 * 
	 * @return Spigot site API
	 */
	public static SpigotSiteAPI getAPI() {
		return api;
	}

	/**
	 * Set spigot site API
	 * 
	 * @param api
	 *            Spigot site API
	 */
	public static void setAPI(SpigotSiteAPI api) {
		SpigotSite.api = api;
	}

	/**
	 * Get spigot site API version
	 * 
	 * @return API version
	 */
	public static String getVersion() {
		return version;
	}

	/**
	 * Get cache timeout for persistent data
	 * 
	 * @return Cache timeout
	 */
	public static int getCacheTimeout() {
		return cacheTTL;
	}

	/**
	 * Set cache timeout for persistent data
	 * 
	 * @param cacheTTL
	 *            Cache timeout
	 */
	public static void setCacheTimeout(int cacheTTL) {
		SpigotSite.cacheTTL = cacheTTL;
	}
}
