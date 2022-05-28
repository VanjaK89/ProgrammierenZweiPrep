import java.util.HashMap;

public class BlackJack {
    private HashMap<PlayerBJ, Integer> players = new HashMap<PlayerBJ, Integer>();

    public BlackJack() {
        this.players = players;
    }

    public boolean add(PlayerBJ player){
        if(players.containsKey(player)){
            return false;
        }

        players.put(player, 0);
        return true;
    }
    public boolean addCard(PlayerBJ player, Integer cardValue){
        if(!players.containsKey(player)){
            return false;
        }
        Integer value = players.get(player);
        value += cardValue;
        players.put(player, value);
        return true;
    }
    public Integer getValue(PlayerBJ player) {
        return players.get(player);
    }
    public PlayerBJ getWinner(){
        PlayerBJ w = null;
        int punkte = -1;

        for(PlayerBJ p: players.keySet()){
            int punkteP = players.get(p);
            if(punkteP <= 21){
                if(punkteP > punkte){
                    punkte = punkteP;
                    w = p;
                }
                else {
                    if(punkteP == punkte){
                        w = null;
                    }
                }
            }
        }
        return w;
    }

    @Override
    public String toString() {
        String s = "";
        for(PlayerBJ p: players.keySet())
        {
            s += p.getName() + ",Kartenwert: " + players.get(p) + "\n";
        }
        return s;
    }
}
