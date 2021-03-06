package reed.muller.encoding.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Component
@ConfigurationProperties
@PropertySource("classpath:application.properties")
public class EncodingConfiguration {

    @Value("${encoding.m}")
    private int m;

    @Value("${encoding.channel-probability}")
    private double channelProbability;

    @Value("${multipart.location}")
    private String storagePath;

    public int getM() {
        return m;
    }

    public double getChannelProbability() {
        return channelProbability;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public EncodingConfiguration() {
    }

    public EncodingConfiguration(int m, double p) {
        this.m = m;
        this.channelProbability = p;
    }
}
