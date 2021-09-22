package com.src;

public class MyLinkedList implements NodeList{
ListItem root=null;

public MyLinkedList(ListItem root) {
	super();
	this.root = root;
}

@Override
public ListItem getRoot() {
	// TODO Auto-generated method stub
	return this.root;
}

@Override
public boolean addItem(ListItem root) {
	// TODO Auto-generated method stub
	if(this.root==null) {
		this.root=root;
		return true;
	}
	ListItem currentItem=this.root;
	while(currentItem!=null) {
		int comp=currentItem.compareTo(root);
		if(comp<0) {
			if(currentItem!=null) {
				currentItem=currentItem.next();
				
			}
			else {
				currentItem.setNext(root);
				root.setPrevious(currentItem);
				return true;	
			}
		}
		else if(comp>0) {
			if(currentItem!=null)
			{
				currentItem.previous().setNext(root);
				root.setPrevious(currentItem.previous());
				root.setNext(currentItem);
				currentItem.setPrevious(root);
			//	return 
			}
			else {
				root.setNext(this.root);
				this.root.setPrevious(root);
				this.root=root;
			}
			return true;
		}
		else {
			return false;
		}
	
	}
	return false;
}

@Override
public boolean removeItem(ListItem root) {
	// TODO Auto-generated method stub
	if (root != null) {
        System.out.println("Deleting item " + root.getValue());
    }

    ListItem currentItem = this.root;
    while (currentItem != null) {
        int comparison = currentItem.compareTo(root);
        if (comparison == 0) {
            // found the item to delete
            if (currentItem == this.root) {
                this.root = currentItem.next();
            } else {
                currentItem.previous().setNext(currentItem.next());
                if (currentItem.next() != null) {
                    currentItem.next().setPrevious(currentItem.previous());
                }
            }
            return true;
        } else if (comparison < 0) {
            currentItem = currentItem.next();
        } else { // comparison > 0
            // We are at an item greater than the one to be deleted
            // so the item is not in the list
            return false;
        }
    }

    // We have reached the end of the list
    // Without finding the item to delete
    return false;

}

@Override
public void traverse(ListItem root) {
	// TODO Auto-generated method stub
	 if (root == null) {
         System.out.println("The list is empty");
     } else {
         while (root != null) {
             System.out.println(root.getValue());
             root = root.next();
         }
     }

}

}
