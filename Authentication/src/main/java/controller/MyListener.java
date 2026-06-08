package controller;



import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {

	int current = 0;
	int total = 0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		current++;
		total++;
		
		ServletContext cx =  se.getSession().getServletContext();
		cx.setAttribute("current", current+"");
		cx.setAttribute("total", total+"");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
		current--;
		ServletContext cx =  se.getSession().getServletContext();
		cx.setAttribute("current", current+"");
		
	}

}
