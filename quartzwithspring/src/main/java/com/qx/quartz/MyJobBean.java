package com.qx.quartz;

import org.springframework.stereotype.Component;

@Component("qxjobBean")
public class MyJobBean {

	/**
	 * 最终执行的方法
	 */
	public void doSomeThing(){
		System.out.println("我jobBean只是一个代理对象，我使用了@Component注解");
	}
}
