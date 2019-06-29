for /l %%x in (1, 1, 20) do (

    echo -------------------------------------------------------------------
    echo RUNNING TESTS / ITERATION %%x
    echo -------------------------------------------------------------------

    rem Run Maven command to run the tests
    mvn test

    rem Copy test results so results folder
    copy .\target\cucumber-report\cucumber.json .\report\junit-results%%x.json
    rem copy .\target\surefire-reports\TEST-testrunner.TestRunner.xml .\report\surefire-results%%x.xml


    mvn cluecumber-report:reporting

    rem Copy test results so results folder
    copy C:\Users\krist\Desktop\report.csv .\report\firefox-naiv-results%%x.csv


    echo -------------------------------------------------------------------
    echo FINISHED RUNNING / ITERATION %%x
    echo -------------------------------------------------------------------
)