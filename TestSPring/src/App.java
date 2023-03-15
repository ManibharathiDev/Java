import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Resource resource = new ClassPathResource("ApplicationContext/ApplicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);  
      
        Student student=(Student)factory.getBean("studentbean");  
        student.displayInfo();  
    }
}
