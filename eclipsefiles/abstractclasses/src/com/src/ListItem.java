package com.src;

public abstract class ListItem {
protected ListItem rightLink=null;
protected ListItem leftLink=null;
protected Object value;
public ListItem(Object value) {
	super();
	this.value = value;
}
public Object getValue() {
	return value;
}
public void setValue(Object value) {
	this.value = value;
}
public abstract ListItem next();
public abstract ListItem setNext(ListItem right);
public abstract ListItem previous();
public abstract ListItem setPrevious(ListItem left);
public abstract int compareTo(ListItem item);

}
