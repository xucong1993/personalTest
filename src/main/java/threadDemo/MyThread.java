package threadDemo;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import com.jiuxian.common.ChannelEnum;
import com.jiuxian.service.messenger.PushService;



public class MyThread  extends Thread{
    
	private PushService pushService;
	private int i;
	private String title ;
	private String content ;
	private String baiduChannelId ;
	private int deviceType;
	private String type ;
	public  MyThread(int i ,String title , String content,String baiduChannelId,int deviceType,String type){
		this.i = i;		
		this.title = title;		
	    this.content = content;
	    this.baiduChannelId = baiduChannelId;
	    this.deviceType = deviceType;
	    this.type = type;
	}
	
	public void run(){
		try {
			System.out.println("["+this.i+"] start....");		
			pushService.pushMessage(title, content, type, baiduChannelId, deviceType);
			Thread.sleep((long)(Math.random()*1000));
			System.out.println("["+this.i+"] end....");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	 
	public static void main(String[] args) {
	//   ScheduledExecutorService s = Executors.newScheduledThreadPool(3);
		 ExecutorService s=Executors.newFixedThreadPool(4);  
		 for(int i =0 ;i<10;i++){
			 
			 s.execute(new MyThread(i,"xucong","hello jkd","ios",1,"1"));
			
		 }
		 System.out.println("submit finish");  
		 s.shutdown();
	}
	
	
	
	
	

}
