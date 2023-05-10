package omg.example.gogogo.controller;

import omg.example.gogogo.domain.OrderRecord;
import omg.example.gogogo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    OrderRepository orderRepo;

    @PostMapping("/order/search/advance")
    public List<OrderRecord> claimSupportTicket(@RequestBody OrderRecord orderSearch) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreNullValues().withIgnoreCase();
        return orderRepo.findAll(Example.of(orderSearch, exampleMatcher));
    }
}
