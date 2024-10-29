public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        double sum = 0;
        for (int i:foodServiceEstimatesKgPerCapitaPerYear){
            sum = sum + i;
        }
        double mean = (sum/foodServiceEstimatesKgPerCapitaPerYear.length)+0.5;
        return (int)mean;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int c = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(country)) {
                c = i;
            }
        }
        return totalWasteKgPerCapitaPerYear[c];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int c = 0;
        for (int i = 1; i < countries.length; i++){
            if(totalWasteKgPerCapitaPerYear[c]<totalWasteKgPerCapitaPerYear[i]){
                c = i;
            }
        }
        return countries[c];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        int m = 0;
        for(int i = 1; i < countries.length; i++){
            if(percentagesShareInPoverty[i] > percentagesShareInPoverty[m]){
             m = i;
            }
        }
        int c = 0;
        for(int i = 0; i < countries.length; i++){
            if (percentagesShareInPoverty[i] == percentagesShareInPoverty[m]){
                c++;
            }
        }
        String[] highestPovertyPercentage;
        highestPovertyPercentage = new String[c];
        c = 0;
        for(int i = 0; i < countries.length; i++){
            if (percentagesShareInPoverty[i] == 99.99){
                highestPovertyPercentage[c] = countries[i];
                c++;
            }
        }
        return highestPovertyPercentage;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        int c = 0;
        for(int i = 0; i < countries.length; i++){
            if (confidences[i].equals("High Confidence")){
                c++;
            }
        }
        String[] highConfidence;
        highConfidence = new String[c];
        c = 0;
        for(int i = 0; i < countries.length; i++){
            if (confidences[i].equals("High Confidence")){
                highConfidence[c] = countries[i];
                c++;
            }
        }
        return highConfidence;
    }
}
