package com.manqingxing.observer;

import com.manqingxing.observer.impl.User;
import com.manqingxing.observer.impl.WechatServer;

public class TestObserver {

	public static void main(String[] args) {
		WechatServer server = new WechatServer();

		Observer userZhang = new User("ZhangSan");
		Observer userLi = new User("LiSi");
		Observer userWang = new User("WangWu");

		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setInfomation("PHP是世界上最好用的语言！");

		System.out.println("----------------------------------------------");
		server.removeObserver(userZhang);
		server.setInfomation("JAVA是世界上最好用的语言！");

	}
}
