package practice_arrays;

public class WebsiteChecker {
    public static void main(String[] args) {
        String[] websites={"bing.com", "wikipedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};
        int countCom=0;
        int countOrg=0;
        int countEdu=0;

        for(String website : websites){
            if(website.contains(".com")){
                ++countCom;
            } else if(website.contains(".org")){
                ++countOrg;
            } else if (website.contains(".edu")) {
                ++countEdu;
            }

             else {
                 System.out.print(website+ " ");
             }

            }
        System.out.println();
        System.out.println("There are " + countCom+ " \'.com\' websites");
        System.out.println("There are " + countOrg+ " \'.org\' websites");
        System.out.println("There are " + countEdu+ " \'.edu\' websites" );



    }
}
