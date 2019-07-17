package pro.adamski.tdd.outsidein.acceptance;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpStatus.OK;

public class WalkingSkeletonAcceptanceTest extends IntegrationTestBootstrap {

    @Test
    public void shouldGetPrintStatement() {
        //given
        HttpEntity<String> entity = new HttpEntity<>(null, null);

        //when
        ResponseEntity<String> response = restTemplate.exchange(getResourceUrl("/"), GET, entity, String.class);

        //then
        assertThat(response.getStatusCode()).isEqualTo(OK);
        assertThat(response.getBody()).isEqualTo("some");
    }
}
