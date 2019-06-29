package com.mylibrary.testframework.testutils.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.mylibrary.testframework.testutils.pojo.Report;
import com.mylibrary.testframework.testutils.pojo.SimpleReport;

public class ReportUtil {

	public static List<SimpleReport> readReportsFromCSV(int iterationNumber, String filePath) {
//		List<Report> reports = new ArrayList<>();
		List<SimpleReport> reports = new ArrayList<>();

		Path pathToFile = Paths.get(filePath);

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

			// read the first line from the text file
			String line = br.readLine();

			// loop until all lines are read
			while (line != null) {

				String[] attributes = line.split(",");

//				Report report = createReport(attributes);
				SimpleReport report = createSimpleReport(attributes);
				reports.add(report);

				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return reports;
	}

	public static Report createReport(String[] metadata) {
		if (metadata[0].equals("\"Feature\"")) {
			return null;
		}

		String feature = metadata[0].replaceAll("\"", "");
		String scenario = metadata[1].replaceAll("\"", "");
		String scenarioDuration = metadata[2].replaceAll("\"", "");
		String featureDuration = metadata[3].replaceAll("\"", "");
		String totalDuration = metadata[4].replaceAll("\"", "");

		Map<String, Double> featureMap = new HashMap<>();
		featureMap.put(feature, Double.parseDouble(featureDuration));

		Map<String, Double> scenarioMap = new HashMap<>();
		scenarioMap.put(scenario, Double.parseDouble(scenarioDuration));

		// create and return book of this metadata
		return new Report(featureMap, scenarioMap, Double.parseDouble(totalDuration));
	}

	public static SimpleReport createSimpleReport(String[] metadata) {
		if (metadata[0].equals("\"Feature\"")) {
			return null;
		}

		String feature = metadata[0].replaceAll("\"", "");
		String scenario = metadata[1].replaceAll("\"", "");
		String scenarioDuration = metadata[2].replaceAll("\"", "");
		String featureDuration = metadata[3].replaceAll("\"", "");
		String totalDuration = metadata[4].replaceAll("\"", "");

		return new SimpleReport(feature, scenario, Double.parseDouble(scenarioDuration),
				Double.parseDouble(featureDuration), Double.parseDouble(totalDuration));
	}

	public static List<SimpleReport> createAverageFromReadedScenarioSteps(List<List<SimpleReport>> readedReports) {
		List<SimpleReport> averageReports = new ArrayList<>();

		Double scenarioAvgDuration = (double) 0;
		int divideCount = 1;

		System.out.println("Make an average of duplicated scenario steps.");
		// iterate list
		for (List<SimpleReport> reports : readedReports) {
			// iterate through reportList
			SimpleReport nextReport = null;
			SimpleReport prevReport = null;
			for (int i = 0; i < reports.size(); i++) {
				SimpleReport currentReport = reports.get(i);

				if (currentReport == null) {
					continue;
				}

				String feature = currentReport.getFeature();
				String scenario = currentReport.getScenario();
				Double scenarioDuration = currentReport.getScenarioDuration();
				Double featureDuration = currentReport.getFeatureDuration();
				Double totalDuration = currentReport.getTotalDuration();

				if (i < reports.size() - 1) {
					nextReport = reports.get(i + 1);
				} else {
					nextReport = null;
				}

				if (i > 1) {
					prevReport = reports.get(i - 1);
				}

				boolean isNextScenarioTheSame = nextReport != null
						&& nextReport.getScenario().equals(currentReport.getScenario());

				if (isNextScenarioTheSame) {
					scenarioAvgDuration += scenarioDuration;
					divideCount++;
					continue;
				} else if (!isNextScenarioTheSame && prevReport != null
						&& prevReport.getScenario().equals(currentReport.getScenario())) {
					scenarioAvgDuration += scenarioDuration;
					averageReports.add(new SimpleReport(feature, scenario, (scenarioAvgDuration / divideCount),
							featureDuration, totalDuration));
				} else {
					scenarioAvgDuration = scenarioDuration;
					divideCount = 1;

					averageReports.add(new SimpleReport(feature, scenario, (scenarioAvgDuration / divideCount),
							featureDuration, totalDuration));
				}

				scenarioAvgDuration = (double) 0;
				divideCount = 1;
			}
		}

		return averageReports;
	}

	public static List<SimpleReport> createAverageReport(List<SimpleReport> paramReports) {
		List<SimpleReport> averageReports = new ArrayList<>();
		List<SimpleReport> sameFeatures = new ArrayList<>();
		List<SimpleReport> sameScenarios = new ArrayList<>();

		Map<String, String> features = new LinkedHashMap<>();

		System.out.println("Merge and average the time of scenarios into one report file");
		
		for (SimpleReport report : paramReports) {
			if (!features.containsValue(report.getScenario())) {
				features.put(report.getScenario(), report.getFeature());
			}
		}

		// loop through scenario names
		for (String scenarioName : features.keySet()) {

			SimpleReport currentReport = null;
			Double scenarioAvg = (double) 0;
			Double featureAvg = (double) 0;
			Double scenarioTotal = (double) 0;
			Double featureTotal = (double) 0;

			// loop through reports
			for (SimpleReport report : paramReports) {

				// if the report contains the scenarioName
				if (report.getScenario().equals(scenarioName)) {
					scenarioTotal += report.getScenarioDuration();
					sameScenarios.add(report);
					currentReport = report;
				}

				// if report contains featureName
				if (report.getFeature().equals(features.get(scenarioName))) {
					featureTotal += report.getFeatureDuration();
					sameFeatures.add(report);
				}
			}
			scenarioAvg = scenarioTotal / sameScenarios.size();
			featureAvg = featureTotal / sameFeatures.size();

			averageReports.add(new SimpleReport(currentReport.getFeature(), currentReport.getScenario(), scenarioAvg,
					featureAvg, currentReport.getTotalDuration()));

			sameFeatures.clear();
			sameScenarios.clear();

		}

		return averageReports;
	}

}
