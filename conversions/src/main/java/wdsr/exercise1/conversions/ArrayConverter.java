package wdsr.exercise1.conversions;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	private static final Logger log = LogManager.getLogger();
	int [] wynik[];
    public int[] convertToInts(String[] strings) {
    	log.debug("convertToInts starting with parameters: ", Arrays.toString(strings));
    	int wynik[] = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    	log.debug("convertToInts exiting with : ", Arrays.toString(wynik));
        return wynik;
    }
}
