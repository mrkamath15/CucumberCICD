package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    private Properties properties;

    public ReadConfig() {
        try {
            FileInputStream fileInputStream = null;
            fileInputStream = new FileInputStream(Constants.CONFIG_FILE_PATH);
            properties = new Properties();
            properties.load(fileInputStream);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getChromeDriverPath() {
        return properties.getProperty("chromeDriverPath");
    }

    public String getIEDriverPath() {
        return properties.getProperty("ieDriverPath");
    }

    public String getFirefoxDriverPath() {
        return properties.getProperty("geckoDriverPath");
    }
}
