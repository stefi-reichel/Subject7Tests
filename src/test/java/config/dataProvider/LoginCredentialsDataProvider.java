package config.dataProvider;

import org.testng.annotations.DataProvider;

public class LoginCredentialsDataProvider {
        @DataProvider(name = "user")
        public static Object[][] fetchData1() throws Exception {
            return new Object[][]{{"estefania.reichel@buzzfeed.com"}};
        }

        @DataProvider(name = "pass")
        public static Object[][] fetchData2() throws Exception {
            return new Object[][]{{"automationBF"}};
        }

    }
