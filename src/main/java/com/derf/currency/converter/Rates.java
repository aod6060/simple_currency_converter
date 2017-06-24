package com.derf.currency.converter;

import java.util.HashMap;
import java.util.Map;

public class Rates {
	private double AUD;
	private double BGN;
	private double BRL;
	private double CAD;
	private double CHF;
	private double CNY;
	private double CZK;
	private double DKK;
	private double GBP;
	private double HKD;
	private double HRK;
	private double HUF;
	private double IDR;
	private double ILS;
	private double INR;
	private double JPY;
	private double KRW;
	private double MXN;
	private double MYR;
	private double NOK;
	private double NZD;
	private double PHP;
	private double PLN;
	private double RON;
	private double RUB;
	private double SEK;
	private double SGD;
	private double THB;
	private double TRY;
	private double ZAR;
	private double EUR;
	
	public Rates() {}
	
	public double getAUD() {
		return AUD;
	}
	
	public void setAUD(double aUD) {
		AUD = aUD;
	}
	
	public double getBGN() {
		return BGN;
	}
	
	public void setBGN(double bGN) {
		BGN = bGN;
	}
	
	public double getBRL() {
		return BRL;
	}
	
	public void setBRL(double bRL) {
		BRL = bRL;
	}
	
	public double getCAD() {
		return CAD;
	}
	
	public void setCAD(double cAD) {
		CAD = cAD;
	}
	
	public double getCHF() {
		return CHF;
	}
	
	public void setCHF(double cHF) {
		CHF = cHF;
	}
	
	public double getCNY() {
		return CNY;
	}
	
	public void setCNY(double cNY) {
		CNY = cNY;
	}
	
	public double getCZK() {
		return CZK;
	}
	
	public void setCZK(double cZK) {
		CZK = cZK;
	}
	
	public double getDKK() {
		return DKK;
	}
	
	public void setDKK(double dKK) {
		DKK = dKK;
	}
	
	public double getGBP() {
		return GBP;
	}
	
	public void setGBP(double gBP) {
		GBP = gBP;
	}
	
	public double getHKD() {
		return HKD;
	}
	
	public void setHKD(double hKD) {
		HKD = hKD;
	}
	
	public double getHRK() {
		return HRK;
	}
	
	public void setHRK(double hRK) {
		HRK = hRK;
	}
	
	public double getHUF() {
		return HUF;
	}
	
	public void setHUF(double hUF) {
		HUF = hUF;
	}
	
	public double getIDR() {
		return IDR;
	}
	
	public void setIDR(double iDR) {
		IDR = iDR;
	}
	
	public double getILS() {
		return ILS;
	}
	
	public void setILS(double iLS) {
		ILS = iLS;
	}
	
	public double getINR() {
		return INR;
	}
	
	public void setINR(double iNR) {
		INR = iNR;
	}
	
	public double getJPY() {
		return JPY;
	}
	
	public void setJPY(double jPY) {
		JPY = jPY;
	}
	
	public double getKRW() {
		return KRW;
	}
	
	public void setKRW(double kRW) {
		KRW = kRW;
	}
	
	public double getMXN() {
		return MXN;
	}
	
	public void setMXN(double mXN) {
		MXN = mXN;
	}
	
	public double getMYR() {
		return MYR;
	}
	
	public void setMYR(double mYR) {
		MYR = mYR;
	}
	
	public double getNOK() {
		return NOK;
	}
	
	public void setNOK(double nOK) {
		NOK = nOK;
	}
	
	public double getNZD() {
		return NZD;
	}
	
	public void setNZD(double nZD) {
		NZD = nZD;
	}
	
	public double getPHP() {
		return PHP;
	}
	
	public void setPHP(double pHP) {
		PHP = pHP;
	}
	
	public double getPLN() {
		return PLN;
	}
	
	public void setPLN(double pLN) {
		PLN = pLN;
	}
	
	public double getRON() {
		return RON;
	}
	
	public void setRON(double rON) {
		RON = rON;
	}
	
	public double getRUB() {
		return RUB;
	}
	
	public void setRUB(double rUB) {
		RUB = rUB;
	}
	
	public double getSEK() {
		return SEK;
	}
	
	public void setSEK(double sEK) {
		SEK = sEK;
	}
	
	public double getSGD() {
		return SGD;
	}
	
	public void setSGD(double sGD) {
		SGD = sGD;
	}
	
	public double getTHB() {
		return THB;
	}
	
	public void setTHB(double tHB) {
		THB = tHB;
	}
	
	public double getTRY() {
		return TRY;
	}
	
	public void setTRY(double tRY) {
		TRY = tRY;
	}
	
	public double getZAR() {
		return ZAR;
	}
	
	public void setZAR(double zAR) {
		ZAR = zAR;
	}
	
	public double getEUR() {
		return EUR;
	}
	
	public void setEUR(double eUR) {
		EUR = eUR;
	}
	
	public Map<String, Double> toMap() {
		Map<String, Double> temp = new HashMap<>();
		
		temp.put("aud", this.getAUD());
		temp.put("bgn", this.getBGN());
		temp.put("brl", this.getBRL());
		temp.put("cad", this.getCAD());
		temp.put("chf", this.getCHF());
		temp.put("cny", this.getCNY());
		temp.put("czk", this.getCZK());
		temp.put("dkk", this.getDKK());
		temp.put("gbp", this.getGBP());
		temp.put("hkd", this.getHKD());
		temp.put("huf", this.getHUF());
		temp.put("idr", this.getIDR());
		temp.put("ils", this.getILS());
		temp.put("inr", this.getINR());
		temp.put("jpy", this.getJPY());
		temp.put("krw", this.getKRW());
		temp.put("mxn", this.getMXN());
		temp.put("myr", this.getMYR());
		temp.put("nok", this.getNOK());
		temp.put("nzd", this.getNZD());
		temp.put("php", this.getPHP());
		temp.put("pln", this.getPLN());
		temp.put("ron", this.getRON());
		temp.put("rub", this.getRUB());
		temp.put("sek", this.getSEK());
		temp.put("sgd", this.getSGD());
		temp.put("thb", this.getTHB());
		temp.put("try", this.getTRY());
		temp.put("zar", this.getZAR());
		temp.put("eur", this.getEUR());
		temp.put("usd", 1.0);
		
		
		return temp;
	}
}
