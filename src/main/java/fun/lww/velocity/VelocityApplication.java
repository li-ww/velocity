package fun.lww.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:velocityConfig.xml"})
public class VelocityApplication {

    public static void main(String[] args) {
        SpringApplication.run(VelocityApplication.class, args);
    }
}
