public class appState {
	public static class IllegalSaveFormatException extends Exception {
		public IllegalSaveFormatException(String e) {
			super(e);
		}
	}

	private static appState theInstance;
	private double totalAverageScore;
	private double totalAveragePutts;
	private int totalHolesPlayed;

	static synchronized appState instance() {
		if(theInstance == null) {
			theInstance = new appState();
		}
		return theInstance;
	}
	//finishing copying from gameState.java
}
