package com.rhinoactive.generalutilities;

/**
 * Created by Hunter Andrin on 2017-04-06.
 */

public class DistanceUtils {
    /**
     * Calculate distance between two points in latitude and longitude.
     * Uses Haversine method as its base.
     *
     * @return Distance in Meters
     */
    public static double distanceBetween(double lat1, double lon1, double lat2, double lon2) {

        final int R = 6371; // Radius of the earth

        Double latDistance = Math.toRadians(lat2 - lat1);
        Double lonDistance = Math.toRadians(lon2 - lon1);
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters
        distance = Math.pow(distance, 2);
        return Math.sqrt(distance);
    }
}
