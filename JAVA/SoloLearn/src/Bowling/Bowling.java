package Bowling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Bowling {
	HashMap<String, Integer> players;
	
	Bowling() {
		players = new HashMap<String, Integer>();
	}
	
	public void addPlayer(String name, int p) {
		players.put(name, p);
	}
	
	public void getWinner() {
        int max = 0;
        String maxPlayer = null;
        Iterator<Entry<String, Integer>> it = players.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, Integer> pair = it.next();
            if ((int) pair.getValue() > max) {
                max = (int) pair.getValue();
                maxPlayer = (String) pair.getKey();
            }
        }
        System.out.println(maxPlayer);
    }
}

