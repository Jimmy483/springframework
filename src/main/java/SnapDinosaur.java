import org.springframework.stereotype.Component;

@Component
public class SnapDinosaur implements MobileRam{

    public void ram(){
        System.out.println("8gb ram");
    }
}
