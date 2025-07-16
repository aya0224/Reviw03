package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team01 = new BaseBallTeam();
        team01.setName("東京ヤクルトスワローズ");
        team01.setWinScore(80);
        team01.setLoseScore(59);
        team01.setDrawScore(4);
        
        team01.report();
        
        BaseBallTeam team02 = new BaseBallTeam();
        team02.setName("横浜DeNAベイスターズ");
        team02.setWinScore(73);
        team02.setLoseScore(68);
        team02.setDrawScore(2);
        
        team02.report();
        
        BaseBallTeam team03 = new BaseBallTeam();
        team03.setName("阪神タイガース");
        team03.setWinScore(68);
        team03.setLoseScore(71);
        team03.setDrawScore(2);
        
        team03.report();
        
        BaseBallTeam team04 = new BaseBallTeam();
        team04.setName("読売ジャイアンツ");
        team04.setWinScore(68);
        team04.setLoseScore(72);
        team04.setDrawScore(3);
        
        team04.report();
        
        BaseBallTeam team05 = new BaseBallTeam();
        team05.setName("広島東洋カープ");
        team05.setWinScore(66);
        team05.setLoseScore(74);
        team05.setDrawScore(3);
        
        team05.report();
        
        BaseBallTeam team06 = new BaseBallTeam();
        team06.setName("中日ドラゴンズ");
        team06.setWinScore(66);
        team06.setLoseScore(75);
        team06.setDrawScore(2);
        
        team06.report();


        }
        
        }

