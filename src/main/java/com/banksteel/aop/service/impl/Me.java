package com.banksteel.aop.service.impl;

import com.banksteel.aop.service.Sleepable;

public class Me implements Sleepable {

	@Override
	public void sleep() {
		// int i =11/0;
		System.out.println("\n睡觉！不休息哪里有力气学习！\n");
	}

}
