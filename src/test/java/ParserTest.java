import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParserTest {



    private FixerLatestRatesParser fixerLatestRatesParser = new FixerLatestRatesParser();

    private String currentDate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(date);
    }

    @Test
    public void dateIsCurrentDate(){
        Assert.assertEquals(currentDate(), fixerLatestRatesParser.getDate());
    }




}
