package info.codeprimate.Modulation;

import java.util.ArrayList;

public class XtnCollection {
	private ArrayList<Xtn> xtnCollection;

	public XtnCollection() {
		xtnCollection = new ArrayList<Xtn>();
	}

	// Add Xtn to collection
	// TODO: implement smart add()
	public XtnCollection add(Xtn xtn) {
		xtnCollection.add(xtn);
		return this;
	}

	// Remove Xtn from collection
	// TODO: implement smart remove()
	public XtnCollection remove(Xtn xtn) {
		xtnCollection.remove(xtnCollection.indexOf(xtn));
		return this;
	}

	
	// Fetch the Xtn at the given index
	public Xtn get(int index) {
		return xtnCollection.get(index);
	}

	// Return an XtnCollection of Xtns which match the argument
	public XtnCollection detect(Xtn model) {
		XtnCollection out = new XtnCollection();
		return out;
	}

}
