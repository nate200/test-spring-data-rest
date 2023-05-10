package omg.example.gogogo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "ORDER_RECORD")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRecord {

    @Id
    private String orderId;

    private String status;

    private String description;

    private Instant createdDate;

    private Instant updatedDate;

}