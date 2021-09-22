package com.src;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
private String name;
private int hitPoints;
private int strength;
Monster(String name,int hitPoints,int strength){
    this.name=name;
    this.hitPoints=hitPoints;
    this.strength=strength;
   // this.weapon="Sword";
}
public String getName() {
	return name;
}
public int getHitPoints() {
	return hitPoints;
}
public int getStrength() {
	return strength;
}
@Override
public String toString() {
	return "Monster {name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "}";
}
@Override
public List<String> write() {
	// TODO Auto-generated method stub
	List<String> list=new ArrayList<String>();
	list.add(1, name);
	list.add(2,""+hitPoints);
	list.add(3,""+strength);
	
	return list;
}
@Override
public void read(List<String> list) {
	// TODO Auto-generated method stub
	if(list!=null && list.size()>0) {
		this.name=list.get(0);
		this.hitPoints=Integer.parseInt(list.get(2));
		this.strength=Integer.parseInt(list.get(3));
		
	}
}

}
