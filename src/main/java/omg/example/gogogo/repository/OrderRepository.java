package omg.example.gogogo.repository;

import omg.example.gogogo.domain.OrderRecord;
import omg.example.gogogo.domain.projection.OrderRecordProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "order", path = "order", excerptProjection = OrderRecordProjection.class)
public interface OrderRepository extends JpaRepository<OrderRecord, String> {
    @Override
    @RestResource(exported = false)
    void deleteById(String id);

    /*@Override
    @RestResource(exported = false)
    OrderRecord save(OrderRecord orderRecord);*/

    @RestResource(path = "status", rel = "demo1")
    List<OrderRecord> findByStatus(String status);
}