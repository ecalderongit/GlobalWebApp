package com.globalapps.web.common.config;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CommonConfigBean {
	private static final String RELATIVE_FILE_PATH = "/WEB-INF/resources/config/common/common-config.xml";

	Map<String, String> params = null;
	/**Instancia unica de la clase*/
	private static CommonConfigBean instance = null;
	
	
	
	/**
	 * Metodo que devuelve la unica instancia posible de la clase
	 * */
	public static CommonConfigBean getInstance(){
		if(instance == null){
			instance = new CommonConfigBean();
		}
		return instance;
	}
	/**Cosntructor privado por defrecto
	 * */
	private CommonConfigBean(){
		super();
		
		
		try {

			File fXmlFile = new File(PathTool.getAbsolute(RELATIVE_FILE_PATH));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("param");
	         params = new HashMap<>();
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	                Node nodo = nList.item(temp);
	                System.out.println("Elemento:" + nodo.getNodeName());
	                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
	                    Element element = (Element) nodo;
	                    params.put(element.getAttribute("name"), element.getAttribute("value"));
	                }
	            }
			
			
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
	}
	
	public String getParam(String paramName){
		return params.get(paramName);
	}
	
}
