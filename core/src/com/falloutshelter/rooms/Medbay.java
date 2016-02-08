/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.falloutshelter.rooms;

import com.falloutshelter.superclasses.Room;

/**
 *
 * @author Scott
 */
public class Medbay extends Room {

    public Medbay(float x, float y, float width, float height, String requiredSkill) {
        super(x, y, width, height, "intelligence");
        super.setBaseCost(400);
    }

    @Override
    public int getCost(int numBuilt) {
        return super.getBaseCost() + (numBuilt * 100);
    }

    @Override
    public int collectResource() {
        return (1+((super.getLevel()-1)*(1/2)))*super.getSize();
    }
    
}