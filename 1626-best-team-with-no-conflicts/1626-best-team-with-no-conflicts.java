class Player{
        
        public int age;
        public int score;
        
        public Player(int age, int score){
            this.age = age;
            this.score = score;
        }
    
    }


class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        
        Player[] players = new Player[scores.length];
        
        //group scores and ages in single data structure
        for(int i=0;i<players.length;i++){
            players[i] = new Player(ages[i],scores[i]);
        }
        
        //sort on the basis of ages, use score for breaking ties
        Arrays.sort(players, (player1,player2)->player1.age==player2.age?player1.score-player2.score:player1.age-player2.age);
        
        int dp[] = new int[players.length];
        
        int max = dp[0] = players[0].score;
        
        for(int i=1;i<players.length;i++){
            
            dp[i] = players[i].score;
            for(int j=0;j<i;j++){
                
                if(players[j].score<=players[i].score){
                 
                    dp[i] = Math.max(dp[i],dp[j]+players[i].score);
                    
                }
                
            }

            max = Math.max(max,dp[i]);
            
        }
        
        
        
        return max;
    }
    
    
}