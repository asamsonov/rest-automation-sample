import model.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> randomEntity = restTemplate.getForEntity("http://gturnquist-quoters.cfapps.io/api/random", String.class);
        HttpEntity<Random> requestUpdate = new HttpEntity<>(updatedInstance, headers);
        restTemplate.postForObject("http://gturnquist-quoters.cfapps.io/api/random",  );
        randomEntity.toString();
        Random random = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Random.class);
        LOG.info(random.toString());
    }

//    public static void main(String args[]) {
//        SpringApplication.run(Application.class);
//    }
//
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            Random random = restTemplate.getForObject(
//                    "http://gturnquist-quoters.cfapps.io/api/random", Random.class);
//            LOG.info(random.toString());
//        };
//    }

}