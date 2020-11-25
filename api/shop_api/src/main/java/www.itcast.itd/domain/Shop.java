package www.itcast.itd.domain;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Builder
@Accessors(chain = true)
public class Shop implements Serializable {
    private String id;
    private String shopName;
}
