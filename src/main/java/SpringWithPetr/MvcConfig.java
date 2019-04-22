package SpringWithPetr;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String currentPath = new File(".").getAbsolutePath();
        String location = "file:///" + currentPath + "\\src\\main\\resources\\static\\";
        System.out.println(location);
        registry.addResourceHandler("/img/**").addResourceLocations(location);//addResourceLocations("file:C:\\Users\\Vladimir\\IdeaProjects\\sem8\\ApplicationSpring\\src\\main\\resources\\static\\");
    }
}