package com.cl3t4p.lab_06;

import com.cl3t4p.lab_06.value.NatValue;
import com.cl3t4p.lab_06.value.Value;


import java.util.HashMap;
import java.util.Stack;


public class Memory {


    private HashMap<String, Value> mem = new HashMap<>();

    
    private NatValue active_variable = null;

    public void setonMainMemory(String key,Value value){
        mem.put(key,value);
    }

    public NatValue getActive_variable(){
        return active_variable;
    }

    public void setActive_variable(NatValue active_variable){
        this.active_variable = active_variable;
    }

    public void deleteVariable(String key){
        active_variable = null;
    }



    public Value get(String key){
        return mem.get(key);
    }

    public void put(String key,Value value){
        mem.put(key,value);
    }
    
    public boolean contains(String key){
        return mem.containsKey(key);
    }


    @Override
    public String toString() {
        return "Memory{" +
                "mem=" + mem +
                ", active_variable=" + active_variable + '}';
    }
}
