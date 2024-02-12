package portfolio.StockMarket.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nifty50StockKey {
        private String symbol;
    private String identifier;
//    private BigDecimal open;
//    private BigDecimal dayHigh;
//    private BigDecimal dayLow;
//    private BigDecimal lastPrice;
//    private BigDecimal previousClose;
//    private BigDecimal change;
//    private BigDecimal pChange;
//    private BigDecimal yearHigh;
//    private BigDecimal yearLow;
//    private long totalTradedVolume;
//    private BigDecimal totalTradedValue;

//    @JsonFormat(pattern = "dd-MMM-yyyy HH:mm:ss")
//    private Date lastUpdateTime;

//    private BigDecimal perChange365d;
//    private BigDecimal perChange30d;
}
