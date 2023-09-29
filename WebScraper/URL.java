package WebScraper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class URL {
    List<String> urls;
    public List<String> getUrls(){
        urls = new ArrayList<>(Arrays.asList("https://docs.google.com/document/d/1A_HpzK8rPPUKGJvPOz1sUEQwIrZHXxYmdRy_L3K4Om4/edit#heading=h.f5q4jkoco84y","https://docs.google.com/document/d/13VY5iemZ6YonSoXWUchIt2iU69opiY801N2n_6QTuDY/edit#heading=h.5h4ksbfwj3nn"));
        return urls;
    }

//    public static void main(String[] args) {
//        URL urls = new URL();
//        for(String url:urls.getUrls()) {
//
//        }
//    }
}

