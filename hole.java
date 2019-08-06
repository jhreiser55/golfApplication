public class hole {
	
	private int strokes;
	private int par;
	private int putts;

	public hole(){
		
	}

	public hole(int par, int strokes, int putts){
		
		this.par = par;
		this.strokes = strokes;
		this.putts = putts;

	}

	public int getPutts(){
		return putts;
	}

	public int getScore(){
		return strokes;
	}
}
