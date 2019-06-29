package com.mylibrary.testframework.testutils.pojo;

public class SimpleReport {

	private String feature;
	private String scenario;
	private Double scenarioDuration;
	private Double featureDuration;
	private Double totalDuration;

	public SimpleReport() {}
	
	public SimpleReport(String feature, String scenario, Double scenarioDuration, Double featureDuration,
			Double totalDuration) {
		super();
		this.feature = feature;
		this.scenario = scenario;
		this.scenarioDuration = scenarioDuration;
		this.featureDuration = featureDuration;
		this.totalDuration = totalDuration;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public Double getScenarioDuration() {
		return scenarioDuration;
	}

	public void setScenarioDuration(Double scenarioDuration) {
		this.scenarioDuration = scenarioDuration;
	}

	public Double getFeatureDuration() {
		return featureDuration;
	}

	public void setFeatureDuration(Double featureDuration) {
		this.featureDuration = featureDuration;
	}

	public Double getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Double totalDuration) {
		this.totalDuration = totalDuration;
	}

	@Override
	public String toString() {
		return "SimpleReport [feature=" + feature + ", scenario=" + scenario + ", scenarioDuration=" + scenarioDuration
				+ ", featureDuration=" + featureDuration + ", totalDuration=" + totalDuration + "]";
	}
	
}
