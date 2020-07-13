package com.emerson.eggs;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* 
2020 links/reference:
https://cubicoder.github.io/tutorials/1-12-2/2018-06-29-crafting-recipes/
https://fabricmc.net/wiki/tutorial:recipes (not fabric) https://mcforge.readthedocs.io/en/latest/utilities/recipes/
*/

public class EatTheEggs implements ModInitializer {

	public static final String MOD_ID = "eggs";	
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);		
	public static void LOG(String logMsg){
		// DISABLED OUTSIDE DEV // LOGGER.info("*** EatTheEggs: " + logMsg); 
	}
	
    @Override
    public void onInitialize() {	        			
		LOG("EatTheEggs mode initializing ...");				
        EatTheEggsItems.init();        
    }
    
} 