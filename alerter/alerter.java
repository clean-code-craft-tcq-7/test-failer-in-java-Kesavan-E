public class Alerter {
    static int alertFailureCount = 0;
    interface NetworkAlert{
        int Alert(float celcius);
    }
    static NetworkAlert networkAlertStub = (float celcius) ->{ //for testing code we use this
        int THRESHOLD_TEMP = 150;
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        // Return 200 for ok
        // Return 500 for not-ok
         if(celcius<THRESHOLD_TEMP){
        return 200;}
        else
         {
        return 500;
         }

    };
    
    NetworkAlert networkAlert = (float celcius) ->{ //for development code we use this
        return 0;};
    
    static float convertFarenheitToCelcius(float farenheit) {
    float celcius = (farenheit - 32) * 5 / 9;
    return celcius;
    }
    
     static void alertInCelcius(float farenheit, NetworkAlert networkAlert) {
        float celcius = convertFarenheitToCelcius(farenheit);
        int returnCode = networkAlert.Alert(celcius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 1;
        }
    }
    public static void main(String[] args) {
        alertInCelcius(400.5f,networkAlertStub);
        alertInCelcius(301.6f,networkAlertStub);
        assert(alertFailureCount == 1);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
