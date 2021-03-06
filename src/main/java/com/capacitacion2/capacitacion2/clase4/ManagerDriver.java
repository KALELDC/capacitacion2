package com.capacitacion2.capacitacion2.clase4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

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
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
			webDriver = new ChromeDriver();
			break;	
		case "firefox" : 
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Drivers\\geckodriver.exe");
			
			webDriver =  new FirefoxDriver();
			break; 
					
		case "ie" : 
           System.setProperty("webdriver.ie.driver", "src\\main\\resources\\Drivers\\IEDriverServer.exe");
		 webDriver = new InternetExplorerDriver();
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
