package com.mylibrary.testframework.testutils;

import java.util.ArrayList;
import java.util.List;

import com.mylibrary.testframework.testutils.pojo.SimpleReport;
import com.mylibrary.testframework.testutils.utils.FileUtils;
import com.mylibrary.testframework.testutils.utils.ReportUtil;

public class RunTestAverageMaker {

	public static void main(String[] args) {
		List<List<SimpleReport>> chromeNaiveSimpleReports = new ArrayList<>();

		String reportFolderPath = "C:\\Users\\krist\\Desktop\\Disszertáció\\project\\test-framework\\selenium-cucumber-java\\report\\";
		String reportFileName = "firefox-optimized-results";
		String fileExtension = ".csv";
		String csvFileName = reportFileName + "-avg";

		// Read the report files and store their lines in array
		System.out.println("Reading file: ");
		for (int i = 1; i <= 20; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(".");
			}
			System.out.print(" " + i);
			String filePath = reportFolderPath + reportFileName + i + fileExtension;
			chromeNaiveSimpleReports.add(ReportUtil.readReportsFromCSV(i, filePath));
		}
		System.out.println("");

		// make an average of duplicated scenario steps
		List<SimpleReport> reports = ReportUtil.createAverageFromReadedScenarioSteps(chromeNaiveSimpleReports);

		// reports.sort((r1,r2) -> r1.getFeature().compareTo(r2.getFeature()));

		// merge and average the time of scenarios into one report file
		List<SimpleReport> avgSimpleReport = ReportUtil.createAverageReport(reports);

		// avgSimpleReport.sort((r1,r2) -> r1.getFeature().compareTo(r2.getFeature()));

		String reportsPath = reportFolderPath + csvFileName + fileExtension;
		// save average report to csv file
		FileUtils.writeAvgReportsToFile(reportsPath, avgSimpleReport);
	}

}
