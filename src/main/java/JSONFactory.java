import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFactory {

        private JSONObject latestRatesJSON;

    public JSONObject getLatestRatesJSON() {
        return latestRatesJSON;
    }

    public void setLatestRatesJSON(String latestRatesJSONString) {
        JSONParser jsonParser = new JSONParser();
        try {
            this.latestRatesJSON = (JSONObject) jsonParser.parse(latestRatesJSONString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
