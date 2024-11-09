package app.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    private static final Logger logger = LoggerFactory.getLogger(HealthController.class);

    public HealthController() {}

    @GetMapping("/healthz")
    public ResponseEntity<Map<String, String>> healthz() {
        Map<String, String> response = new HashMap<>();

        response.put("status", "healthy");
        logger.info("Healthz endpoint requested. Response {}", response);

        return ResponseEntity.ok(response);
    }
}
