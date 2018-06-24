package kashyap;
import org.apache.log4j.Logger;


public class Test_Log4j {

	
	// jar file
	// log4j.prop - change the path 
	// logger
	public static void main(String[] args) {
		
		Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger"); 
		
		APPLICATION_LOGS.debug("starting");
		APPLICATION_LOGS.debug("executing");
		APPLICATION_LOGS.debug("ending");
		
	}

}
