public class Statistics {

    private static float totalTimeSpentTravellingToPickupCount = 0;
    private static float totalTimeSpentTravellingToDestinationCount = 0;
    private static float totalTimeSpentTravellingCount = 0;

    public static float getTotalTimeSpentTravellingToPickup() {
        return totalTimeSpentTravellingToPickupCount;
    }
    public static void incrementTotalTimeSpentTravellingToPickup() {
        totalTimeSpentTravellingToPickupCount++;
    }

    public static float getTotalTimeSpentTravellingToDestination() {
        return totalTimeSpentTravellingToDestinationCount;
    }

    public static void incrementTotalTimeSpentTravellingToDestination() {
        totalTimeSpentTravellingToDestinationCount++;
    }

    public static float getTotalTimeSpentTravelling() {
        return totalTimeSpentTravellingCount;
    }

    public static void incrementTotalTimeSpentTravelling() {
        totalTimeSpentTravellingCount++;
    }
}
