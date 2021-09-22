package com.src;

public class Node extends ListItem{
	
public Node(Object value) {
	super(value);
}

@Override
public ListItem next() {
	// TODO Auto-generated method stub
	return this.rightLink;
}

@Override
public ListItem setNext(ListItem right) {
	// TODO Auto-generated method stub
	this.rightLink=right;
	return this.rightLink;
}

@Override
public ListItem previous() {
	// TODO Auto-generated method stub
	return this.leftLink;
}

@Override
public ListItem setPrevious(ListItem left) {
	// TODO Auto-generated method stub
	this.leftLink=left;
	return this.leftLink;
}

@Override
public int compareTo(ListItem item) {
	// TODO Auto-generated method stub
	if(item!=null) {
		return ((String) super.getValue()).compareTo((String) item.getValue());
	}
	else {
		return -1;	
	}
}
}
