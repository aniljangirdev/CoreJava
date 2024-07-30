package model;

public class Content{
    public String sector;
    public int ios;
    public int android;
    public int total;
    public int verified;
    public int notVerified;
    public int reVerify;
    public String region;

    @Override
    public String toString() {
        return "Content{" +
                "sector='" + sector + '\'' +
                ", ios=" + ios +
                ", android=" + android +
                ", total=" + total +
                ", verified=" + verified +
                ", notVerified=" + notVerified +
                ", reVerify=" + reVerify +
                ", region='" + region + '\'' +
                '}';
    }
}


