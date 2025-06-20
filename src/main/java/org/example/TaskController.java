package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private final KafkaService kafkaService;
    private final PostgresService postgresService;

    public TaskController(KafkaService kafkaService, PostgresService postgresService) {
        this.kafkaService = kafkaService;
        this.postgresService = postgresService;
    }

    @GetMapping("/task")
    public String getTaskResult(@RequestParam String bootstrapServers, @RequestParam String topic) {
        String kafkaMessage = kafkaService.readEarliestMessage(bootstrapServers, topic);
        return postgresService.findMaxTestValueByMessage(kafkaMessage);
    }
}

