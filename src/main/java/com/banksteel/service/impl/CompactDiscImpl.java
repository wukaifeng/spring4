package com.banksteel.service.impl;

import org.springframework.stereotype.Component;

import com.banksteel.service.CompactDisc;

@Component
// @Component("compactDiscImpl")
public class CompactDiscImpl implements CompactDisc {
	private String title = "compactdisc titel.....";

	public void play() {
        System.out.println("CompactDisc:" + title);
    }
	
}
