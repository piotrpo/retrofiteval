package pl.digita.sandbox.resttemplate.consumer;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

public class AbstractConsumer {

    protected static final RestTemplate REST_TEMPLATE = new RestTemplate();

    //https://stackoverflow.com/questions/35998790/resttemplate-how-to-send-url-and-query-parameters-together/36021268
    public static void buildURLWithParamsPOC() {

        final String url = "http://test.com/solarSystem/planet/{planet}/moon/{moon}";

        // URI parameters
        final Map<String, String> uriParams = new HashMap<>();
        uriParams.put("planet", "Mars");
        uriParams.put("moon", "Phobos");

        // Query parameters
        final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                .queryParam("firstName", "Mark")
                .queryParam("lastName", "Watney");


        System.out.println(builder.buildAndExpand(uriParams).toUri());
    }
}
