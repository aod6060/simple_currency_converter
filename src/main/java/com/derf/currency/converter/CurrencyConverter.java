package com.derf.currency.converter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class CurrencyConverter {
	// FIXER.IO api for currency... Very useful api to play with...
	private final static String LOCATION = "http://api.fixer.io/latest?base=USD";
	
	private CurrencyAPI api = null;
	private Map<String, Double> currencyRates = null;
	
	
	public void init() {
		// Create URL 
		try {
			URL url = new URL(CurrencyConverter.LOCATION);
			JsonReader reader = new JsonReader(new InputStreamReader(url.openStream()));
			Gson gson = new Gson();
			this.api = gson.fromJson(reader, CurrencyAPI.class);
			this.currencyRates = this.api.getRates().toMap();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double convert(String from, String to, double amount) {
		double F = this.currencyRates.get(from);
		double T = this.currencyRates.get(to);
		return (T / F) * amount;
	}

	public CurrencyAPI getApi() {
		return api;
	}

	public Map<String, Double> getCurrencyMap() {
		return new HashMap<>(currencyRates);
	}
	
	public List<String> getCurrencyNames() {
		return this.currencyRates.keySet().stream().collect(Collectors.toList());
	}
	
	public List<Double> getCurrencyRates() {
		return this.currencyRates.values().stream().collect(Collectors.toList());
	}
}
