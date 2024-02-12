package portfolio.StockMarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.StockMarket.services.StockServiceImpl;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockServiceImpl stockService ;

    @GetMapping("/nifty50")
    public ResponseEntity<?> getNifty50(){
        return ResponseEntity.ok(stockService.getNifty50Stocks());
    }
}
