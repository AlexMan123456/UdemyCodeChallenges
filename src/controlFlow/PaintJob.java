package controlFlow;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double areaToCover = width*height;
        double loopTotal = 0;
        int bucketsNeeded = 0;
        
        // Figure out total amount of buckets needed, not including extras
        while(loopTotal < areaToCover){
            loopTotal = loopTotal + areaPerBucket;
            bucketsNeeded++;
        }

        // Exclude any extra buckets already acquired
        int extraBucketsCopy = extraBuckets;
        while(loopTotal > 0){
            if(extraBucketsCopy == 0){
                break;
            }

            loopTotal = loopTotal - areaPerBucket;
            extraBucketsCopy--;
            bucketsNeeded--;
        }

        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        return getBucketCount(1, area, areaPerBucket);
    }

    public static void main(String[] args){
        System.out.println("TASK 1: ALL PARAMETERS");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // should return -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // should return 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // should return 3
        System.out.println();

        System.out.println("TASK 2: NO EXTRA BUCKETS");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // should return -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // should return 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); // should return 14
        System.out.println();

        System.out.println("TASK 3: AREA ONLY");
        System.out.println(getBucketCount(3.4, 1.5)); // should return 3
        System.out.println(getBucketCount(6.26, 2.2)); // should return 3
        System.out.println(getBucketCount(3.26, 0.75)); // should return 5
    }
}
