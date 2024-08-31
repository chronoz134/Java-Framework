package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository=inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (partRepository.count() == 0 && productRepository.count() == 0) {

            OutsourcedPart os1 = new OutsourcedPart();
            os1.setCompanyName("AutoParts BrakeZone");
            os1.setName("Brake Pads");
            os1.setId(1001);
            os1.setPrice(125.00);
            os1.setInv(100);
            outsourcedPartRepository.save(os1);
            OutsourcedPart thePart = null;
            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Brake Pads")) thePart = part;
            }


            OutsourcedPart os2 = new OutsourcedPart();
            os2.setCompanyName("PoweredUp Batteries inc");
            os2.setName("Car Battery");
            os2.setId(1002);
            os2.setPrice(155.99);
            os2.setInv(50);
            outsourcedPartRepository.save(os2);
            thePart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Car Battery")) thePart = part;
            }

            OutsourcedPart os3 = new OutsourcedPart();
            os3.setCompanyName("Michelin Pilot Sport");
            os3.setName("Summer Pilot Sport Tires");
            os3.setInv(20);
            os3.setPrice(329.50);
            os3.setId(1003);
            outsourcedPartRepository.save(os3);
            thePart = null;
            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Summer Pilot Sport Tires")) thePart = part;
            }


            InhousePart ip1 = new InhousePart();
            ip1.setName("Brake Pads");
            ip1.setId(1001);
            ip1.setPrice(125.00);
            ip1.setInv(100);
            inhousePartRepository.save(ip1);
            InhousePart inPart = null;
            List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
                if (part.getName().equals("out test")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());


            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }


            Product bicycle = new Product("bicycle", 100.0, 15);
            Product unicycle = new Product("unicycle", 100.0, 15);
            productRepository.save(bicycle);
            productRepository.save(unicycle);


            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());
        }
    }
}
