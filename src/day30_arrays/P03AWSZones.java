package day30_arrays;

public class P03AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String str = "us-east-1,us-west-1,us-west-2,us-west-3";
        String [] zones = str.split(",");
        for (int i = 0; i < zones.length; i++) {
            System.out.println("Deploying " + app + " to " + zones[i] + "...");
            System.out.println("Deployment completed for " + zones[i]);
        }

    }
}
