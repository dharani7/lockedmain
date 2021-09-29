package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "dharani saripally");
		
		HandleOptions.handleWelcomeScreenInput();
		

	}

}
