package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "computerConfigs")
    public Object[][] getComputerConfigs() {
        Object[][] data =new Object[][] {
                {"2.2 GHz Intel Pentium Dual-Core E2200", "3","320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4","400 GB [+$100.00]", "Vista Premium [+$60.00]", "Acrobat Reader [+$10.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "5","320 GB", "Vista Home [+$50.00]", "Total Commander [+$5.00]"}
        };
        return data;
    }
}
