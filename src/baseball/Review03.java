package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team01 = new BaseBallTeam();
        team01.setName("東京ヤクルトスワローズ");
        team01.winScore = 80;
        team01.loseScore = 59;
        team01.drawScore = 4;
        
        team01.report();
        
        BaseBallTeam team02 = new BaseBallTeam();
        team02.setName("横浜DeNAベイスターズ");
        team02.winScore = 73;
        team02.loseScore = 68;
        team02.drawScore = 2;
        
        team02.report();
        
        BaseBallTeam team03 = new BaseBallTeam();
        team03.setName("阪神タイガース");
        team03.winScore = 68;
        team03.loseScore = 71;
        team03.drawScore = 2;
        
        team03.report();
        
        BaseBallTeam team04 = new BaseBallTeam();
        team04.setName("読売ジャイアンツ");
        team04.winScore = 68;
        team04.loseScore = 72;
        team04.drawScore = 3;
        
        team04.report();
        
        BaseBallTeam team05 = new BaseBallTeam();
        team05.setName("広島東洋カープ");
        team05.winScore = 66;
        team05.loseScore = 74;
        team05.drawScore = 3;
        
        team05.report();
        
        BaseBallTeam team06 = new BaseBallTeam();
        team06.setName("中日ドラゴンズ");
        team06.winScore = 66;
        team06.loseScore = 75;
        team06.drawScore = 2;
        
        team06.report();


        }
        
        }

