package com.rodrigor.exemplos.ecommerce;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CestaComprasListener
 *
 */
@WebListener
public class CestaComprasListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public CestaComprasListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event) {
        CestaCompras cesta = new CestaCompras();
        event.getSession().setAttribute("cesta", cesta);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
