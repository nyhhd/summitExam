package com.summitexam.manager.listener;

import javax.jws.WebService;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SessionCounter implements HttpSessionListener{
	private static int onlineNumber;
	
	public SessionCounter() {
//		System.out.println("SessionCounter被初始化");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
//		se.getSession().setMaxInactiveInterval(10000);
		System.out.println("session创建了。。。。");
		System.out.println(
                "sessionCreated方法");
		onlineNumber++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
//		System.out.println("SessionCounter被銷毀");
		if (onlineNumber > 0){
       	  onlineNumber--;
        }
	}
	
	public static int getonlineNumber() {
		return onlineNumber;
	}
}
