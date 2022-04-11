package Arraylist;

import java.util.ArrayList;

public class MainEstoque {

	public static void main(String[] args) {
		ArrayList<Menus> estoq = new ArrayList<>();

		Menus menu = new Menus();
		menu.menu();
		menu.remover();
	}

}
