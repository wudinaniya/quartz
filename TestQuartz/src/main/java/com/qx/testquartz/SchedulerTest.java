package com.qx.testquartz;

import org.junit.Test;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * 使用链式编程时， 换行前行尾加// 是防止格式化format时下一行.的内容跑到上面来
 * @author dell
 *
 */
public class SchedulerTest {

	@Test
	public void testSimpleTrigger() throws Exception {
		// 获取一个任务调度器工厂
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		// 获取任务调度器
		Scheduler scheduler = schedulerFactory.getScheduler();
		// 创建jobdetail对象，封装有我们的job信息
		/**
		 * withIdentity(String name, String group)
		 * Parameters:
		 * name --the name element for the Job's JobKey
		 * group --the group element for the Job's JobKey
		 */
		JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("jobname1", "group1").build();
		// 创建触发器
		/**
		 * withIdentity(String name, String group)
		 * Parameters:
		 * name --the name element for the Trigger's TriggerKey
		 * group --the group element for the Trigger's TriggerKey
		 */
		SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity("simpletrigger", "simpletriggergroup")//
				.withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(2).withRepeatCount(10))// 每隔2s执行一次，共执行11次（其中重复10次）。
				.startNow()//
				.build();
		scheduler.scheduleJob(jobDetail,trigger);//使用任务调度器将jobDetail和trigger进行关联
		scheduler.start();//开始任务
		Thread.sleep(30000);
		scheduler.shutdown();//结束
		
	}
	
	
	@Test
	public void testCronTrigger() throws Exception{
		//获取一个任务调度器工厂
		SchedulerFactory schedulerFactory=new StdSchedulerFactory();
		//获取任务调度器
		Scheduler scheduler = schedulerFactory.getScheduler();
		//创建jobdetail对象，封装有我们的job信息
		JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("jobname1", "group1").build();
		//创建触发器
		CronTrigger trigger=TriggerBuilder.newTrigger().withIdentity("crontrigger", "crontriggergroup")//
				.withSchedule(CronScheduleBuilder.cronSchedule("*/5 3 17 * * ?"))//每天在17点:03分:00秒至17:03:59之间每隔5秒执行一次。
				.startNow()
				.build();
		scheduler.scheduleJob(jobDetail,trigger);//使用任务调度器将jobDetail和trigger进行关联
		scheduler.start();//开始任务
		Thread.sleep(250000);
		//scheduler.shutdown();//结束
	}
}
