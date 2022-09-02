package com.money.exchangewebflux.service;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.money.exchangewebflux.model.MoneyConvertor;

import reactor.core.publisher.Mono;

@Service
public class MoneyConvertorWebFluxService {

	
	WebClient webClient;
	//private static final String TYPE = "application/json";
	private static final String BASE_URL = "http://localhost:9191/api";
	
	@PostConstruct
    public void init() {
        webClient = WebClient.builder().baseUrl(BASE_URL)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
    }
	
	
	public Mono<MoneyConvertor> getMoneyConversionDetailByFromAndTo(String from, String to) {

		return webClient.get()
				.uri(uriBuilder -> uriBuilder.path("/currencyconversiondetail").queryParam("from", from).queryParam("to", to).build())
				.retrieve().bodyToMono(MoneyConvertor.class);

	}

}
