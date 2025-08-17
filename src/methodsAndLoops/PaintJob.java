package methodsAndLoops;

public class PaintJob {
    public static int getBucketCount(double width , double height,double areaPerBucket, int extraBuckets ){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = width * height;
        int totalBucket = (int) Math.ceil(area/areaPerBucket);
//        System.out.println("This is total bucket: "+totalBucket);
        if(totalBucket <= extraBuckets){
            return 0;
        }else {
            return totalBucket - extraBuckets;
        }
    }
    public static int getBucketCount(double width , double height,double areaPerBucket){
        return getBucketCount(width,height,areaPerBucket,0);
    }
    public static int getBucketCount(double area,double areaPerBucket){
        double height;
        if(area <= 0){
             height = -1;
        }else {
             height= Math.sqrt(area);
        }
        return getBucketCount(height,height,areaPerBucket,0);
    }

    public static void main(String[] args) {
//        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
//        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
//        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
//        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
//        System.out.println(getBucketCount(3.4, 2.1, 1.5));
//        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
}
