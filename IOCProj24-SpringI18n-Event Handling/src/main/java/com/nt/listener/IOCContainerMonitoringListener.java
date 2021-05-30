package com.nt.listener;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerMonitoringListener implements ApplicationListener<ApplicationEvent> {

	private long start,end;
	
	public void onApplicationEvent(ApplicationEvent event) {
		if(event.toString().contains("RefreshedEvent")) {
			System.out.println("Application Container is started:: "+ new Date());
			start=System.currentTimeMillis();
		}
		else if(event.toString().contains("ClosedEvent")) {
			System.out.println("Application Container is closed:: "+ new Date());
			end=System.currentTimeMillis();
			System.out.println("Application Container is runned for "+(end-start)+"ms");
		}
	}

}
