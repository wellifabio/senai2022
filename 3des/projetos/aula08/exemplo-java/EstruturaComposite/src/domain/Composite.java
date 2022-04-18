package domain;

import java.util.ArrayList;

public class Composite implements Component {

	String name;
	ArrayList<Component> components = new ArrayList<>();
	
	public void addComponent(Component com) {
		components.add(com);
	}
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component c: components) {
			c.showPrice();
		}
		
	}

}
