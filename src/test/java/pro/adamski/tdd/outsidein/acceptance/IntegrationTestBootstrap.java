package pro.adamski.tdd.outsidein.acceptance;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import pro.adamski.tdd.outsidein.OutsideInTddDemoApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = {OutsideInTddDemoApplication.class},
        value = {"server.port:8023"},
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
abstract class IntegrationTestBootstrap {

    TestRestTemplate restTemplate = new TestRestTemplate();

    String getResourceUrl(String resourceUrl) {
        return "http://localhost:" + 8023 + resourceUrl;
    }
}

