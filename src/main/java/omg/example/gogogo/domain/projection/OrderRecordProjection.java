package omg.example.gogogo.domain.projection;

import omg.example.gogogo.domain.OrderRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.Instant;

@Projection(name = "expand", types = OrderRecord.class)
public interface OrderRecordProjection {
    Instant getCreatedDate();

    @Value("#{target.status} ---- #{target.description} ;))))")
    String getInfo();
}
