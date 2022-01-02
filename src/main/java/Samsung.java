import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    //Qualifier can be used instead of using primary annotations on a class
          //@Qualifier("mediaTek")
    MobileRam ram;

    public MobileRam getRam() {
        return ram;
    }

    public void setRam(MobileRam ram) {
        this.ram = ram;
    }


    public void config(){
        System.out.println("\'s6 edge plus\', 16mp, 64gb");
        ram.ram();
    }
}
