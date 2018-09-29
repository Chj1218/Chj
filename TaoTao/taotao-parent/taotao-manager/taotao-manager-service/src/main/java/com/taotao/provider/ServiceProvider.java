package com.taotao.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceProvider {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring/applicationContext-service.xml", "spring/applicationContext-dao.xml" });
		context.start();
		System.in.read(); // 按任意键退出

		while (true) {

			Thread.sleep(100000);
		}
	}

}
