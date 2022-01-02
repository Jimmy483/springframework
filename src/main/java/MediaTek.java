import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements MobileRam {


    public void ram() {
        System.out.println("Wow such a  good processor");
    }

}
