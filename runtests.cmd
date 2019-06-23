for /l %%x in (1, 1, 100) do (

    echo -------------------------------------------------------------------
    echo RUNNING TESTS / ITERATION %%x
    echo -------------------------------------------------------------------

    rem Run Maven command to run the tests
    mvn test

    rem Copy test results so results folder
    copy .\target\cucumber-results.xml .\report\junit-results%%x.xml
    copy .\target\surefire-reports\TEST-testrunner.TestRunner.xml .\report\surefire-results%%x.xml

    echo -------------------------------------------------------------------
    echo FINISHED RUNNING / ITERATION %%x
    echo -------------------------------------------------------------------
)