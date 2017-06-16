package com.cemerson.eggs.proxy;

import com.cemerson.eggs.init.AllTheEggsItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		AllTheEggsItems.registerRenders();
	}
	
}
