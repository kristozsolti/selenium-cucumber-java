package com.mylibrary.testframework.testutils.pojo;

import java.util.Map;

public class Report {

	// feature name and duration
	private Map<String, Double> feature;
	// scenario name and duration
	private Map<String, Double> scenario;
	// private Double featureDuration;
	// private Double scenarionDuration;
	private Double totalDuration;

	public Report() {
	}

	public Report(Map<String, Double> feature, Map<String, Double> scenario, Double totalDuration) {
		super();
		this.feature = feature;
		this.scenario = scenario;
		// this.featureDuration = featureDuration;
		// this.scenarionDuration = scenarionDuration;
		this.totalDuration = totalDuration;
	}

	public Map<String, Double> getFeature() {
		return feature;
	}

	public void setFeature(Map<String, Double> feature) {
		this.feature = feature;
	}

	public Map<String, Double> getScenario() {
		return scenario;
	}

	public void setScenario(Map<String, Double> scenario) {
		this.scenario = scenario;
	}

	public Double getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Double totalDuration) {
		this.totalDuration = totalDuration;
	}

	@Override
	public String toString() {
		return "Report [feature=" + feature + ", scenario=" + scenario + ", totalDuration=" + totalDuration + "]";
	}

}
