package com.mylibrary.testframework.testutils.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.mylibrary.testframework.testutils.pojo.SimpleReport;
import com.opencsv.CSVWriter;

public class FileUtils {

	public static void writeAvgReportsToFile(String filePath, List<SimpleReport> avgSimpleReports) {
		String csvFile = filePath;
		File file = new File(csvFile);

		System.out.println("WRITE AVG RESULTS TO FILE -> " + filePath);

		try {

			FileWriter outputfile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputfile);

			String[] header = { "Feature", "Scenario", "Scenario Duration", "Feature Duration", "Total Duration" };
			writer.writeNext(header);

			for (SimpleReport report : avgSimpleReports) {

				String feature = report.getFeature();
				String scenario = report.getScenario();
				String scenarioDuration = report.getScenarioDuration().toString();
				String featureDuration = report.getFeatureDuration().toString();
				Double totalDuration = report.getTotalDuration();

				String[] values = { feature, scenario, scenarioDuration.toString(), featureDuration.toString(),
						totalDuration.toString() };

				writer.writeNext(values);
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e);
		}

	}

}
