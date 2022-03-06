/**
 * Taking some inspiration from https://www.baeldung.com/spring-security-oauth-auth-server
 */
package net.alphastar.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }

}
