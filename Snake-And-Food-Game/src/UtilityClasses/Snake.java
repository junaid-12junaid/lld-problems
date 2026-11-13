package UtilityClasses;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Snake {
    public Deque<Pair> body;
    public Map<Pair,Boolean> positionMap;

    public Snake() {
        this.body = new LinkedList<>();
        this.positionMap = new HashMap<>();
        Pair intailPair=new Pair(0,0);
        body.addFirst(intailPair);
        this.positionMap.put(intailPair,true);
    }
    public Deque<Pair> getBody(){
        return  body;
    }
}
