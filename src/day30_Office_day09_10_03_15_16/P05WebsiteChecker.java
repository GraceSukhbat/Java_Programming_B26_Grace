package day30_Office_day09_10_03_15_16;

public class P05WebsiteChecker {
    public static void main(String[] args) {
        /* Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain
Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu,
         */
        String [] urls = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};
        int countCom = 0;
        int countOrg = 0;
        int countEdu = 0;
        int countOther = 0;
        for (int i = 0; i < urls.length; i++) {
            if(urls[i].contains(".com")){
                countCom++;
            } else if(urls[i].contains(".org")){
                countOrg++;
            } else if(urls[i].contains(".edu")){
                countEdu++;
            } else {
                countOther++;
            }
        }
        System.out.println(".com: " + countCom);
        System.out.println(".org: " + countOrg);
        System.out.println(".edu: " + countEdu);
        System.out.println("other: " + countOther);
    }
}
