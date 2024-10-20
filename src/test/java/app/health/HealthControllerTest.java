package app.health;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import app.health.HealthController;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HealthControllerTest {

    private HealthController healthController = new HealthController();

    @Test
    public void testHealthEndpoint() {
        // when
        ResponseEntity<Map<String, String>> responseEntity = healthController.healthz();

        // then
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        Map<String, String> responseBody = responseEntity.getBody();
        assertNotNull(responseBody);
        assertEquals("healthy", responseBody.get("status"));
    }
}
