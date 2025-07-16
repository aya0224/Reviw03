package baseball;

public class BaseBallTeam {
    
   public String name;
   public int winScore;
   public int loseScore;
   public int drawScore;
   
 public BaseBallTeam() {
       
   }
   
public BaseBallTeam(String name,int winScore,int loseScore,int drawscore) {
    this.name = name;
    this.winScore =winScore;
    this.loseScore =loseScore;
    this.drawScore = drawScore;
}


public double getRate() {
       double rate = (double)(this.winScore) / (double)(this.winScore + this.loseScore);
       return rate;
   }  




public void report() {
    
    System.out.println(name + "の２０２２年の成績は" + winScore +"勝" + loseScore +"敗" + drawScore + "勝率は" + getRate() );
    

}



    
    
}
    

    



