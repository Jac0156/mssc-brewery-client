package guru.springframework.mssc_brewery_client.web.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value="sfg.brewery", ignoreUnknownFields = false)
public class BreweryClient {

    public final String BEER_PATH_V1 = "/api/v1/beer";
    private String apihost;

    public void setApihost(String apihost) {
        this.apihost = apihost;
    }



}
