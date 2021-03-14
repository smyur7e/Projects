public class PaintJob {

  public static int getBucketCount(
      double width
      , double height
      , double areaPerBucket
      , int extraBuckets)
  {
    int reqNum = -1;

    if (width > 0.00d &&
        height > 0.00d &&
        areaPerBucket > 0.00d &&
        extraBuckets >= 0
    ) {
      reqNum =
        (int) Math.ceil( width * height / areaPerBucket)
        - extraBuckets;
    }

    return reqNum;
  }

  public static int getBucketCount(
      double width
      , double height
      , double areaPerBucket)
  {
    return getBucketCount(width, height, areaPerBucket, 0);
  }

  public static int getBucketCount( double area, double areaPerBucket) {
    int reqNum = -1;

    if (area > 0 && areaPerBucket > 0) {
      reqNum = (int) Math.ceil( area / areaPerBucket);
    }

    return reqNum;
  }
}

class TestPaintJob {
  public static void testGetBucketCount() {
    System.out.println(
      "getBucketCount(-3.4, 2.1, 1.5, 2) = "
      + PaintJob.getBucketCount(
          -3.4
          , 2.1
          , 1.5
          , 2)
    );

    System.out.println(
      "getBucketCount(3.4, 2.1, 1.5, 2) = "
      + PaintJob.getBucketCount(
          3.4
          , 2.1
          , 1.5
          , 2)
    );

    System.out.println(
      "getBucketCount(2.75, 3.25, 2.5, 1) = "
      + PaintJob.getBucketCount(
          2.75
          , 3.25
          , 2.5
          , 1)
    );

    System.out.println(
      "getBucketCount(-3.4, 2.1, 1.5) = "
      + PaintJob.getBucketCount(
          -3.4
          , 2.1
          , 1.5)
    );

    System.out.println(
      "getBucketCount(3.4, 2.1, 1.5) = "
      + PaintJob.getBucketCount(
          3.4
          , 2.1
          , 1.5)
    );

    System.out.println(
      "getBucketCount(7.25, 4.3, 2.35) = "
      + PaintJob.getBucketCount(
          7.25
          , 4.3
          , 2.35)
    );
  }
}
