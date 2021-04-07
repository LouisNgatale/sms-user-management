package i.louis.sms_management_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmsManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsManagementServiceApplication.class, args);
    }

}
