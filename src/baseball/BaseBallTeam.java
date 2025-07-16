package baseball;

public class BaseBallTeam {
    
   private String name;
   private int winScore;
   private int loseScore;
   private int drawScore;
   
   public String getName() {
       return this.name;
   }
   
   public int getWinScore() {
       return this.winScore;
   }
   
   public int getLoseScore() {
       return this.loseScore;
   }
   
   public int getDrawScore() {
       return this.drawScore;
   }
   
 public BaseBallTeam() {
       
   }
   
public BaseBallTeam(String name,int winScore,int loseScore,int drawScore) {
    this.setName(name);
    this.setWinScore(winScore);
    this.setLoseScore(loseScore);
    this.setDrawScore(drawScore);
}


public double getRate() {
       double rate = (double)(this.getWinScore()) / (double)(this.getWinScore() + this.getLoseScore());
       return rate;
   }  




public void report() {
    
    System.out.println(getName() + "の２０２２年の成績は" + getWinScore() +"勝" + getLoseScore() +"敗" + getDrawScore() + "勝率は" + getRate() );
    

}

public void setName(String name) {
    this.name = name;
}

public void setDrawScore(int drawScore) {
    this.drawScore = drawScore;
}

public void setWinScore(int winScore) {
    this.winScore = winScore;
}

public void setLoseScore(int loseScore) {
    this.loseScore = loseScore;
}



    
    
}
    

    



