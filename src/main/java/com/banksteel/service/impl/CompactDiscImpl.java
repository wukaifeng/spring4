package com.banksteel.service.impl;

import org.springframework.stereotype.Component;

import com.banksteel.service.CompactDisc;

@Component
public class CompactDiscImpl implements CompactDisc {
	private String title = "compactdisc titel.....";
	
	@Override
	public void play() {
		System.out.println("CompactDisc:" + title);
	}

}
