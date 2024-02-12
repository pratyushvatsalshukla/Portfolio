package portfolio.StockMarket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import portfolio.StockMarket.entity.Nifty50;

@Service
public class StockServiceImpl implements StockService{
    private final String X_RAPIDAPI_KEY = "c1291b578fmsh967b05595501b61p16c23bjsnf291302d87a7";
    private final String X_RAPIDAPI_HOST = "latest-stock-price.p.rapidapi.com";
    private final String NIFTY_50_URL= "https://latest-stock-price.p.rapidapi.com/price?Indices=NIFTY%2050" ;

    @Autowired
    RestTemplate  restTemplate = new RestTemplate();

    @Override
    public Nifty50 getNifty50Stocks() {
        Nifty50 response = restTemplate.exchange(NIFTY_50_URL, HttpMethod.GET, getEntity(), Nifty50.class).getBody();
        return response;
    }

    private HttpEntity<?> getEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", X_RAPIDAPI_KEY);
        headers.set("X-RapidAPI-Host", X_RAPIDAPI_HOST);
        headers.set("ACCEPT", MediaType.APPLICATION_JSON_VALUE) ;
        return new HttpEntity<>(headers);
    }
}
