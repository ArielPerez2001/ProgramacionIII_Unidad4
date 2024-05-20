package controllers;

import views.AuthView;

public class AuthController {
	
	public AuthView vista;
	
	public AuthController() {
		
		vista = new AuthView();
		
	}
	
	public void login() {
		
		vista.login();
	}
	
	public void register() {
		
		vista.register();
	}
}
