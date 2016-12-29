package almeida.fernando.netflix.zuul.api.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulServerApp {
  public static void main(String[] args) {
    new SpringApplicationBuilder(ZuulServerApp.class).web(true).run(args);
  }
}
