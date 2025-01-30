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
    public static void main(String[] args){
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // should be -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // should be 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // should be 3
    }
}
