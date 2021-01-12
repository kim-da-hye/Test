package app10_school_file;

public class Score {
	int[] scores;
	//»ý¼ºÀÚ
	Score(){}
	Score(int[] scores){
		this.scores=scores;
	}
	Score(int a,int b,int c){
		scores=new int[3];
		scores[0]=a;
		scores[1]=b;
		scores[2]=c;
		
	}
	@Override
	public String toString() {
		String text="";
		for(int score: scores) {
			text +=String.format("%5d", score);
		}
		return text;
		
	}
	public int getAvg() {
		int sum=0;
		for(int score: scores) {
			sum +=score;
		}
		return sum/scores.length;
	}
}
