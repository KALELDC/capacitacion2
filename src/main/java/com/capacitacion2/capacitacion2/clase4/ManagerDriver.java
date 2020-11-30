package com.capacitacion2.capacitacion2.clase4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerDriver {
	private WebDriver webDriver;
	private String nombreNavegador;
	String urlPagina;
	
	public ManagerDriver(String nombreNavegador, String urlPagina) {
		this.nombreNavegador= nombreNavegador;
		this.urlPagina = urlPagina;
		seleccionarNavegador();
		
	}
	
	private void seleccionarNavegador() {
		switch (nombreNavegador.toLowerCase().trim()) {
		case "google" : 
			System.setProperty("webdriver.chrome.driver", "src\\\\main\\\\java\\\\resources\\\\Drivers\\\\chromedriver.exe");
			webDriver = new ChromeDriver();
			break;
		case "firefox" : 
			break;			
		case "Internet Explorer" : 
			break;
		default:
			break;
		
		}
		
	}

	public void navegarPagina() {
		webDriver.get(urlPagina);
		
	}
	
	public void cerrarNavegador() {
	webDriver.close();	
		
	}

	public WebDriver getWebDriver() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public String getNombreNavegador() {
		return nombreNavegador;
	}

	public void setNombreNavegador(String nombreNavegador) {
		this.nombreNavegador = nombreNavegador;
	}

	public String getUrlPagina() {
		return urlPagina;
	}

	public void setUrlPagina(String urlPagina) {
		this.urlPagina = urlPagina;
	}
	
}
