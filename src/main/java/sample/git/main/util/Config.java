package sample.git.main.util;

import java.io.File;

/**
 * Created by sde52a6 on 05.02.2017.
 */
public class Config {

    private File configFile = null;   

    public Config(File file){
        this.configFile = file;
        System.out.println("file set");
    }

    public boolean isExists(){
        return configFile.exists();
    }

}
