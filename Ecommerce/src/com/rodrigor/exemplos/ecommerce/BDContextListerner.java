package com.rodrigor.exemplos.ecommerce;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class BDContextListerner
 *
 */
@WebListener
public class BDContextListerner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public BDContextListerner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event) {
    	EcommerceFacade facade = new EcommerceFacade();
        event.getServletContext().setAttribute("facade",facade );
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
