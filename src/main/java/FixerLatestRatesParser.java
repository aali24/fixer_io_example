import org.json.simple.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class FixerLatestRatesParser {



        JSONObject rates;

        public FixerLatestRatesParser(){
            FixerHTTPManager fixerHTTPManager = new FixerHTTPManager();
            fixerHTTPManager.setLatestRates();

            JSONFactory jsonFactory = new JSONFactory();
            jsonFactory.setLatestRatesJSON(fixerHTTPManager.getLatestRates());

            rates = jsonFactory.getLatestRatesJSON();
        }

        private Object getJSONValue(String key){ return  rates.get(key); }

        public boolean getJSONSuccess(){ return (Boolean) getJSONValue("success"); }

        public long getTimestamp(){ return (Long) rates.get("timestamp"); }

        public String getBase(){ return (String) getJSONValue("base"); }

        public String getDate(){ return getJSONValue("date").toString(); }



        private JSONObject getRatesJSONObject(){
            return (JSONObject) rates.get("rates") ;
        }

        public Set getRatesKeySet(){
            return getRatesJSONObject().keySet();
        }

        public int getRatesKeySetCount(){
            return getRatesKeySet().size();
        }

        public double getRate(String rateKey){
            return (Double) getRatesJSONObject().get(rateKey);
        }

        public Date epochDateFormat(){
            return  new Date(getTimestamp()*1000);
        }

        public String getTimeFromTimestamp(){
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            return formatter.format(epochDateFormat());
        }

        public String getDateFromTimestamp(){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            return formatter.format(epochDateFormat());
        }
    }





