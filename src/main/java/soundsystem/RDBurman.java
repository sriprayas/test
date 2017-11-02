package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Prayas on 11/1/2017.
 */
@Component
public class RDBurman implements CompactDisc {
    String artist = "RD";

    public void play(){
        System.out.println("Artist is -->" + artist);
    }
}
