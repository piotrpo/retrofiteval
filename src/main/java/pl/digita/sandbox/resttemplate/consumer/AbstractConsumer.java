package pl.digita.sandbox.resttemplate.consumer;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class AbstractConsumer {

    protected static final RestTemplate REST_TEMPLATE = new RestTemplate();

    //https://stackoverflow.com/questions/35998790/resttemplate-how-to-send-url-and-query-parameters-together/36021268
    public static void buildURLWithParamsPOC(final Map<String, String> pathParams, final Map<String, String> queryParams) {
        //                  http://test.com/solarSystem/planet/Mars/moon/Phobos?firstName=Mark&lastName=Watney
        final String url = "http://test.com/solarSystem/planet/{planet}/moon/{moon}";

        final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url);

        for (final Map.Entry<String, String> queryParam : queryParams.entrySet()) {
            builder.queryParam(queryParam.getKey(), queryParam.getValue());
        }

        System.out.println(builder.buildAndExpand(pathParams).toUri());
    }
}
