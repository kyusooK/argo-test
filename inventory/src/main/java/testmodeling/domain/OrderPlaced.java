package testmodeling.domain;

import java.util.*;
import lombok.*;
import testmodeling.domain.*;
import testmodeling.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private String productId;
}
