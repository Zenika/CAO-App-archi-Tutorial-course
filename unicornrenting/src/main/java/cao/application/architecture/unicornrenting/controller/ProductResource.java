package cao.application.architecture.unicornrenting.controller;

import cao.application.architecture.unicornrenting.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/api")
public class ProductResource {

    @Inject
    private ProductRepository productRepository;

    @GetMapping("produits")
    public ResponseEntity getProducts() {
        return ResponseEntity.ok(productRepository.findAll());
    }
}
